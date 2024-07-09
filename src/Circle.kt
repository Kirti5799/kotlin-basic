class Circle(
    val radius:Int
) {

    init{
        println("object of circle created")
    }
    fun circumference()=2 * Math.PI * radius
    fun area()=Math.PI * radius * radius
}
fun main(){
    print("enter radius of circle=")
    val r = readln().toInt()
    val c1 = Circle(r)
    println("Circle with radius ${c1.radius}")
   println("AREA WILL BE ${c1.area()}")
   println("circcumferennce will be ${c1.circumference()}")

}