package com.example.firstaplicattionkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_car.view.*

class CarAdapter (val item: List<Car>, val listener: (Car)-> Unit) : RecyclerView.Adapter<CarAdapter.MyViewHolder>()
{
    class MyViewHolder(val textView: ConstraintLayout) : RecyclerView.ViewHolder(textView){

        val carModelLabel = itemView.modelo_coche
        val yearLabel = itemView.anio_fabricacion
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val car:Car = item.get(position)
        holder.carModelLabel.text=car.getModel()
        holder.yearLabel.text= car.getYear().toString()
        holder.itemView.setOnClickListener{
            listener(car)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_car, parent, false) as ConstraintLayout
        )
    }

    override fun getItemCount(): Int {
        return item.size
    }

}

