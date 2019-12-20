package yasuhiroki.androidweekreference

import android.app.Application
import android.content.Context
import android.util.Log
import java.lang.ref.WeakReference

class MyApplication : Application() {

    // ActivityよりLifecycleの長いインスタンスでActivityを保持させる
    private val useCases = mutableListOf<UseCase>()

    fun executeUseCase(contextRef: WeakReference<Context>) {
        Log.d("TAG", "useCases.size: ${useCases.size}")
        useCases.add(UseCase(contextRef, useCases.size))
        useCases.forEach { it.execute() }
    }
}
