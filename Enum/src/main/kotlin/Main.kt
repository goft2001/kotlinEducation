    /*
        열거형
         - 프로그램 개발 시 특정 그룹안의 구성 요소를 정의하는 값이 필요하고자 할 때 사용한다.
         - 예를 들어 방향을 나타내는 값을 나타낼 때 동서남북, 성별 : 남자 여자 이런 상태를 정의할 때 사용한다.
         - 열거형은 정의한 단어 자체가 프로그램에서 사용하는 값이 된다.

     */


fun main() {
    //3. 출력
    printDirection(Direction.EAST)
    printDirection(Direction.WEST)
    printDirection(Direction.NORTH)
    printDirection(Direction.SOUTH)

    var dir:Direction =Direction.WEST
    println(dir)

    println(Direction.SOUTH) // 단어 값 자체로 출력

    println("--------------------------------------------")

    printNumber(Number.TWO)
}
    //1. enum 클레스를 만들어 담고
    enum class Direction{
        NORTH, SOUTH, WEST, EAST
    }

    enum class Number(val num : Int, val str:String){
        ONE(1,"일"),TWO(2,"이"),THREE(3,"삼")
        // 여러개로 다르게 정의하면 분기해서 작업도 가능
    }

    //2. 각 변수를 정의하고
    fun printDirection(a1:Direction){

        when(a1){
            Direction.NORTH -> println("북쪽")
            Direction.SOUTH -> println("남쪽")
            Direction.WEST -> println("서쪽")
            Direction.EAST -> println("동쪽")
        }


    }

    fun printNumber(a1:Number){
        when(a1.num){
            1 ->println("1입니다.")
            2 ->println("2입니다.")
            3 ->println("3입니다.")
        }
        println("a1.num : ${a1.num}")
        println("a1.str : ${a1.str}")
    }