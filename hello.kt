class hello (
        var name:String,
        var age:Int,
        var height:Int,
        var weight:Float,
        var iq:String,
        var gender: String= "female"
        var behaviour:String="excellent"
    ){
        fun show(){
            println("$name is $age old")
            println("$height and $weight")
            println("$iq iq")
            println("$gender and $behaviour")
        }
    }

    fun main(){
        val p1=person2("ajay",23,6,52f,"excellent")
        val p2=person2("arti",22,7,40f,"excellent")
        p1.show()
        p2.show()
    }

