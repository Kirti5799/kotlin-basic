open class Animal (
    group: String?= null
){

    fun eat(){
        print("Animal eats")
    }
    fun sleep(){

        print("Animal sleep")
    }

}



class Monkey:Animal(group="mammal"){
    fun jump(){
        println("jumps around")
    }


}

class Crocodile:Animal(group="reptile"){
    fun hunting()
    {
        println("hunts")

    }

}
