package OOP;

public class CallStackTest {

    // CallStack Test 1
//    public static void main(String[] args) {
//        firstMethod(); // static 메서드는 객체 생성 없이 호출 가능하다.
//    }
//
//    static void firstMethod() {
//        secondMethod();
//    }
//
//    static void secondMethod() {
//        System.out.println("secondMethod()");
//    }

    // CallStack Test 2
    public static void main(String[] args) {
        System.out.println("main(String[] args) 시작되었음");
        firstMethod();
        System.out.println("main(String[] args) 끝났음");
    }

    static void firstMethod() {
        System.out.println("firstMethod() 시작");
        secondMethod();
        System.out.println("firstMethod() 끝");

    }

    static void secondMethod() {
        System.out.println("SecondMethod() 시작");
        System.out.println("SecondMethod() 끝");
    }

}
