fun main() {
    //when expression adalah pengkondisian pada kotlin selain if expression

    val value: Char = 'A'

    //pengecekan when dengan satu data yang di bandingkan
    when (value) {
        'A' -> println("that' A character")
        'B' -> println("that' B character")
        'C' -> println("that' C character")
    }

    //pengecekan when dengan multiple data yang di bandingkan
    when (value) {
        'A', 'B', 'C' -> println("data yang di bandingkan tersedia")

        else -> { println("data yang di bandingkan tdak tersedia") }
    }

    val name1: String = "Abdul"
    val name2: String = "Goffar"
    //penegecekan when kesamaan data
    when (name1) {
        in name1 -> println("data yang di check sama")
    }

    //pengecekan when type data
    when (name1) {
        is String -> println("benar..! ini type data string")
        !is String -> println("salah..! bukan type data string")
    }
}