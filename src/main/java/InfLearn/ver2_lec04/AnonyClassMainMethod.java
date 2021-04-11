package InfLearn.ver2_lec04;

public class AnonyClassMainMethod {

    public static void main(String[] args) {
        Runnable action = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable이 구동 중입니다.");

            }
        };

        action.run(); //runnable class 는 스레드 관련 클래스이다.


    }
}
