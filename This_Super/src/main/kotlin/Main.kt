/*
    this
     - 객체 자기 자신을 지칭한다.
     - 멤버 변수와 메서드 내부의 변수를 구분할 때 사용한다.
     - 멤버 베서드와 메서드 내부의 메서드를 구분할 때 사용한다.
     - 생성자에서 다른 생성자를 호출할 때 사용한다.

    super
     - 부모를 지칭한다.

 */

fun main() {
    var obj1 = TestClass1(100)
    obj1.testMethod1()

    var obj2 = SubClass()
    obj2.subMethod1()

}

class TestClass1 (var a2:Int){

    var a1 = 100


    constructor() : this(100) // 보조생성자를 만들땐 주생성자를 반드시 호출해줘야 한다. (this 사용)



    fun testMethod1()
    {
        var a1 =200
        println("a1:$a1")//위의 멤버변수보다 메서드 안의 변수가 우선이 되어 출력이 된다.
        println("this.a1 ${this.a1}")

        fun testMethod2(){
            println("testMethod1 내부의 testMethod2")
        }

    // 멤버변수를 사용하고 싶을 땐 this를 적는다. this는 객체 자신을 의미하기에 객체의 변수를 사용하게 된다.

        testMethod2() // 자신의 메서드 내부 testMethod2를 우선 실행
        this.testMethod2() // this를 붙이면 메서드 밖의 testMethod2 호출가능
        // 메서드안의 변수이름과 멤버변수가 이름이 같으면 내부의 것이 우선 호출되고
        // 멤버변수를 호출하기 위해선 this를 붙여준다.
    }

    fun testMethod2(){
        println("testMethod2")
    }
}

open class SuperClass(var a2:Int){

    open var a1 = 100 //변수도 따로 open을 통해 상속 받아 변경이 가능하다.

    open fun superMethod1(){ // 부모클래스의 superMethod
        println("SuperClass의 superMethod1")
    }
}

//1.주 생성자에 부모클래스의 생성자를 호출한 경우 !!
class SubClass : SuperClass(100)
    //부모 클래스의 주 생성자를 호출해야함
    {

   override var a1 = 1000 //상속받아 재구현 가능

    fun subMethod1(){
        println("a1:$a1")
        //상속받아 재구현한 값을 출력 ( 이 또한 내부에 변경된 값이 우선)
        println("super.a1 : ${super.a1}")
        //부모의 변수를 그대로 불러오고 싶을 때 super를 적용

        superMethod1() // 클래스 내부의 메서드 호출(있을시) 없을 시 부모메서드 호출
        super.superMethod1()  // 부모 클래스 의 메서드 호출
    }

    override fun superMethod1(){ //부모클래스의 메서드와 이름이 동일한 메서드
        super.superMethod1() // 보통 정상 동작시에 부모의 원래 메서드를 호출해줌(권장)
        println("SubClass의 superMehtod1")

    }
}

//2. 부모의 생성자를 만들지 않고 보조 생성자를 만든 경우
class SubClass2 : SuperClass
{
    constructor(a1:Int) : super(a1){

    }
    constructor(a1:Int, a2:Int) : super(a1){

    }
}