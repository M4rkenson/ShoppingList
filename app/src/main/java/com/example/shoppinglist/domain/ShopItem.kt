package com.example.shoppinglist.domain

data class ShopItem(
    private val id:Int,
    private val count:Int,
    private val name:String,
    private val enabled:Boolean)
