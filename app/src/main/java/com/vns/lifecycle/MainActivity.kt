package com.vns.lifecycle
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "LifecycleDemo"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")
//        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show()
        android.widget.Toast.makeText(this,"OnCreate", android.widget.Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
//        Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show()
        android.widget.Toast.makeText(this,"OnStart", android.widget.Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
//        Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show()
        android.widget.Toast.makeText(this,"onResume", android.widget.Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
//        Toast.makeText(this,"OnCreate", Toast.LENGTH_SHORT).show()
        android.widget.Toast.makeText(this,"OnPause", android.widget.Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
        android.widget.Toast.makeText(this,"Stop", android.widget.Toast.LENGTH_SHORT).show()

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
        android.widget.Toast.makeText(this,"OnRestart", android.widget.Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
        android.widget.Toast.makeText(this,"OnDestroy", android.widget.Toast.LENGTH_SHORT).show()
    }
}
