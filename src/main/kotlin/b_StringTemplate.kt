fun main() {
    //string template adalah cara menggabungkan data string tanpa operator +

    val firstname: String = "Abdul"
    val lastname: String = "Goffar"

    val fullname: String = "My Name Is $firstname ${lastname.uppercase()}"
    println(fullname)
}