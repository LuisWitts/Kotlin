fun main(args:Array<String>){
    val pi:Double
    pi = 3.14159
    val area:Double
    var raio:Double = readLine()!!.toDouble()
    var raio2:Double
    raio2 = raio * raio
    area = raio2 * pi
    val area2: String = "%.4f".format(area)
    println("A=${area2}")
}



