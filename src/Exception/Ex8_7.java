package Exception;

public class Ex8_7 {
    public static void main(String[] args) {
        try { // Exception과 그 자손은 반드시 예외처리를 해야 한다.(필수)
            throw new Exception(); // Exception을 고의로 발생시킨다.
        } catch (Exception e) {

        }
        // RuntimeException과 그 자손은 에외처리를 해주지 않아도 컴파일이 된다.
        throw new RuntimeException();
    }
}
