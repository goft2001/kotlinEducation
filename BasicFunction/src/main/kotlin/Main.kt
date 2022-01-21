fun main() {
     test8()


}

fun test8(){
    println("test8 호출")

    fun test9(){
        println("test9 호출")
   }
    test9() // test8 내에서 test 9 호출
}



fun test7(){

    println("test7이 호출되었습니다. -매개변수 없음")
    println("----------------------------------")

}

fun test7(a1:Int){

    println("test7이 호출되었습니다. -정수형 매개변수 : $a1")
    println("----------------------------------")
}

fun test7(a1:Double){

    println("test7이 호출되었습니다. -실수형 매개변수 : $a1")
    println("----------------------------------")
}

fun test7(a1:Int,a2:Int){

    println("test7이 호출되었습니다. -정수형 매개변수 두개 : $a1, $a2")
    println("----------------------------------")
}


fun test5() :Unit{ //반환값이 없는 경우 Unit 사용 (java의 void) 생략 가능
    println("tst5호출")
    println("----------------------")
}

fun test4(a1:Int,a2:Int) :Int {
    var result:Int = a1+a2
    return result
}


fun test3(a1:Int=0,a2:Double=0.0){
    println("test3 호출")
    println("a1:$a1")
    println("a2:$a2")
    println("----------------------------")
}





fun test2(a1:Int,a2:Double){
    println("test2 호출")
    println("a1:$a1")
    println("a2:$a2")

    println("---------------------------")
}
//fun test1(){
//    println("test1 함수 호출")
//    println("---------------------------")
//
//}

