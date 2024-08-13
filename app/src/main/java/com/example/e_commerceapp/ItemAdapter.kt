package com.example.e_commerceapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter
    (private val context: Context, itemModelArrayList: ArrayList<ItemModel>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
        private val itemModelArrayList: ArrayList<ItemModel>
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
            // to inflate the layout for each item of recycler view.
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_layout, parent, false)
            return ViewHolder(view)
        }
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemIV: ImageView
        val itemNameTV: TextView
        val itemPriceTV: TextView
        init {
            itemIV = itemView.findViewById(R.id.item_Image)
            itemNameTV = itemView.findViewById(R.id.item_Name)
            itemPriceTV = itemView.findViewById(R.id.item_price)
        }
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
            // to set data to textview and imageview of each card layout
            val model: ItemModel = itemModelArrayList[position]
            holder.itemNameTV.text = model.getItem_name()
            holder.itemPriceTV.text = model.getItem_price().toString()
            holder.itemIV.setImageResource(model.getCItem_image())
        }

        override fun getItemCount(): Int {
            // this method is used for showing number of card items in recycler view.
            return itemModelArrayList.size
        }

        // View holder class for initializing of your views such as TextView and Imageview.


        // Constructor
        init {
            this.itemModelArrayList = itemModelArrayList
        }
    }