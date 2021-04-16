fun main(args:Array<String>){

    //Variaveis
    val pi:Double
    pi = 3.14159
    val area:Double
    var raio2:Double

    //Entrada de dados
    var raio:Double = readLine()!!.toDouble()

    //Processamento
    raio2 = raio * raio
    area = raio2 * pi
    val area2: String = "%.4f".format(area)

    //Saida de dados
    
    println("A=${area2}")






}



