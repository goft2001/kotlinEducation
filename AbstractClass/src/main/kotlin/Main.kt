    /*
        추상메서드와 추상 클래스
          - 추상 메서드는 구현되지 않은 메서드를 의미한다.
          - 추상 클래스는 추상 메서드를 가지고 있는 클래스를 의미한다.
          - 추상 클래스는 구현되지 않은 추상 메서드를 가지고 있기 때문에 완벽한 설계
            도라고 할 수 없다.
          - 이 때문에 추상클래스를 통해서는 객체를 생성할 수 없다.
          - 때문에 딱 한가지 방법인 상속을 받아 사용할 수 밖에 없다.
            ->추상클래스 상속 > 클래스 생성 > 추상 메서드를 구현 -> 자식클래스를 통해 객체를 생성
          - 추상 클래스의 목적은 자식 클래스에서 메서드를 Overriding을 하게 하기 위한
            강제성을 부여하기 위함이다.

        추상 클래스의 사용
          - open abstract class Super1 {
              fun method1(){
                    println("Super1의 method1입니다.")
              }

              open abstract fun method2()
          }
     */


fun main() {
//    val obj1 = Super1()
// 추상클래스는 직접적인 객체생성이 불가능하기 때문에 오류가남
//    testFun1(obj1)

    val obj2 =Sub1()
    testFun1(obj2)

    val obj3 = Sub2()
    testFun1(obj3)
}
   open abstract class Super1{

        fun method1(){
            println("Super1의 method1입니다.")
        }

        open abstract fun method2()

    }
    // 오버라이딩 했을 경우
    class Sub1 : Super1(){
        override fun method2() {
            println("Sub1의 method2 입니다.")
        }
    }
    // 오버라이딩 하지 않았을 경우 : 추상이 아니라면 부모의 메서드가 호출되고
    //추상 메서드일 경우 그 목적이 오버라이딩에 있기때문에 오류가 발생
    class Sub2 : Super1(){
        override fun method2() {
            println("Sub2의 method2 입니다.")
        }

    }


    fun testFun1(obj1:Super1){
        obj1.method1()
        obj1.method2()
    }