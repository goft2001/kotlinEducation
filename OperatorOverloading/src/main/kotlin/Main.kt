    /*
        연산자 동작 원리
          - java에서 정수와 정수를 더하면 더하기 연산을 수행하여 결과를 전달한다.
          - kotlin은 모든 값을 객체로 만들어 객체로 관리하기 때문에 코드에 정수를 작성하면
            정수로 관리하는 것이 아닌 정수 값을 관리하는 객체를 생성하여 객체로 관리하게 된다.
          - 따라서 더하기 연산 자체가 일반적인 연산방식으로 동작하지 못한다.
          - kotlin에서는 객체와 객체를 연산자를 통해 연산하게되면 연산을 수행하는 것이 아닌
            객체 내의 메서드를 호출한다.
          - 호출된 메서드의 객체를 반환 받아 이를 연산의 결과로 사용하게 된다.
     */


fun main() {
    val num1 =100
    val num2 = 200
    val a1 = num1+num2
    println("a1: $a1")

    val a2=100.plus(200) // 강의에서 안된다 했으나, 된다.
    val a3=num1.plus(200)
    println("a2: $a2")
    println("a3: $a3")

    println("-------------------------------------")

    var obj1 = TestClass(100,200)
    var obj2 = TestClass(1000,2000)

    val obj3 = obj1+obj2
    println("obj3.a1 : ${obj3.a1}")
    println("obj3.a2 : ${obj3.a2}")

    val obj4 = obj1-obj2
    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")



}
        // a1.plus(더할값) 형태이기에
    class TestClass(var a1:Int, var a2:Int){
        operator fun plus(target:TestClass) : TestClass{
            val r1 = this.a1 + target.a1
            val r2 = this.a2 + target.a2

            val result = TestClass(r1,r2)
            return result
        }

        operator fun minus(target: TestClass):TestClass{

            val r1 = this.a1 - target.a1
            val r2 = this.a2 - target.a2


            return TestClass(r1,r2)

        }
    }


