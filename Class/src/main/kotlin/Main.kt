    /*
         객체지향 프로그래밍
            - 객체 지향 프로그래밍이란 프로그램에서 사용되는 여러 데이터나 기능을 객체로 묶어서 관리하는 프로그래밍 기법이다.
            - 객체는 매개체 하나에 대한 정보와 기능을 담고 있는 프로그램 요소이다.
            - 학생의 정보를 관리할 때 단순한 데이터만 관리하는 것이 아니라 학생이 가지고 있는 다양한 기능까지도 관리하는 것이다.
            - 자바같은 경우 모든 코드를 class안에 만들어야 되기 때문에 어떤 매개체의 데이터를 관리하는 목적이 아닌 기능을 구현하는 경우라도 class를 만들어야 한다
            - 코틀린의 경우 특정 매개체의 데이터를 관리하는 것이 가능하다.


            학생 객체 { 국어, 영어, 수학, 이름, 나이, 뛰다, 걷다, 공부하다, 밥을 먹다.)

        객체의 특징
            - 매개체 하나의 정보를 관리하기 위해서는 객체 하나가 필요하며 관리하고자 하는 매개체의 수 만큼 객체를 생성해야한다.
            - 객체는 독립적으로 관리되며 서로에 대해 관여하지 않는다.

        클래스
            - Kotlin에서 객체는 자바와 동일하게 클래스를 설계하고 이를 통해 생성한다.
            - 클레스에 정의한 변수와 메서드(함수)의 구조대로 객체가 생성되며 같은 형태의 객체가 필요하다면 같은 클래스로 객체들을 생성하면 된다.
            - class 클래스명 {
              }

     */

fun main() {

        val obj1:TestClass1 = TestClass1()
        val obj2 = TestClass1()
        val obj3 = obj1
        val obj4 = Testclass2()
        println("obj1 : $obj1") //obj1 : 주소값(클래스 @ 버츄얼머신이 관리하기 위한 일련번호)
        println("obj2 : $obj2")// 같은 클래스로 만들었지만 다른 객체기 때문에 일련번호가 다름
        println("obj3 : $obj1") //obj1과 같은 일련번호 출력

        val obj5 = TestClass3()
        println("obj5: ${obj5.a1}") // . 연산자 사용
        println("obj5: ${obj5.a2}") // . 연산자 사용

        //obj5.a1 ==100 불가능
        obj5.a2 = 255
        println("obj5.a2 : ${obj5.a2}")

        obj5.testMethod1()
        obj5.testMethod1()
}

    class TestClass1{

    } // 코틀린의 경우 클래스를 만들때 내부안에 코드가 없을 경우 {} 를 생략가능하다.

    class Testclass2

    class TestClass3{
        //멤버 변수
        val a1 = 0  //값을 가져오기만 가능
        var a2 = 0 //값을 세팅과 가져오기 모두 가능

        //멤버 메서드
        fun testMethod1(){
            println("testMethod1")
        }
        fun testMethod2(){
            println("testMethod2")
        }
    }



