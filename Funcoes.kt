fun main (){
    println(max(a = 10, b = 5))
    println(max1(a = 5, b = 10))
}

//corpo de bloco
fun max (a:Int, b:Int): Int {
    return if (a > b) a else b
}

//corpo de expressão
fun max1 (a:Int, b:Int): Int = if (a > b ) a else b
