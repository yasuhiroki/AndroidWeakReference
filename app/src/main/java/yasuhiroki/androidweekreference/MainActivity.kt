package yasuhiroki.androidweekreference

import android.graphics.Bitmap
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap
import java.lang.ref.WeakReference

class MainActivity : AppCompatActivity() {

    // Activity に大きなサイズのメモリーを保持させるための Bitmap
    private var bitmap: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bitmap = resources.getDrawable(R.drawable.image).toBitmap()

        (application as MyApplication).also {
            it.executeUseCase(WeakReference(this))
        }

    }
}
