
    /*
        생성자
         - 클래스를 통해 객체를 생성할 때 자동으로 수행될 코드를 작성하는 곳이다.
         - 메서드와 비슷해 보이지만 반환타입이 없어 메서드라고 부르지 않는다.
         - 생성자의 역할은 클래스가 가지고 있는 변수의 값을 초기화하는데 주로 이용된다.
         - constructor을 이용하여 생성자를 정의할 수 있다.
         - 생성자는 매개변수의 개수나 자료형을 달리하여 여러 개를 만들어 사용할 수 있다.

        init 코드 블록
         - kotlin은 클래스에 init 코드 블록을 만들어 주면 객체 생성시 자동으로 처리되는 코드를 만들 수 있다.
         - 객체가 생성될 때 자동으로 동작해야되는 부분, 각생성자 별로 중복되는 부분은
           init으로 처리하고 매개변수를 사용하지 못하지만
         - 어떤 값을 셋팅하고 초기화하는데는 생성자(매개변수를 사용가능)를 쓴다.
        기본 생성자
         - 클래스를 정의할 때 클래스 이름 우측에 정의하는 생성자
         - 기본 생성자의 매개 변수는 멤버 변수로 자동 등록된다.
     */

fun main() {
    val obj1 = TestClass1()
    println("obj1 : $obj1")

    val obj2 = TestClass2()
    println("obj2 : $obj2")
    println("obj2.v1 : ${obj2.v1}")
    println("obj2.v2 : ${obj2.v2}")

    val obj3 = TestClass2(100,200) //매개변수가 있는 생성자
    println("obj3 : $obj3") //주소값
    println("obj3.v1 : ${obj3.v1}") //인자값1
    println("obj3.v2 : ${obj3.v2}")  //인자값2

    println("----------------------------------------------------")

    val obj4 = TestClass3(100,200)
    val obj5 = TestClass4(1000,2000)

    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")

    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")
    println("----------------------------------------------------")
    val obj6 = TestClass5(100,200)
    println("obj6.a1 : ${obj6.a1}")
    println("obj6.a2 : ${obj6.a2}")
    println("----------------------------------------------------")
    val obj7 = TestClass5(100)
}

class TestClass1{
    init{
        println("객체가 생성되면 자동으로 동작되는 부분입니다.")

    }
}

    class TestClass2 {
        var v1: Int = 0
        var v2: Int = 0

        constructor() {
            println("매개변수가 없는 생성자")
        }

        constructor(a1: Int, a2: Int) {
            println("매개변수가 두 개인 생성자")
            v1 = a1
            v2 = a2
        }

    }

    class TestClass3 (var a1:Int,val a2:Int) //기본 생성자
    // 기본적으로 변수값을 지정하면 생성자가 만들어지고 var val 키워드를 붙여주면
    // 컴파일 과정에서 멤버변수로 정의까지 됨

    class TestClass4 constructor(var a1:Int,val a2:Int)
    // 원래는 이렇게 constructor을 넣어서 만들어야하나 기본 생성자의 경우 생략해도 가능

    class  TestClass5(var a1:Int,val a2: Int){
        init{
            println("init 코드 수행")
            println("a1: $a1")
            println("a2: $a2")
        }
        constructor( a1 : Int) : this(a1,100){
        // 보조 생성자를 만들때의 클래스가 주 생성자를 가지고 있으면 반드시 주 생성자를 this로 호출해야함
        //1. 주생성자 호출
        //2. init 코드가 호출
        //3. 보조생성자 호출 (맨 마지막에 호출)
        println("보조 생성자 호출")
        }
    }