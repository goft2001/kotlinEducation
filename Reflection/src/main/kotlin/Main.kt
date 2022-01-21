import kotlin.reflect.KClass

/*
        리플렉션
         - 프로그램 실행 중에 프로그램의 구조(객체,함수,프로퍼티)를 분석하는 기법
         - 객체의 클래스 타입, 클래스 정보, 생성자 정보, 프로퍼티 정보 등을 실행 중에 파악할 수 있다.

     */

fun main() {
    // 클래스 타입

    val a1:KClass<String> = String::class
    val a2:Class<String> = String::class.java
    println("String 코틀린에서의 타입 : $a1")
    println("String java에서의 타입 : $a2")

    val str1:String = "안녕하세요"
    val a3:KClass<out String> = str1::class
    val a4:Class<out String> = str1::class.java
    println("안녕하세요 코틀린에서의 타입 : $a3")
    println("안녕하세요 코틀린에서의 타입 : $a4")

    //타입을 모를 때
    val a5:KClass<*> = str1::class
    val a6:Class<*> =str1::class.java
    println("안녕하세요 코틀린에서의 타입 : $a5")
    println("안녕하세요 자바에서의 타입 : $a6")
println("---------------------------------------------------")
    //클래스를 정의해보기
    val test1:TestClass = TestClass()
    val a7:KClass<*> = test1::class
    val a8:Class<*> =test1::class.java
    println("안녕하세요 코틀린에서의 타입 : $a7")
    println("안녕하세요 자바에서의 타입 : $a8")
println("---------------------------------------------------")
    //클래스 정보 분석
    println("추상 클래스 인가? : ${test1::class.isAbstract}")
    println("Companion 클래스 인가? : ${test1::class.isCompanion}")
    println("Data 클래스 인가? : ${test1::class.isData}")
    println("final 클래스 인가 : ${test1::class.isFinal}")
    println("Open 클래스 인가 : ${test1::class.isOpen}")
    println("Inner 클래스 인가 : ${test1::class.isInner}")
    println("Sealed 클래스 인가 : ${test1::class.isSealed}")


}

class TestClass(){

    val number1:Int = 100
    var number2:Int =200

    constructor(a1:Int) : this(){

    }

    constructor(a1:Int,a2:Int) :this(){

    }
    fun testMethod1(){

    }

}