open class Human(
    open val name:String,
     open val age:Int,
     open val gender:String="M"
){
    open fun detail(){
        println("i m $name")
        println("i m $age yrs old")
        println("i m $gender")

    }
}
class Student(
    override val name:String,
    override val age:Int,
    override val gender:String,
    val school:String,
    val klass:String
):Human(name,age){
    override fun detail(){
        super.detail()
        println("i study in $school")
        println("i m in class $klass")
    }

}
fun main(){
    val h1 = Human("kirti", 19)
    val s1 = Student("kiran",18,"f","kv","12")
    h1.detail()
    println("____")
    s1.detail()
}