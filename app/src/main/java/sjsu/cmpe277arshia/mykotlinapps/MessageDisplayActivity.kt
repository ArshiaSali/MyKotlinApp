package sjsu.cmpe277arshia.mykotlinapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message_display.*

class MessageDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_display)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        messagetextview.apply {
            text = message
        }
    }
}