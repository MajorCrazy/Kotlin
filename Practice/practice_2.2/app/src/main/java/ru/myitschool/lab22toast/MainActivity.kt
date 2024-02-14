package ru.myitschool.lab22toast

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.myitschool.lab22toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    var RotationCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            RotationCount = savedInstanceState.getInt("RotationCount")
        }
        if (RotationCount > 0 && RotationCount % 2 == 0) {
            Toast.makeText(this, R.string.ndestroy, Toast.LENGTH_LONG).show()
            Toast.makeText(this, R.string.ncreate, Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, R.string.ncreate, Toast.LENGTH_LONG).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, R.string.nstart, Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, R.string.nresume, Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState : Bundle) {
        super.onSaveInstanceState(outState)
        RotationCount += 1
        outState.putInt("RotationCount", RotationCount)
    }
}
