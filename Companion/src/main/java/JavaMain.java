
public class JavaMain {

    public int javaA1 = 100;

    public static int  javaA2 = 200;

    public void javaMethod1(){
        System.out.println("javaMethod1");

    }

    public static  void javaMethod2(){
        System.out.println("javaMethod2");
    }

    public static void main(String [] args){

        TestClass t1 = new TestClass();
        System.out.printf("T1.a1 : %d\n", t1.getA1());
        t1.testFun1();

        // kotlin의 정적 멤버를 가져올 때 (Compaion)
        // 방법 1. java에서 불러올 때 Companion 붙이기

        System.out.printf("TestClass.a2 : %d\n", TestClass.Companion.getA2())   ;
        TestClass.Companion.testFun2();

        // 방법 2. kt 파일에서 정적멤버 위에 @JvmStatic 붙이기
        System.out.printf("Test.a2 : %d\n",TestClass.getA2() );

    }
}