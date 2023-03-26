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
        charTypes()
        symbolId()
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

//        Sudėkite visų, aukščiau uždeklaruotų, sveikų skaičių reiksmes ir gauta
//        rezultatą priskirkite naujam kintamajam pavadinimu 'suma'

        var suma = maxByte + maxShort + maxInt + maxLong

        Log.i(TAG, "Sum of max values: $suma")
    }

    fun charTypes() {
//      Sukurkti du Char tipo kintamuosius ir priskirti reikšmes: 88, %
        var exampleChar1: Char = 88.toChar()
        var exampleChar2: Char = '%'

        Log.i(TAG, "char1: $exampleChar1, char2: $exampleChar2")
    }

    fun symbolId() {
//      Nustatykite '*' simbolio id
        var mySymbol = '*'

        Log.i(TAG, "symbolId: ${mySymbol.code}")
    }
}