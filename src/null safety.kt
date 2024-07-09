fun main() {
    var a:Int?=0
    println(a)
    a=null
    println(a)
    var name: String? = null
    println(name)
  // name =readline()
    name=null
    println(name)
    println(name?.length ?: " no length available")
    println(name?.isBlank()?:"no date avialable")

}
