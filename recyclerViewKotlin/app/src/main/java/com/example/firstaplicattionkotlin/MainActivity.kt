package com.example.firstaplicattionkotlin

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var carList= mutableListOf<Car>()
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initCarList()
        viewManager = LinearLayoutManager(this)
        viewAdapter = CarAdapter(carList, {
            toast("click en:" +it.getModel(),Toast.LENGTH_SHORT)
        })

        recyclerView = findViewById<RecyclerView>(R.id.recyclerCoches).apply {

            setHasFixedSize(true)


            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
        }


    }

    public fun initCarList(){
        for (it in 0..5){
            val car_aux=Car("seat"+ it.toString(), 20)
            carList.add(car_aux)
        }
    }

    fun Activity.toast(  message: String,  duration : Int){
        Toast.makeText(this, message, duration).show()
    }
}