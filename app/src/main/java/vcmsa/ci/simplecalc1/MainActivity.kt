package vcmsa.ci.simplecalc1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
class MainActivity : AppCompatActivity() {
    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide: Button
    lateinit var tvDisplay: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        tvDisplay = findViewById(R.id.tvDisplay)
        // Set onClick listeners for each button
        btnAdd.setOnClickListener {calcAdd()}
        btnSubtract.setOnClickListener {calcSubtract()}
        btnMultiply.setOnClickListener { calcMultiply()}
        btnDivide.setOnClickListener {calcDivide()}

        /*
        btnAdd.setOnClickListener{ performOperation("add") }
        btnSubtract.setOnClickListener{ performOperation("subtract") }
        btnMultiply.setOnClickListener{ performOperation("multiply") }
        btnDivide.setOnClickListener{ performOperation("divide") }
         */
    }

    private fun performOperation(strOperation: string) {
        val dblNum1 = etNum1.text.toString().toDoubleOrNull()
        val dblNum2 = etNum2.text.toString().toDoubleOrNull()
        var dblResult: Double

         if (dblNum1 != null && dblNum2 != null){
            if (strOperation == "add"){
                     dblResult = dblNum1 + dblNum2
            }
             if (strOperation == "subtract"){
                     dblResult = dblNum1 - dblNum2
             }
             if (strOperation == "multiply"){
                     dblResult = dblNum1 * dblNum2
             }
             if (strOperation == "divide"){
                     if (dblNum2 != 0.0) {
                         dblResult = dblNum1 / dblNum2
                     } else {
                             tvDisplay.text = "Cannot divide by zero "


                     }
             }
             private fun performOperation2(strOperation: string) {
                 val dblNum1 = etNum1.text.toString().toDoubleOrNull()
                 val dblNum2 = etNum2.text.toString().toDoubleOrNull()

                 if (dblNum1 != null && dblNum2 != null) {
                     val dblResult = when (strOperation) {
                         "add" -> dblNum1 + dblNum2
                         "subtract" -> dblNum1 - dblNum2
                         "multiply" -> dblNum1 * dblNum2
                         "divide" -> if (dblNum2 != 0.0) dblNum1 / dblNum2 else null
                         else -> null

                     }
                     tvDisplay.text = dblResult.toString()
                 } else {
                     tvDisplay.text = "Invalid Input"

                 }
                 }
                 }
             }
    private fun calcAdd() {
        // retrieve user input
        val dblNum1 = etNum1.text.toString().toDouble()
        val dblNum2 = etNum2.text.toString().toDouble()
        var dblResult: Double
        dblResult = dblNum1 + dblNum2
        tvDisplay.text = dblResult.toString()



    private fun calcSubtract(){

        // retrieve user input

        val dblNum1 = etNum1.text.toString().toDouble()

        val dblNum2 = etNum2.text.toString().toDouble()

        var dblResult: Double

        dblResult = dblNum1 - dblNum2

        tvDisplay.text = dblResult.toString()


    }

    private fun calcMultiply(){

        // retrieve user input

        val dblNum1 = etNum1.text.toString().toDouble()

        val dblNum2 = etNum2.text.toString().toDouble()

        var dblResult: Double

        dblResult = dblNum1 * dblNum2

        tvDisplay.text = dblResult.toString()


    }

    private fun calcDivide(){
        // retrieve user input
        val dblNum1 = etNum1.text.toString().toDoubleOrNull()
        val dblNum2 = etNum2.text.toString().toDoubleOrNull()
        var dblResult: Double
        dblResult = dblNum1 / dblNum2
        tvDisplay.text = dblResult.toString()


    }

}

