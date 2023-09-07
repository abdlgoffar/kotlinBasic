// membuat function
fun hello(): Unit {
    println("hello")
}

//function parameter
fun hello2(name: String, age: Int): Unit {
    println("name: $name age $age")
}

//function named argument, function named argument adalah function yang ketika dipanggil maka kita perlu memberi menulis parameter yang akan diisi datanya
fun hello3(name: String, age: Int): Unit {
    println("name: $name age $age")
}
//hello3(name = "goffar", age = 22) //contoh penerapan function named argument


//function return value
fun hello4(): Int {
    return 100;
}
fun hello5(): String {
    return "Hello";
}


//function one line, function one line adalah function yang block pembuatannya hanya satu baris
fun hello6(name: String): Unit = println(name)
fun hello7(data1: Int, data2: Int): Int = data1 + data2

