
    /*
        Generic
         - kotlinl 에서 타입 지정은 클래스를 만들때 타입을 선언하거나 최초의 값이 설정 될 때 자동으로
           지정되기 때문에 생략하기도 한다.
         - type 을 유동적으로 하고 싶을 때 즉, 클래스를 만들 때가 아니라 객체를 만들 때 설정하고 싶으면
           Generic 을 쓰면 된다.
         - code 는 같으나 type 만 달라져야 할 경우 굳이 여러 클래스를 만들지 않고도 사용 가능하다


     */

fun main() {
    val t1 = TestClass1<Int>() // 객체 생성할때 type 지정
    t1.testMethod1(100)

    val t2 = TestClass1<String>()
        t2.testMethod1("문자열")

    println("--------------------------------")

    val t3 = TestClass2<Int>(100)
        t3.testMethod2(200)

    val t4 = TestClass2<String>("문자열1")
        t4.testMethod2("문자열2")

    println("--------------------------------")
    val t5 = TestClass3<Int,String>()
        t5.testMethod3(29,"서인기")


    val t6 = TestClass4<Int,Double,String,Boolean>(100,11.11)
        t6.testMethod4("문자열", true)
    println("--------------------------------")


    //상속관계일 때 (불변성)
    val t7 :TestClass5<SubClass1> = TestClass5<SubClass1>()
//    val t8 :TestClass5<SubClass2> = TestClass5<SubClass1>()     //타입이 다르면 상속관계라
//    val t9 : TestClass5<SuperClass1> = TestClass5<SubClass1>()  //하더라도 무조건 담을 수 없다.


    //공변성
    val t10 : TestClass6<SubClass1> = TestClass6<SubClass1>()
//    val t11 : TestClass6<SubClass2> = TestClass6<SubClass1>()
    val t12 : TestClass6<SuperClass1> = TestClass6<SubClass1>()
    //제너릭을 설정할 때 out 을 붙여주면 부모타입의 변수에는 담을 수 있다.

    //반 공변성 : 안정성이 떨어지기 때문에 잘 사용하지 않는다.
    val t13 : TestClass7<SubClass1> =TestClass7<SubClass1>()
    val t14 : TestClass7<SubClass2> =TestClass7<SubClass1>()
  //  val t15 : TestClass7<SuperClass1> =TestClass7<SubClass1>()
}




    //generic 사용 문법 T 는 임의의 문자 (Type)
    class TestClass1<T>{

        fun testMethod1(a1:T){
            println("a1 : $a1")
        }
    }

    class TestClass2<T>(var a1 : T){ //주생성자 생성

             fun testMethod2(a2:T){
            println("a1 : $a1")
            println("a2 : $a2")
        }
    }
    // 동시에 여러 타입 작성이 가능하다.
    class  TestClass3<A,B>{

        fun testMethod3(a1:A,a2:B){

            println("a1: $a1")
            println("a2: $a2")
        }


    }

    // 주생성자도 똑같이 여러 타입이 가능하다.
    class  TestClass4<A,B,C,D>(var a1 : A, var a2:B){

        fun testMethod4(a3:C,a4:D){
            println("a1: $a1")
            println("a2: $a2")
            println("a3: $a3")
            println("a4: $a4")
        }
    }

    open class SuperClass1                  //부모

    open class SubClass1 : SuperClass1()

    class SubClass2 : SubClass1()            //자식

    //불변성(무공변성)
    class TestClass5<A>()

    //공변성
    class TestClass6<out A>()

    //반 공변성
    class TestClass7<in A>()


