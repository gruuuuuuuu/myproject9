package com.gru.com.gru.score

class Student (var name: String, var english: Int, var math:Int) {
    /*var name = ""
      var english = 0
      var math = 0*/
    init {
   //     println("Testing")
    }
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}")
    }
    fun getAverage() = (english+math)/2

}

fun main(){
    val stu = Student("Jack", 55, 87)
    stu.print()
}