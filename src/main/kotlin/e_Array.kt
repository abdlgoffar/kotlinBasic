fun main() {

    //cara membuat data array
    val name: Array<String> = arrayOf("Abdul Goffar", "Ainun Noval", "Rizal Maulana")
    val age: Array<Int> = arrayOf(10, 20, 30, 50)

    //cara membuat data array yang bisa null/nullable, cukup menggunakan symbol ?
    val country: Array<String?> = arrayOf("germany", "france", "USA", "indonesia")


    //mendapat jumlah element array data
    println("jumlah element array: " + name.size)

    //medapat data element array
    println(name.get(0))
    println(name[1])

    //mengubah data element array
    name.set(0, "Goffar")
    name[1] = "Noval"

    //literasi array

    for (i in name) {
        println(i)
    }
}