package com.cherish.class1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = stringFromJNI()
        atv_text.text = contentFromJNI()
        atv_text2.text=practiceFromJNI()
        atv_text3.text=practiceFromJNI2()
        atv_text3.text=practiceFromJNI3()

        val myIntentService = MyIntentService()
        val intent=Intent(this,myIntentService.javaClass)
        startService(intent)



    }

    external fun practiceFromJNI3(): String

    external fun practiceFromJNI2(): String

    /**
     * native 方法
     */
    external fun practiceFromJNI(): String

    external fun contentFromJNI(): String

   external fun contentFromJNI3(): String

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

 /*   companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("demojni")
        }
    }*/
}
