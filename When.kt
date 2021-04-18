fun ObterMinemonica(cor: Cor) =
    when(cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguem"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA -> "Legal"

    }
fun ObterTemperatura(cor: Cor):String{
    return when(cor){
        Cor.VERMELHO,Cor.LARANJA,Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio"
    }
}

fun main(){
    val mnemonica = ObterMinemonica(Cor.VERMELHO)
    println(mnemonica)

    val Temperatura = ObterTemperatura(Cor.AZUL)
    println(Temperatura)


}

