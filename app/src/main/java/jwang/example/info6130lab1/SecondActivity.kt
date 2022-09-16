package jwang.example.info6130lab1

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity



class SecondActivity : AppCompatActivity() {

    var date = ""
    var assignmentName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}