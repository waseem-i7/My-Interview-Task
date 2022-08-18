package com.smartherd.myinterviewtask

import com.smartherd.myinterviewtask.model.Product

object SampleData {

    val PRODUCTS = ArrayList<Product>()

    init {
        // Add some sample items
        val newProduct1 = Product()
        newProduct1.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzrErEH0qfGFInFIgIxA1EKdueoPdsfhx5M2e9dv0t2TQNLrHEGLR3piqZ5UlCDrD7wlg&usqp=CAU"
        newProduct1.title = "Nokia 6310 Dual SIM"
        newProduct1.rate = 1000
        newProduct1.category="Mobile"
        newProduct1.mrp="2999"
        newProduct1.brand="Nokia"
        newProduct1.sizes="M"
        PRODUCTS.add(newProduct1)

        val newProduct2 = Product()
        newProduct2.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStndhiDACPYi3SjSpU4pnPyKsXZVENqjwdAjobP9Vumn-MgNBKPdoWREBSMKvlLPIT82A&usqp=CAU"
        newProduct2.title = "Nokia smartphones with Android"
        newProduct2.rate = 10000
        newProduct2.category="Mobile"
        newProduct2.mrp="1299"
        newProduct2.brand="Nokia"
        newProduct2.sizes="S"
        PRODUCTS.add(newProduct2)

        val newProduct3 = Product()
        newProduct3.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfa18-adNdWFVE-TREv2NHfNTSa6VzGALOHg&usqp=CAU"
        newProduct3.title = "Bar 2690 Nokia Mobile Phone"
        newProduct3.rate = 2000
        newProduct3.category="Mobile"
        newProduct3.mrp="3999"
        newProduct3.brand="Nokia"
        newProduct3.sizes="XL"
        PRODUCTS.add(newProduct3)


        val newProduct4 = Product()
        newProduct4.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4Hxu2nZMvlm9pnKXc4oe1y3e5phEe_RHhrA&usqp=CAU"
        newProduct4.title = "Nokia 1100 Mobile Phone"
        newProduct4.rate = 9000
        newProduct4.category="Mobile"
        newProduct4.mrp="1199"
        newProduct4.brand="Nokia"
        newProduct4.sizes="M"
        PRODUCTS.add(newProduct4)


        val newProduct5 = Product()
        newProduct5.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDdqPcjRhO0pWUmRExefcuOdH1gR6Rrec84ybg8TnUjiAL2A37Vd6Uv3ip1JnUb4T2M9g&usqp=CAU"
        newProduct5.title = "Redmi Note 10 Pro"
        newProduct5.rate = 3000
        newProduct5.category="Mobile"
        newProduct5.mrp="4999"
        newProduct5.brand="Redmi"
        newProduct5.sizes="S"
        PRODUCTS.add(newProduct5)


        val newProduct6 = Product()
        newProduct6.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxAJi2dd7zAT5P1NBUgr0krEZZZ6l4hJ5Egx-fcFlAbHTDgUfqt1LT9WaiCjsJwxYWcZw&usqp=CAU"
        newProduct6.title = "Redmi Note 9 Pro"
        newProduct6.rate = 8000
        newProduct6.category="Mobile"
        newProduct6.mrp="9999"
        newProduct6.brand="Redmi"
        newProduct6.sizes="XL"
        PRODUCTS.add(newProduct6)

        val newProduct7 = Product()
        newProduct7.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuQ2PEoaJwUevs89rvMvqKyis6sVOPq4xDLUGvNHtdaN5lxCPS1dumF6d4qwVBYYeXud4&usqp=CAU"
        newProduct7.title = "Redmi Note 20 Pro"
        newProduct7.rate = 4000
        newProduct7.category="Mobile"
        newProduct7.mrp="7900"
        newProduct7.brand="Redmi"
        newProduct7.sizes="M"
        PRODUCTS.add(newProduct7)

        val newProduct8 = Product()
        newProduct8.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ31OCOtASQH0JVgCXE6ohu9LT5GBRxHdiUhw&usqp=CAU"
        newProduct8.title = "Redmi 10 Pro"
        newProduct8.rate = 7000
        newProduct8.category="Mobile"
        newProduct8.mrp="8999"
        newProduct8.brand="Redmi"
        newProduct8.sizes="S"
        PRODUCTS.add(newProduct8)


        val newProduct9 = Product()
        newProduct9.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVWyruwU-zw6oC3sK1O8selKaLQsMjyulQfw&usqp=CAU"
        newProduct9.title = "Lava Hero 600 Feature Phone"
        newProduct9.rate = 5000
        newProduct9.category="Mobile"
        newProduct9.mrp="7900"
        newProduct9.brand="Lava"
        newProduct9.sizes="XL"
        PRODUCTS.add(newProduct9)


        val newProduct10 = Product()
        newProduct10.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLvuZZIYNOBz0AbHEnSftgXBDuSSKtxr5WRg&usqp=CAU"
        newProduct10.title = "Lava Z50 Smartphone"
        newProduct10.rate = 6000
        newProduct10.category="Mobile"
        newProduct10.mrp="7999"
        newProduct10.brand="Lava"
        newProduct10.sizes="M"
        PRODUCTS.add(newProduct10)


        val newProduct11 = Product()
        newProduct11.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAI5YaVZvl4XjthNOfI0J14MNkSwvvALY4Kw&usqp=CAU"
        newProduct11.title = "W830K (HD Ready) Sony Tv"
        newProduct11.rate = 11000
        newProduct11.category="Tv"
        newProduct11.mrp="12999"
        newProduct11.brand="Sony"
        newProduct11.sizes="M"
        PRODUCTS.add(newProduct11)

        val newProduct12 = Product()
        newProduct12.image="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSq4e6iIx0DJEjei9d9s7Rc9OS0sXpyWmXlCA&usqp=CAU"
        newProduct12.title = "Tradeinn Sony KD43X81J 4K LED TV"
        newProduct12.rate = 17000
        newProduct12.category="Tv"
        newProduct12.mrp="22999"
        newProduct12.brand="Sony"
        newProduct12.sizes="S"
        PRODUCTS.add(newProduct12)

        val newProduct13 = Product()
        newProduct13.image="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7xGWBRGay_Ss-qbt2bm-DFLon_sYJz2NuzA&usqp=CAU"
        newProduct13.title = "Sony X85J 43 Inch TV"
        newProduct13.rate = 21000
        newProduct13.category="Tv"
        newProduct13.mrp="23999"
        newProduct13.brand="Sony"
        newProduct13.sizes="XL"
        PRODUCTS.add(newProduct13)

        val newProduct14 = Product()
        newProduct14.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQdRor3xwGZcMp4jLyiSTwJZacFeuhvEq54aQ&usqp=CAU"
        newProduct14.title = "4K Sony UHD QLED TV"
        newProduct14.rate = 41000
        newProduct14.category="Tv"
        newProduct14.mrp="72999"
        newProduct14.brand="Sony"
        newProduct14.sizes="M"
        PRODUCTS.add(newProduct14)

        val newProduct15 = Product()
        newProduct15.image = "https://static.toiimg.com/photo/msid-87304604/87304604.jpg"
        newProduct15.title = "SONY BRAVIA XR"
        newProduct15.rate = 1000
        newProduct15.category="Tv"
        newProduct15.mrp="2999"
        newProduct15.brand="Sony"
        newProduct15.sizes="S"
        PRODUCTS.add(newProduct15)

        val newProduct16 = Product()
        newProduct16.image = "https://www.cnet.com/a/img/resize/7a979f3bf220bcf4466888686dc6ab5dc973e685/2021/10/26/87594683-249d-4722-ae34-33211b6e05de/p1018318-1.jpg?auto=webp&width=1200"
        newProduct16.title = "Sony Xperia Pro-I"
        newProduct16.rate = 19000
        newProduct16.category="Mobile"
        newProduct16.mrp="20999"
        newProduct16.brand="Sony"
        newProduct16.sizes="XL"
        PRODUCTS.add(newProduct16)


    }

}