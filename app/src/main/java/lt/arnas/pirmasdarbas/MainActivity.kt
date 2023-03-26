package lt.arnas.pirmasdarbas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

val TAG = "my_epic_tag"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doSumOfMaxValues()
    }

    fun doSumOfMaxValues() {
//    Priskirkite max vertes kintamiesiems
        var maxByte: Byte = Byte.MAX_VALUE
        var maxShort: Short = Short.MAX_VALUE
        var maxInt: Int = Int.MAX_VALUE
        var maxLong: Long = Long.MAX_VALUE

        Log.i(
            TAG, "maxByte: $maxByte, maxShort: $maxShort, maxInt: $maxInt" +
                    ", maxLong: $maxLong"
             )
    }
}