package yasuhiroki.androidweekreference

import android.content.Context
import android.util.Log
import java.lang.ref.WeakReference

class UseCase (private val contextRef: WeakReference<Context>, private val num: Int) {
    fun execute() {
        if (contextRef.get() != null) {
            Log.d("TAG", "${num}: ${contextRef.get()!!.packageName}")
        }
    }
}
