package Exception;

public class MyException extends Exception {
    // 에러 코드 값을 저장하기 위한 필두를 추가한다.
    private final int ERR_CODE; // 생성자를 통해 초기화한다.

    MyException(String msg, int errCode) { //생성자
        super(msg);
        ERR_CODE = errCode;
    }

    MyException(String msg) { // 생성자
        this(msg, 100); // ERR_CODE를 100(기본값)으로 초기화 한다.
    }

    public int getErrCode() { // 에러 코드를 얻을 수 있는 메서드를 추가한다.
        return ERR_CODE; // 이 메서드는 주로 getMessage()와 함께 사용할 것이다.
    }

}
