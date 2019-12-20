package yasuhiroki.androidweekreference

import android.app.Application
import android.content.Context
import android.util.Log

class MyApplication : Application() {

    // ActivityよりLifecycleの長いインスタンスでActivityを保持させる
    private val useCases = mutableListOf<UseCase>()

    fun executeUseCase1(context: Context) {
        Log.d("TAG", "useCases.size: ${useCases.size}")
        useCases.add(UseCase1(context, useCases.size))
        useCases.forEach { it.execute() }
    }

    fun executeUseCase2(context: Context) {
        Log.d("TAG", "useCases.size: ${useCases.size}")
        useCases.add(UseCase2(context, useCases.size))
        useCases.forEach { it.execute() }
    }
}
