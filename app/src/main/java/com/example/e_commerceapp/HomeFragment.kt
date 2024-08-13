package com.example.e_commerceapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.helper.widget.Carousel
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.e_commerceapp.databinding.FragmentCortBinding
import com.example.e_commerceapp.databinding.FragmentHomeBinding


class HomeFragment :Fragment() {


    private var _binding: FragmentHomeBinding ?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(
            inflater, container, false
        )

        val imageList = ArrayList<SlideModel>() // Create image list

       // imageList.add(SlideModel("String Url" or R.drawable)
       // imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel(R.drawable.img))
        imageList.add(SlideModel(R.drawable.img))
        imageList.add(SlideModel(R.drawable.img))


        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList , ScaleTypes.FIT)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
                // You can listen here.
            }
            override fun doubleClick(position: Int) {
                // Do not use onItemSelected if you are using a double click listener at the same time.
                // Its just added for specific cases.
                // Listen for clicks under 250 milliseconds.
            } })


        //////// featured RecyclerView  /////////
        val itemRV = binding.itemFeaturedRv

        val itemModelArrayList: ArrayList<ItemModel> = ArrayList<ItemModel>()
        itemModelArrayList.add(ItemModel("Watch", 40, R.drawable.item_img))
        itemModelArrayList.add(ItemModel("Jacket", 100, R.drawable.item_jacket))
        itemModelArrayList.add(ItemModel("Air pod", 200, R.drawable.item_airpods))
        itemModelArrayList.add(ItemModel("laptop", 1500, R.drawable.item_laptop))
        itemModelArrayList.add(ItemModel("Scouter", 750, R.drawable.item_scouter))
        itemModelArrayList.add(ItemModel("Perfume", 300, R.drawable.item_perfume))
        itemModelArrayList.add(ItemModel("Shoes", 4, R.drawable.item_shoes))

        val itemAdapter = context?.let { ItemAdapter(it, itemModelArrayList) }

        val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        itemRV.layoutManager = linearLayoutManager
        itemRV.adapter = itemAdapter


        //////// Most Popular RecyclerView  /////////
        val popularRV = binding.itemMostPopularRv

        val popularAdapter = context?.let { ItemAdapter(it, itemModelArrayList) }

        val popularLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        popularRV.layoutManager = popularLayoutManager
        popularRV.adapter = popularAdapter


        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
