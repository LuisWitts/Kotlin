fun main(){
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    var c = readLine()!!.toDouble()



    var media = ((a*2+b*3+c*5)/10)
    val media2:String = "%.1f".format(media)



    println("MEDIA = $media2")
}