import kotlin.math.atan2

/*
        함수형 프로그래밍
         - 자바 언어는 완벽한 객체지향 프로그래밍 언어이다.
         - 모든 코드는 클래스를 설계하고 메서드를 만들어주고 클래스를 통해 객체를 생성해서
           사용해야 한다.
         - 하지만 Kotlin은 함수만 만들어 사용하는 것을 지원한다.
         - kotlin 은 함수 사용을 보다 편리하게 할 수 있도록 다양한 개념들이 제공된다.

        람다식
         - 아래의 간단 표기법은 람다라는 것으로 바꾸어 사용할 수 있다.
         - 특정 함수 내에서만 사용하는 연산 코드를 사용할 때 사용한다.

         
     */


fun main() {
    val r1 = testFun1(100, 200)
    println("r1:$r1")

    val r2 = testFun2(100, 200)
    println("r2:$r2")

    val r3= testFun3(100,200)
    println("r3:$r3")

    //람다식 1.
    val lamda1 :(Int,Int) -> Int = {a1:Int, a2:Int ->a1+a2}
      // 람다1는 : 정수가 두개 들어가고 반환하는 구조이며 = 그 결과값이 {매개변수의 타입->그 결과} 들어감
    val r4 = lamda1(100,200)
    println("r4:$r4")
    //람다식 2. 식에서 자료형의 생략(추론 가능) 많이 사용
    val lamda2 = {a1:Int,a2:Int ->a1+a2}
    val r5 = lamda2(200,300)
    println("r5:$r5")
    //람다식 3. 결과값에서 자료형 생략
    val lamda3 : (a1:Int,a2:Int) -> Int = {a1,a2 ->a1+a2}
    val r6 = lamda3(400,500)
    println("r6 $r6")

    println("---------------testFun4-------------------")
    val r7 = testFun4(100,200)
    println("r7 : $r7")
    //lamda 식 변환

    //람다식 4. 복잡한 연산
    var lamda4 ={a1:Int,a2:Int ->
        val r1 = a1+a2
        val r2 = a1-a2
        r1*r2
    }
    var r8 = lamda4(100,200)
    println("r8 : $r8")

}

fun testFun1(a1:Int, a2:Int) :Int {
    return a1+a2
}

    //간단 표기법
// 함수 아래 코드가 한줄밖에 없다면 간단하게 표기가 가능하다. (반환타입 생략가능)
fun testFun2(a1:Int,a2:Int) : Int=a1+a2

// 반환타입 생략
fun testFun3(a1:Int, a2:Int) =a1+a2

fun testFun4(a1:Int, a2:Int) : Int{
    val r1=a1+a2
    val r2=a1-a2
    val r3=r1*r2
    return r3  //더한값 * 뺀값 리턴
}