package com.smartherd.myinterviewtask.activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.smartherd.myinterviewtask.R
import kotlinx.android.synthetic.main.activity_product_detail.*
import java.util.*
import kotlin.collections.ArrayList

class ProductDetailActivity : AppCompatActivity() {

    //ImageSlider Variable
    private lateinit var imageSlider : ImageSlider
    private lateinit var image : String
    private lateinit var slideModels : ArrayList<SlideModel>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)


        //to remove status bar
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }

        //imageSlider Variable Initialization
        imageSlider = findViewById(R.id.imageSlider)
        image  = intent.getStringExtra("productImage")!!
        imageSliderFun()


        //Add data into productDetailActivity
        titleInProductDetail.text = intent.getStringExtra("productTitle")
        categoryInProductDetail.text = intent.getStringExtra("productCategory")
        mrpInProductDetail.text = intent.getStringExtra("productMRP")
        val rate = intent.getIntExtra("productRate",0)
        rateInProductDetail.text = "₹"+rate


        //color button click
        rgColor.setOnCheckedChangeListener { radioGroup, i ->
            if (i==R.id.rbGreen){
                  cardView.setCardBackgroundColor(resources.getColor(R.color.green))
            }else if (i==R.id.rbPurple){
                cardView.setCardBackgroundColor(resources.getColor(R.color.purple))
            }else if (i==R.id.rbRed){
                cardView.setCardBackgroundColor(resources.getColor(R.color.red))
            }else if (i==R.id.rbYellow){
                cardView.setCardBackgroundColor(resources.getColor(R.color.yellow))
            }
        }


    }

    //image Slider Function
    private fun imageSliderFun() {

        //now we will create a list for images
        slideModels = ArrayList()

        slideModels.add(SlideModel(image,ScaleTypes.FIT))
        slideModels.add(SlideModel(image,ScaleTypes.FIT))
        slideModels.add(SlideModel(image,ScaleTypes.FIT))
        slideModels.add(SlideModel(image,ScaleTypes.FIT))
        slideModels.add(SlideModel(image,ScaleTypes.FIT))

        imageSlider.setImageList(slideModels)
    }
}