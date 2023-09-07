fun main() {

    //lambda expression simplenya adalah cara pembuatan method tanpa sebuah nama.
    //hal yang membuat lambda expression sangat berguna adalah lambda expression bisa dijadikan sebuah parameter pada sebuah method.



    //membuat lambda variable, keuntungan membuat lambda variable adalah lambda ini bisa memiliki lebih dari satu parameter
    val calculation: (Int, Int) -> Int =  {params: Int, params2: Int -> params * 2 + params2}
    println(calculation(100, 100))







}