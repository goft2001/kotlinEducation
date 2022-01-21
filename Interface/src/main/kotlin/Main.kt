    /*
        인터페이스
         - kotlin 은 다중 상속을 지원하지 않는다.(java와 동일)
            다중상속? 특정 클래스가 동시에 두개 이상의 클래스를 상속 받는 것!
         - 이 때문에 자기 타입의 변수나 부모형 타입 변수에만 담을 수 있다.
         - 만약 생성된 객체의 주소 값을 다양한 타입의 변수에 담을 수 있도록 한다면
           인터페이스를 활용하면 된다.
         - 인터페이스는 클래스가 아니므로 객체를 생성할 때 사용할 수 없다.
         - 단, 클래스는 한 개 이상의 인터페이스를 구현할 수 있으며, 생성된 객체는
           구현한 인터페이스형 참조 변수에 담을 수 있다.
         - 인터페이스에는 추상메서드와 일반 메서드 모두를 구현해서 사용할 수 있다.
         - 인터페이스는 추상 클래스와 목적이 비슷하지만 하나의 클래스에 여러
           인터페이스를 구현할 수 있는 장점을 가지고 있다.

           문법 : 인터페이스는 abstract를 붙일 필요가 없다.
            interface 메서드명,메서드명 {
                fun method1()
                fun method2(){
                    println("Inter1의 method2"
                }
           }

     */

fun main() {
    //4. 3의 클래스를 객체로 생성해서 호출해보기
    val obj1 = TestClass1()
    val obj2 = TestClass2()

    testFun1(obj1)
    testFun2(obj2)

    //8. 7번에서 만든 클래스를 객체를 만들어 호출

    val obj3 = TestClass3()
    val obj4 = TestClass4()

    testFun3(obj3)
    testFun4(obj4)

    //10. 9번에서 만든 클래스를 객체를 만들어 호출
    val obj5 = TestClass5()
    testFun3(obj5)
    testFun4(obj5)



}

    //1.추상 메서드 생성
    open abstract class  AbstractClass1 {
        open abstract fun abstractMethod1()

    }

    open abstract class  AbstractClass2{
        open abstract fun abstractMethod2()

    }

    //2. 함수 생성

    fun testFun1(obj1:AbstractClass1){
        obj1.abstractMethod1()
        // 추상클레스의 메서드 호출
    }

    fun testFun2(obj2:AbstractClass2){
        obj2.abstractMethod2()
        // 추상클래스의 메서드 생성
    }

    //3. 메서드 생성 : 추상 메서드는 상속받은 클래스를 만들어서 객체생성을 해야 사용가능
    class TestClass1 : AbstractClass1(){
        override fun abstractMethod1() {
            println("TestClass1의 abstractMethod1")
        }
    }

    class TestClass2 : AbstractClass2(){
        override fun abstractMethod2() {
            println("TestClass2의 abstractMethod1")
        }
    }

    //5. 인터페이스 생성
    interface  Inter1{
        fun inter1Method1(){
            println("Inter1의 interMethod1입니다.")
        }
        fun inter1Method2() //추상메서드
    }

    interface Inter2{
        fun inter2Method1(){
            println("Inter2의 inter2Method1입니다.")
        }
        fun inter2Method2() //추상메서드
    }

    // 6. 인터페이스에 사용할 함수 생성
    fun testFun3(obj1:Inter1){
        obj1.inter1Method1()
        obj1.inter1Method2()
    }

    fun testFun4(obj1:Inter2){
        obj1.inter2Method1()
        obj1.inter2Method2()
    }

    //7. 인터페이스를 구현한 클래스 생성 (각각만들어도 되고 한꺼번에 만들어도 됨)

    class TestClass3 : Inter1{
        override fun inter1Method2() {
            println("TestClass3의 inter1method2입니다.")

        }
    }
    class TestClass4 : Inter2{
        override fun inter2Method2() {
            println("TestClass4의 inter2method2입니다.")
        }

    }

//9. 두개의 인터페이스를 하나의 클래스에 동시에 구현
class TestClass5 : Inter1, Inter2 {
    override fun inter1Method2() {
        println("testClass5의 inter1method2 입니다.")
    }

    override fun inter2Method2() {
        println("testClass5의 inter2method2 입니다.")
    }


}
