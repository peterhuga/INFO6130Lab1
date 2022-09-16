package jwang.example.info6130lab1

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.text.SimpleDateFormat
import java.util.*

const val TAG = "Jianwei"
private var date: String = ""

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View) {
        when(view.id){
            R.id.buttonShowItems -> {
                Log.d(TAG, "showItem button pressed.")
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
            R.id.buttonSetDate -> {
                Log.d(TAG, "setDate button pressed.")
                var cal = Calendar.getInstance()
                val dateSetListener = DatePickerDialog.OnDateSetListener {
                        view, year, monthOfYear, dayOfMonth ->
                    cal.set(Calendar.YEAR, year)
                    cal.set(Calendar.MONTH, monthOfYear)
                    cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                    val myFormat = "dd.MM.yyyy"
                    val sdf = SimpleDateFormat(myFormat, Locale.CANADA)
                    date = sdf.format(cal.time)
                    Log.d(TAG, "selected date is $date")
                }
                DatePickerDialog(this@MainActivity, dateSetListener,
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
            }
            R.id.buttonAddItem -> {
                Log.d(TAG, "add button pressed.")

            }
        }
    }
}