/*
    상속
    - 클래스를 설계할 때 다른 클래스가 가지고 있는 부분을 물려 받는 것을 의미한다.
    - 이를 통해 클래스마다 중복된 부분을 클래스 한 곳에 만들 수 있다.
    - 유지보수에 용의하다.

    중복된 요소를 가지고 있는 클래스들
    - 클래스는 객체를 생성할 때 사용하는 설계도 역할을 한다.
    - 상속을 하는 클래스를 부모 클래스(SuperClass)라고 하며 상속을 받는 클래스를
      자식 클래스(SubClass)라고 한다.
    - 자바에서는 아무것도 붙이지 않는다면 모두 부모 클래스가 될 수 있지만 개발자가 상속을 받지 못하게
      하려면 final을 붙이면 된다.
      하지만 kotlin은 반대로 부모 클래스는 open 키워드를 사용해야 한다. open 키워드를 사용하지 않으면
      자바 코드로 변경 될 때 final키워드가 붙는다.
 */
    fun main() {
        val s1 = SubClass1()
        println("s1.subMember1: ${s1.subMember1}")
        s1.subMember1()

        println("s1.superMember1: ${s1.superMember1}")
        s1.superMethod1()
    }

    //decompile 을 확인하면 final이 없는 것을 알 수있다.
    open class SuperClass1 { //부모 클래스
        var superMember1 = 100
        fun superMethod1(){
            println("SuperClass1의 메서드입니다.")
        }
    }


    class SubClass1 : SuperClass1(){ //자식 클래스

        val subMember1 = 200
        fun subMember1(){
            println("Subclass1의 메서드 입니다.")
        }

    }

    open class SuperClass2(val a1:Int) //부모 클래스

    class SubClass2 : SuperClass2(100) //자식 클래스

    class SubClass3 : SuperClass2{ // 위처럼 하고싶지 않을때 super키워드를 이용해서 부모클래스의 생성자를 직접 호출해도 됨

        constructor() :super(100)
    }