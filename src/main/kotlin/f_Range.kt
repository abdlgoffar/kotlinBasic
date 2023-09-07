fun main() {
    //range adalah type data Number yang bisa dibuat dengan Range Tertentu dengan menggunakan symbol ..

    val age =  0..100

    //mendapat total/panjang element data range
    println(age.count())

    //melihat ketersediaan data, retirn true jika tersedia false jika tidak tersedia
    println(age.contains(10000))


    //literasi range

    println("-----------------")

    for (i in age) {
        println(i)
    }

}