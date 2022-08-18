package com.smartherd.myinterviewtask.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.smartherd.myinterviewtask.R
import com.smartherd.myinterviewtask.model.Product

class ProductAdapter(private val items : ArrayList<Product> , private val listener : ProductItemClicked) : RecyclerView.Adapter<ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item_layout,parent,false)
        val viewHolder = ProductViewHolder(view)
        view.setOnClickListener {
            listener.onItemClicked(items[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentItem = items[position]
        Glide.with(holder.itemView.context).load(currentItem.image).into(holder.imageView)
        holder.titleView.text = currentItem.title
        holder.rate.text = "₹"+currentItem.rate
        holder.brand.text=currentItem.brand
        holder.size.text = currentItem.sizes

    }

}

class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

      val imageView : ImageView = itemView.findViewById(R.id.imageView)
      val titleView : TextView = itemView.findViewById(R.id.title)
     val rate : TextView = itemView.findViewById(R.id.rate)
     val brand : TextView = itemView.findViewById(R.id.brand)
    val  size : TextView = itemView.findViewById(R.id.size)


}

interface ProductItemClicked {
    fun onItemClicked(item : Product)
}