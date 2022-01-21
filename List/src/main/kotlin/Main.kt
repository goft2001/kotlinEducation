    /*
        컬렉션
         - 자료구조에 나오는 다양한 데이터 관리 기법을 사용할 수 있도록 제공하고 있는 라이브러리
         - List : 순서를 통해 관리한다.
         - Map : 이름을 통해 관리한다.
         - Set : 집합 관리
        List
         - 배열과 동일하게 인덱스 번호를 통해 객체를 관리한다.
         - 배열과 많은 부분이 비슷하지만 배열은 크기가 정해지면 변경할 수
           없지만 List 는 추가, 삭제 등이 가능하다.
        List 생성
         - listOf : 불변형 리스트 생성 (추천)
         - mutableListOf : 가변형 리스트 생성 (수정후 다시 바꾸는걸 추천)
         - emptyList : 비어있는 불변형 리스트를 생성한다.
         - listOfNotNull : null 을 제외한 나머지만으로 리스트를 생성한다.
        객체 가져오기
         - get : 0부터 시작하는 인덱스 번호를 통해 객체를 추출할 수 있다.
         - Kotlin 의 리스트는 배열과 동일하게 []을 사용할 수 있다.
        기타 메서드
         - indexOf : 지정된 값의 인덱스 번호를 반환한다. 값이 없을 경우 -1을 반환한다.
         - lastIndexOf : 지정된 값이 마지막에 해당하는 값의 인덱스 번호를 반환한다. 값이
                        없을 경우 -1을 반환한다.
         - subList : 지정된 범위의 값을 추출하여 새로운 리스트를 생성해 반환한다.
        가변형 리스트의 메서드
         - add(객체) : 객체를 추가한다.
         - add(인덱스, 객체) : 주어진 인덱스 위치에 객체를 삽입한다.
         - remove(객체) : 주어진 객체를 제거한다.
         - remobeAt(인덱스) : 주어진 인덱스의 객체를 제거한다.
         - set(인덱스, 객체) : 주어진 인덱스에 객체를 덮어씌운다.
     */

fun main() {

    val list1 = listOf(10,20,30,40,50)
    val list2 = listOf("문자열 1", "문자열2","문자열3")

    println("list1 : $list1")
    println("list2 : $list2")

    val list3 = mutableListOf<Int>() // 가변형이기에 아무것도 없는 List를 만드는게 의미가 있다.
                                    //다만 값을 추론할 수없기에 generlic을 명시해줘야한다.

    val list4= mutableListOf("가","나","다",null)

    println("List3 : $list3")
    println("List4 : $list4")

    val list5 = emptyList<Int>()
    println("List5 : $list5")

    val list6 = listOfNotNull(10,20,null,30,null,50,60)
    println("list6 : $list6") // null을 빼고 만들어준다.

    for(item in list1){
        println("list1:$item")
    }
    println("list1 size : ${list1.size}")

    println("--------------------객체 가져오기------------------------")
    println("list1 0 : ${list1.get(0)}")
    println("list1 1 : ${list1.get(1)}")
    println("list1 2 : ${list1[2]}")
    println("list1 3 : ${list1[3]}")

    println("------------------기타 메서드---------------------")

    val list7 = listOf(10,20,30,10,20,30)
    val index1 = list7.indexOf(20)
    println("index1 : $index1")

    val index2 = list7.lastIndexOf(20)
    println("index2 : $index2")

    val list8 =list1.subList(1,3)
    println("list8 : $list8")

    println("------------------가변형 리스트의 메서드---------------------")
    println("list3 : $list3")
    list3.add(10)
    list3.add(20)
    list3.add(30)

    println("list3 : $list3")

    list3.addAll(listOf(40,50,60))
    println("list3 : $list3")

    list3.add(1,100) //지정된 인덱스에 넣을때
    println("list3 : $list3")

    list3.addAll(2,listOf(200,300,400)) // 지정된 인덱스에 여러개를 넣을때
    println("list3 : $list3")

    list3.remove(100)
    println("list3 : $list3")

    list3.removeAll(listOf(200,300))
    println("list3 : $list3")

    list3.removeAt(1) //인덱스 1번의 값을 제거
    println("list3 : $list3")

    list3.set(1,200)
    println("list3:$list3")

    // set은 배열처럼 사용이 가능하기에 []를 쓰면된다.
    list3[2] = 300
    println("list3 : $list3")

    println("-----------------리스트 반환------------------")

    val list100 = list1.toMutableList()
    // list1의 값을 다 끄집어 내서 가변형으로 바뀜
    // list1은 바뀌지 않는다.
    list100.add(100)
    println("List100 : $list100")

    val list200 = list100.toList()
    //list200.add(300)
    // 불변형으로 바꿨기에 add 불가.

}