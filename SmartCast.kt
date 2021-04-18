import java.lang.IllegalArgumentException

// (1 + 2) + 4
interface Expressão
class Numero(val valor: Int) : Expressão
class Soma(val esquerdo: Expressão, val direito : Expressão ):Expressão

fun Avaliação(expressão: Expressão): Int{
    if (expressão is Numero){
        return expressão.valor
    }
    if (expressão is Soma){
        return Avaliação(expressão.direito) + Avaliação(expressão.esquerdo)

    }
    throw IllegalArgumentException("Expressão desconhecida")
}
fun main(){
    val resultado = Avaliação(Soma(Soma(Numero(valor = 1), Numero(valor = 2)), Numero(valor = 4)))
        println(resultado)
}