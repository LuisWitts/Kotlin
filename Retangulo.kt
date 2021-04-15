class Retangulo(val altura: Int, val largura: Int) {
    val isQuadrado
        get() = altura == largura    // acessor customizado

}

fun main() {
    val retangulo: Retangulo = Retangulo(altura = 11, largura = 10)
    println(retangulo.isQuadrado)
}


// fun isQuadrado(): Boolean {
//    return altura == largura
//}
//
//E chamar assim:
//
//val retangulo = Retangulo(4, 4)
//retangulo.isQuadrado()