fun main(){
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()



    var media = ((a*3.5+b*7.5)/11)
    val media2:String = "%.5f".format(media)



    println("MEDIA = $media2")

}