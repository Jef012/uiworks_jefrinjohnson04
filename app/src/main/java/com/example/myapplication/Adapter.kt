package com.example.myapplication


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R.id.imageView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val companyslist : ArrayList<Companys>): RecyclerView.Adapter <MyAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,
        parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {

        val currentItem = this.companyslist[position]
        holder.imageView.setImageResource(currentItem.imageView)
        holder.textView2.text = currentItem.textView2
        holder.textView3.text = currentItem.textView3
        holder.textView4.text = currentItem.textView4
        holder.textView5.text = currentItem.textView5

    }

    override fun getItemCount(): Int {

        return this.companyslist.size
    }
    class MyViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){

            val imageView: ShapeableImageView = itemView.findViewById(R.id.imageView)
            val textView2: TextView = itemView.findViewById(R.id.textView2)
            val textView3: TextView = itemView.findViewById(R.id.textView3)
            val textView4: TextView = itemView.findViewById(R.id.textView4)
            val textView5: TextView = itemView.findViewById(R.id.textView5)

    }
}



