    /*
        // 상속 부분 미흡(복습)

        부모 클래스 타입의 변수
         - Kotlin의 모든 객체는 부모 클래스형 참조 변수에 담을 수 있다. (부모클래스는 자식클래스를 참조 변수에 담을 수 있다.)
         - 부모 클래스형 참조 변수를 사용하면 부모 클래스에 정의되어있는 멤버만 사용이 가능하다.

        Overriding
         - 부모 클래스가 가지고 있는 메서드를 자식 클래스에서 재 정의하는 개념이다.
         - 부모가 가지고 있는 메서드의 이름, 매개 변수 형태 모두 동일 해야 한다.

        Overriding 의 효과
         - 만약 객체가 부모형 참조변수에 담겨 있다면 부모 영역에 정의한 멤버만 사용할 수 있다.
         - 만약 부모의 메서드를 자식에서 Overriding 을 했다면 부모형 참조 변수롤 통해 자식의 메서드를 호출 할 수 있다.
         - 이는 이벤트 처리 방식에서 사건이 발생했을 경우 개발자가 만든 메서드를 호출하기 위해 사용하는 매우 중요한 개념이다.


     */


fun main() {
    val obj1:SubClass1 = SubClass1()
    println("obj1.subA1 : ${obj1.subA1}") //자기 자신을 정의한 멤버변수와 메서드
    obj1.subMehthod1()

    println("obj1.superA1 : ${obj1.superA1}") //부모로 부터 물려받은 멤버변수와 메서드
    obj1.superMethod1()

    println("------------------------------")
    // 자식을 부모클래스형 변수에게 담음 (중요)
    val obj2:SuperClass1 = obj1 // 부모클래스에 자식 클래스, 서로의 타입이 다르지만 상속관계이기 때문에 가능 (O)

    println("obj2.superA1 : ${obj2.superA1}") //부모클래스에 부모변수,메서드 (O)
    obj2.superMethod1()

//    println("obj2.subA1 : ${obj2.subA1}")  //부모 클래스에 자식변수,메서드 (X)
//    obj2.subMethod1()
    println("------------------------------")
    val obj3:SubClass2 = SubClass2()
    obj3.superMethod2()

    val obj4:SuperClass2 = obj3
    obj4.superMethod2()
    println("--------------------------------")

    val obj5:SuperClass3 = SuperClass3()
    overrideingTest(obj5)

    val obj6:SubClass3 = SubClass3()
    overrideingTest(obj6)


}

   open class SuperClass1{
        var superA1 = 100
        fun superMethod1(){
            println("SuperClass1의 superMethod1 입니다")
        }

    }

    open class SuperClass2 {
        open fun superMethod2(){ // 메서드 앞에 open을 붙이면 자식 클래스에서 재정의 할 수 있다.
            println("SuperClass2의 superMethod2")
        }
    }

    class SubClass2 : SuperClass2(){
        override fun superMethod2() {
            println("SubMethod2의 superMethod2")
        }
    }


    class SubClass1 : SuperClass1(){
        var subA1 = 200

        fun subMehthod1(){
            println("SubClass1의 subMethod1 입니다.")

        }

    }

    open class SuperClass3 {
        open fun superMethod3(){
            println("SuperClass3의 superMethod3")
        }
    }

    class SubClass3 : SuperClass3(){

        override fun superMethod3() {
            super.superMethod3()
            println("SubClass3의 superMethod3")
        }
    }

    fun overrideingTest(obj1:SuperClass3){
        obj1.superMethod3()
    }