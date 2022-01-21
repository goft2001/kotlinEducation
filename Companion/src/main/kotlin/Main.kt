    /*
        정적 멤버
         - 변수가 있는 클래스에 여러 객체를 만들면 변수가 각각 따로 생성되어 관리할 수 있지만
           만약 각 객체의 변수값이 동일한 경우 (예 : 한국인을 대상으로 하는 설문조사에서 국적-대한민국은 공통)
           추가로 객체를 생성하지 않고 메모리공간에 만들어지고 하나만 만들어지고 모든 객체에서 공통적으로 딱
           한 가지 값만 사용하는 저장해 놓을 때 '정적'멤버를 사용하면 된다.
         - 클래스를 정의할 때 변수나 메서드를 정적멤버로 정의하면 객체를 생성하지 않고 사용할 수 있다.
         - Java에서는 static을 사용하는데 Kotlin에서는 Companion 객체를 사용한다.


     */


fun main() {

    // a1 과 testFun1은 일반 멤버이기 때문에
    // TestClass.testFun1()
    // 위와 같이 사용할 수 없고 반드시 객체를 만들어서 사용해야함
    val obj1 = TestClass() //객체 생성
    println("obj1.a1 : ${obj1.a1}")
    obj1.testFun1()

    val obj2 = TestClass()
    println("obj2.a1: ${obj2.a1}")
    obj2.testFun1()

    obj1.a1 = 200
    println("obj1.a1 : ${obj1.a1}") // 출력값 200
    println("obj2.a1 : ${obj2.a1}") //출력값 100 그대로

        /*
            println("obj1.a2 : ${obj1.a2}")
            ojb1.testFun2()
             정적멤버로 정의된 변수는 객체를 생성해서 참조변수로 접근이 불가능함(java와 차이점)
             아래처럼 바로 사용할 수 있다.

         */
    println("testClass.a2 ${TestClass.a2}")
    TestClass.testFun2()

    /*
         Ktolin에서 Java 사용하기
          - Kotlin에서 java의 static 멤버 사용은 다른 점이 없다.
          - 만약 Kotlin에서 정의한 Companion 멤버 중 java에서 사용할 수 있도록 하기 위해서는
            @JavaStatic 으로 정의해야 한다.

  */
    val obj3 = JavaMain()                   // 1) 자바파일을 객체에 담고
    println("obj3.javaA1 : ${obj3.javaA1}") // 2) 불러오기
    obj3.javaMethod1()
    println("javaMain.javaA2 : ${JavaMain.javaA2}")
    JavaMain.javaMethod2()

//    println("JavaMain.javaA2 : ${JavaMain.javaA2}")
//    JavaMain.javaMethod2()
}

    class TestClass{
        var a1:Int = 100

        companion object{ //외부에 있는 변수나 메서드는 사용불가능하고 내부의 변수만 사용이 가능하다.
            @JvmStatic var a2 = 2000

            @JvmStatic fun testFun2(){
                println("testFun2")
              //  println("a1 : $a1") 사용 불가
                println("a2: $a2")
            }
        }

         fun testFun1(){
            println("testFun1 $")
            println("a1 : $a1")
            println("a2: $a2")

        }
    }

