/*
    지연 초기화 (lateinit)
    - Kotlin은 변수를 선언할 때 값을 무조건 설정해야 하는데  지금 당장 설정할 수 없고, 사용자에게 입력을 받은 다음 입력을 하거나
      어떠한 처리를 통해 얻어진 값을 세팅을 해야하거나 할 경우 이를 지연 시키는 것을 지연 초기화 라고 한다.
    - 주의할 점은 변수의 값을 갖고 나와 사용하기 전에 무조건 값을 세팅하는 작업을 시행하여야 한다.
    - var 로 선언된 변수의 초기화를 뒤로 미룰 수 있다.
    - 변수의 값을 사용하기 전에 반드시 초기화가 이루어져야 한다.
    - val 로 선언된 변수는 오류가 발생한다.(setter메서드가 추가가 되지 않기에 변경할 수 없다.)

    Lazy
    - 위의 설명처럼 val로 선언된 변수는 lateinit으로 지연 초기화 하는 것이 불가능하다.
    - val로 선언된 변수는 laze코드 블록을 이용하면 되지만 이는 나중에 프로퍼티의 값을 셋팅해준다는 의미가 아닌
      사용할 때 값을 초기화 한다는 의미를 가지고 있다.

        <형태>
      val a4 : String by Laye{
        println("a4 init")
        "문자열 4"
      }


 */

fun main() {
    val obj1 = TestClass1()
    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")

   // println("obj1.a3 : ${obj1.a3}") // 초기화되어있지 않기에 오류메시지가 발생

    obj1.testMethod1() // testMethod1을 호출해서 값을 설정해 준다음 출력 : 정상 실행

    println("obj1.a4 : ${obj1.a4}")
}
class TestClass1{
    var a1 : Int = 100 // 변수선언과 값을 세팅한 경우
    // 위처럼 하고싶지 않을시 두가지 방법
    // 1. init에서 값을 설정하는 경우
    // 2. 지연 초기화를 이용하는 경우(타입명을 반드시 명시해야함-생략불가) 기본자료형을 관리하는 객체타입의 경우 지원하지 않음(Int,Double,float와 같은 경우)
    var a2 : Int
    //2.lateinit
    lateinit var a3:String

    //lazy
    val a4 : String by lazy { //a4변수안에는 아무것도 들어가있지 않고 사용하려는 시점에서 초기화가 진행 ->메모리 절약
        println("a4 init")
        "문자열 2"
    }

    init{
        //1.init
        a2 = 200
    }
    fun testMethod1(){
        if(::a3.isInitialized==false) //변수 a3가 초기화된적이 있는지, 없다면 false 값이 나옴
        {
            a3="문자열"
        }
        println("a3:$a3")
    }


}

        /*
            프로퍼티의 값을 나중에 셋팅할 때 지연 초기화를 사용한다.
            var 변수는 lateinit 을 사용한다.
            val 변수는 laze 코드 불록을 사용한다.

         */