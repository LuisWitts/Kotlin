fun main(){
    var nome = "Luis"
    println("Hello " + nome )
    println("Hello $nome ! ")
    //println(soma( a= 10 , b= 5))
    println("A soma é igual a = ${soma(a=10, b=10)}")
}
fun soma(a:Int, b:Int): Int{
    return (a + b)
}