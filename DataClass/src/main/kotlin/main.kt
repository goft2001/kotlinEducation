    /*
        Data Class
         - 부모 클래스의 역할을 할 수 없다.
         - DataClass는 매개체의 데이터를 관리하는 용도로 사용하는 클래스이다.
         - ** abstract, open, sealed, inner 클래스로 정의할 수 없다. **
         - 반드시 주 생성자를 가지고 있어야 한다.

        Data Class Methods
         - equals : 객체가 가지고 있는 변수를 모두 비교하는 메서드
         - hashCode : 객체를 구분하기 위한 고유한 정수값
         - copy : 객체를 복제하는 메서드
         - toString : 객체가 가지고 있는 변수의 값을 출력
         - componentN : 객체 분해하는 메서드 (N : 정수)
     */

fun main() {
    var obj1 = TestClass1(100,200)
    var obj2 = TestClass2(100,200)

    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")

    println("obj2.a1 : ${obj2.a1}")
    println("obj2.a2 : ${obj2.a2}")

    var obj3 = TestClass1(100,200,300)
    var obj4 = TestClass2(100,200,300)

    //보조생성자 출력
    println("obj3.a1 : ${obj3.a1}")
    println("obj3.a2 : ${obj3.a2}")
    println("obj3.a3 : ${obj3.a3}")

    println("ojb4.a1 : ${obj4.a1}")
    println("ojb4.a2 : ${obj4.a2}")
    println("ojb4.a3 : ${obj4.a3}")

    //testmethod 출력
    obj3.testMethod1()
    obj4.testMethod2()
    println("------------------------------------------")

    //data class의 메소드 사용(equals)
    var obj5 = TestClass1(100,200,300)
    var obj6 = TestClass1(100,200,300)
    if(obj5 == obj6){
        println("obj5와 obj6은 같은 객체입니다.")
    }else {
        println("obj5와 obj6은 다른 객체입니다.")
        //일반 클래스의 경우 객체의 주소값을 비교하기에 다르기에 else 가 출력됨
    }

    var obj7 = TestClass2(100,200,300)
    var obj8 = TestClass2(100,200,300)
    if(obj7 == obj8){ // == 연산자를 사용하면 equals라는 메서드를 사용한다.
        println("obj7와 obj8은 같은 객체입니다.")
        // 두 객체가 가지고 있는 값이 같은지 아닌지 비교하기에 true 로 출력
    }else {
        println("obj7와 obj8은 다른 객체입니다.")

    }

    println("------------------------------------------")
    //data class의 메소드 사용(copy)

    val obj10 = obj7.copy()
    println("ojb10.a1 : ${obj10.a1}")
    println("ojb10.a2 : ${obj10.a2}")
    println("ojb10.a3 : ${obj10.a3}") // 주생성자의 멤버만을 가지고 반환하기에 a3는 복제가 안된다.

    println("------------------------------------------")

    val str1 = obj5.toString()
    val str2 = obj7.toString()
    println("str1 : $str1")
    println("str2 : $str2")

    println("------------------------------------------")

    //dataClass의 메소드 사용(componentN)
    val num1 = obj7.component1()
    val num2 = obj7.component2()
    println("num1 : $num1")
    println("num1 : $num2")

    var obj11=TestClass3(100,200,300)
    var num3 = obj11.component1()
    var num4 = obj11.component2()
    var num5 = obj11.component3()

    println("num3 : $num3")
    println("num3 : $num4")
    println("num3 : $num5")

    //아래처럼 그냥 참조변수를 이용해서 뽑아내면 되기때문에 사실상 쓸 일이 없다.
    // 단지 객체분해와 관련이 있다.
    println("${obj11.a1}")

    println("------------------------------------------")

    val(num12,num13,num14) = obj11 // decompile 을 보면 객체를 자동으로 분해해서 담아냄
    println("num12 : $num12")
    println("num13 : $num13")
    println("num14 : $num14")



}
    //일반 클래스
    class TestClass1 (var a1:Int, var a2 : Int){

        var a3: Int = 0
        init {
            println("TestClass1의 init")
        }

        constructor(a1:Int, a2:Int, a3:Int) : this(a1,a2){
            this.a3=a3
        }

        fun testMethod1(){
            println("TestClass1의 testMethod 입니다.")
        }
    }

    //data 클래스
    data class TestClass2(var a1 : Int, var a2 : Int) // 반드시 주생성자를 만들어줘야한다.
    {
        var a3:Int =0

        init{
            println("TestClass2의 init")
        }

        constructor(a1:Int,a2:Int,a3:Int) :this(a1,a2){ //부생성자 생성
            this.a3 = a3
        }

        fun testMethod2(){
            println("TestClass2의 TestMethod2 입니다. ")
        }
    }


    data class TestClass3(var a1 : Int, var a2 : Int, var a3 : Int)