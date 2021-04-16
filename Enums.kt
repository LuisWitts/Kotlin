enum class Cor(val Vermelho: Int, val Verde: Int, val azul: Int) {
    VERMELHO(255, 0,0),
    LARANJA (255,165,0),
    VERDE   (0,255,0),
    AMARELO (255,255,0),
    AZUL    (0,0,255);

    fun rgb() = ((Vermelho * 256 + Verde) * 256 + azul)

}
fun main(){
    val rgb = Cor.VERMELHO.rgb()
    println(rgb)
}