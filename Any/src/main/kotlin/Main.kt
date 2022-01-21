    /*
        Any 클래스
         - kotlin에서 사용하는 모든 클래스의 *부모 클래스이다.
         - kotlin은 클래스를 작성할 때 상속받지 않는다면 *자동으로 Any 클래스를 상속받는다.
         - Any 클래스에는 모든 객체가 가지고 있어야할 메서드가 제공되고 있으며 이 메서드들을 Overriding 하여
           각 클래스의 성격에 맞게 재 구현하여 사용할 수 있다.

    */

fun main() {

    val obj1 = TestClass1()
    println("obj1: $obj1")

    val obj2 = TestClass2()
    val obj3 = TestClass3()

    testFun1(obj1)
    testFun1(obj2)
    testFun1(obj3)


}

    class TestClass1{
        // 자동으로 Any를 상속받고 그 안에 toString 메서드(문자 리턴 메소드)를 사용해보자

        override fun toString(): String {
            return "TestClass1의 객체입니다."
        }
    }
    class TestClass2{
        override fun toString(): String {
            return "TestClass2의 객체입니다."
        }
    }
    class TestClass3{
        override fun toString(): String {
            return "TestClass3의 객체입니다."
        }
    }




    fun testFun1(a1:Any){
        // 어떤 메서드나 생성자를 정의할 때 매개변수로 모든 주소값을 받고자 할 때 Any를 쓸 수있다.
        println("a1:$a1")
    }