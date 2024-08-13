package com.example.e_commerceapp

class ItemModel
    (private var item_name: String, private var item_price: Int, private var item_image: Int) {

    // Getter and Setter
    fun getItem_name(): String {
        return item_name
    }

    fun setItem_name(item_name: String) {
        this.item_name = item_name
    }

    fun getItem_price(): Int {
        return item_price
    }

    fun setItem_price(item_price: Int) {
        this.item_price = item_price
    }

    fun getCItem_image(): Int {
        return item_image
    }

    fun setItem_image(item_image: Int) {
        this.item_image = item_image
    }

}