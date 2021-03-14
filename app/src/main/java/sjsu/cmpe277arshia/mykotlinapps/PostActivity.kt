package sjsu.cmpe277arshia.mykotlinapps

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_post.*

const val EXTRA_MESSAGE = "sjsu.cmpearshia.MyKotlinApp.MESSAGE"

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
    }

    fun sendMessage(view: View){
        Toast.makeText(this,"Button Clicked", Toast.LENGTH_LONG).show()
        val newMessage = nametextfield.text.toString()
        val intent = Intent(this, MessageDisplayActivity::class.java).apply{
            putExtra(EXTRA_MESSAGE, newMessage)
        }
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            Toast.makeText(this,"Activity Result received", Toast.LENGTH_LONG).show()
        }
    }
}