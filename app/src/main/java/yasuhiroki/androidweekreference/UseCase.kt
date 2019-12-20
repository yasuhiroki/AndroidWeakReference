package yasuhiroki.androidweekreference

import android.content.Context
import android.util.Log
import java.lang.ref.WeakReference

interface UseCase {
    fun execute()
}

class UseCase1 (private val contextRef: WeakReference<Context>, private val num: Int) : UseCase {
    override fun execute() {
        if (contextRef.get() != null) {
            Log.d("TAG", "${num}: ${contextRef.get()!!.packageName}")
        }
    }
}

class UseCase2 (private val context: Context, private val num: Int) : UseCase {
    override fun execute() {
        Log.d("TAG", "${num}: ${context.packageName}")
    }
}
