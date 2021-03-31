package InfLearn.lec03;

public class Sample03 {
    public static void main(String[] args) {
        String[] arrStr = new String[] {"가", "나", "다", "라"};
        for ( int i = 0; i < 3; i++) {
            int randomMath = (int)(Math.random()*4);
            System.out.println("랜덤하게 값을 출력합니다 :::" + arrStr[randomMath]);
            System.out.println(randomMath);
        }
    }
}
