package com.smartherd.myinterviewtask.activities

import android.content.Intent
import android.content.SharedPreferences
import android.opengl.Visibility
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.smartherd.myinterviewtask.R
import com.smartherd.myinterviewtask.SampleData
import com.smartherd.myinterviewtask.adapter.ProductAdapter
import com.smartherd.myinterviewtask.adapter.ProductItemClicked
import com.smartherd.myinterviewtask.model.Product
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ProductItemClicked {

    //variable to Change the layout manager
    lateinit var sp : SharedPreferences
    lateinit var editor : SharedPreferences.Editor
    var boolean : Boolean = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //to remove status bar
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }


        //recyclerView
        setLayoutManager()
        val adapter = ProductAdapter(SampleData.PRODUCTS,this)
        recyclerView.adapter = adapter

        //to change orientation
        changeOrientation.setOnClickListener {
            filterLayout.visibility = View.GONE
            if (boolean){
                editor.putBoolean("boolean",false)
                editor.commit()
                boolean = sp.getBoolean("boolean",true)
                recyclerView.layoutManager = GridLayoutManager(this,2)
                changeOrientation.setImageResource(R.drawable.ic_linear)
            }else{
                editor.putBoolean("boolean",true)
                editor.commit()
                boolean = sp.getBoolean("boolean",true)
                recyclerView.layoutManager = LinearLayoutManager(this)
                changeOrientation.setImageResource(R.drawable.ic_grid)
            }
        }

        //filter button
        filter.setOnClickListener {
          if(filterLayout.isVisible){
              filterLayout.visibility = View.GONE
          }else{
              filterLayout.visibility= View.VISIBLE
          }
        }

        //searchView
        initSearchWidgets()


    }



    //search Method
    private fun initSearchWidgets(){
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                filterLayout.visibility = View.GONE
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterLayout.visibility = View.GONE
                val filterProduct = ArrayList<Product>()
                for (product : Product in SampleData.PRODUCTS){
                    if (newText != null) {
                        if (product.title?.toLowerCase()?.contains(newText.toLowerCase()) == true){
                            filterProduct.add(product)
                        }
                    }
                }
                val adapter = ProductAdapter(filterProduct,this@MainActivity)
                recyclerView.adapter = adapter
                return false
            }


        })
    }

    //code to Change the layout manager
    private fun setLayoutManager() {
        sp=getSharedPreferences("LayoutManager", MODE_PRIVATE)
        editor=sp.edit()
        editor.putBoolean("boolean",true)
        editor.commit()
        boolean = sp.getBoolean("boolean",true)
        if (boolean){
            recyclerView.layoutManager = LinearLayoutManager(this)
        }else{
            recyclerView.layoutManager = GridLayoutManager(this,2)
        }
    }

    //Onclick on recyclerView product item
    override fun onItemClicked(item: Product) {
       val intent = Intent(this,ProductDetailActivity::class.java)
        intent.putExtra("productImage",item.image)
        intent.putExtra("productTitle",item.title)
        intent.putExtra("productRate",item.rate)
        intent.putExtra("productCategory",item.category)
        intent.putExtra("productMRP",item.mrp)
        startActivity(intent)
    }

    //Category Button
    fun mobile(view: View) {
       filterCategory("Mobile")
    }
    fun tv(view: View) {
       filterCategory("Tv")
    }

    //SizeButton
    fun M(view: View) {
        filterSize("M")
    }
    fun S(view: View) {
        filterSize("S")
    }
    fun XL(view: View) {
       filterSize("XL")
    }

    //Brand Button
    fun Mi(view: View) {
       filterBrand("Redmi")
    }
    fun Lava(view: View) {
        filterBrand("Lava")
    }
    fun Nokia(view: View) {
       filterBrand("Nokia")
    }
    fun Sony(view: View) {
       filterBrand("Sony")
    }

    //show all button
    fun showALl(view: View) {
        val adapter = ProductAdapter(SampleData.PRODUCTS,this@MainActivity)
        recyclerView.adapter = adapter
        filterLayout.visibility = View.GONE
    }

    //category filter
    fun filterCategory(category1 : String){
        val filterProduct = ArrayList<Product>()
        for (product : Product in SampleData.PRODUCTS){
            if (product.category?.toLowerCase()?.contains(category1.toLowerCase()) == true){
                filterProduct.add(product)
            }
        }
        val adapter = ProductAdapter(filterProduct,this@MainActivity)
        recyclerView.adapter = adapter
        filterLayout.visibility = View.GONE
    }
    //Size filter
    fun filterSize(size1 : String){
        val filterProduct = ArrayList<Product>()
        for (product : Product in SampleData.PRODUCTS){
            if (product.sizes?.toLowerCase()?.contains(size1.toLowerCase()) == true){
                filterProduct.add(product)
            }
        }
        val adapter = ProductAdapter(filterProduct,this@MainActivity)
        recyclerView.adapter = adapter
        filterLayout.visibility = View.GONE
    }
    //Brand filter
    fun filterBrand(brand1 : String){
        val filterProduct = ArrayList<Product>()
        for (product : Product in SampleData.PRODUCTS){
            if (product.brand?.toLowerCase()?.contains(brand1.toLowerCase()) == true){
                filterProduct.add(product)
            }
        }
        val adapter = ProductAdapter(filterProduct,this@MainActivity)
        recyclerView.adapter = adapter
        filterLayout.visibility = View.GONE
    }
}