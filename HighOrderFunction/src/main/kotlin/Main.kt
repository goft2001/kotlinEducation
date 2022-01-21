    /*
        고차함수
         - 함수를 매개변수로 받거나 반환 타입이 함수인 함수를 고차 함수라고 부른다.
         - 함수 호출 시 전달하는 함수와 반환 하는 함수는 람다식을 사용할 수도 있다.
     */

fun main() {
    println("----------------1.함수를 매개로 받는고차함수---------------------")
    //1. 함수를 매개변수로 받는 고차함수
    val t1 = fun(x1:Int,x2:Int):Int{ //익명함수만 고차함수 내의 함수에 전달가능
        return x1+x2
    }
    // 객체에 담아서 전달
    testFunc1(t1,100,200)

    //바로 넣어줘도됨
    testFunc1(fun(x1:Int,x2:Int):Int{ return x1-x2}
        ,100,200
    )
    //lamda도 전달이 가능
    val lamda1 = {x1:Int, x2:Int ->x1*x2}
    testFunc1(lamda1,100,200)

    //lamda 바로 작성도 가능
    testFunc1({x1:Int,x2:Int->x1/x2},200,100)

    println("----------------2.함수나 람다를 반환하는 고차함수---------------------")
    val t2= testFunc2()
    val r2=t2(100,200)
    println("r2: $r2")

    //lamda도 전달가능
    val t3 =testFunc3()
    val r3 =t3(100,200)
    println("r3:$r3")


    println("----------------3.매개변수가 하나인 고차함수---------------------")

    //lamda 매개변수가 하나일 땐 1처럼 타입을 명시해도 되지만 it 으로 지정하면된다.
    testFunc4({x1:Int ->x1+100},200) //1)
    testFunc4({it+100},200)          //2)a1의 값이 it에 자동으로 들어간다.

    println("----------------3.함수를 뒤에 배치한 고차함수---------------------")
    testFunc5(100,200 ,{x1:Int,x2:Int->x1+x2})
    testFunc5(100,200)
    {x1:Int,x2:Int->x1+x2}
    //함수가 인자값중 맨 뒤에 있을 떄 괄호를 벗어나서 람다식을 적어도 됨
    //why? lamda식 이 길어질 경우 코드의 가독성을 올리고 개발에 편의를 위해 해당 방식을 지원함
    //때문에 lamda 나 함수를 매개변수로 받는 고차함수의 경우 제일 뒤에 배치하는 경우가 일반적이다.
    println("----------------4.함수하나만 매개변수로 받고 매개변수가 없을때---------------------")
    testFunc6 { x1:Int ->println(x1) }

    testFunc6{println(it)}
}
    //1. 함수를 매개변수로 받는 고차함수
    fun testFunc1(m1:(Int,Int)->Int,a1:Int,a2:Int)
    // 3번째 인자는 정수형 두개를 받아 정수를 반환하는 타입을 나타냄
    // 매개변수로 함수를 받았기에 고차함수라고 한다.
    {
        var r1 = m1(a1,a2)
        println("r1:$r1")
    }



    //2. 반환값이 함수인 고차함수
    fun testFunc2() : (Int,Int)->Int{

        return fun(x1:Int,x2:Int):Int{
            return x1*x2
        }
    }
    fun testFunc3() :(Int,Int)->Int{
        return {x1:Int,x2:Int->x1-x2}
    }

    //3. 매개변수가 하나인 고차함수
    fun testFunc4(m1:(Int)->Int,a1:Int){
        val r4 = m1(a1)
        println("r4: $r4")
    }

    //4. 함수를 받는 매개변수를 뒤에다가 배치했을 때
   fun testFunc5(a1:Int,a2:Int,m1:(Int,Int)->Int){
        var r5 =m1(a1,a2)
        println("r5:$r5")
    }
    //5. 함수하나만 매개변수로 받고 매개변수가 없을때
    fun testFunc6(m1:(Int)->Unit){
        m1(100)

    }