package InfLearn.lec02;

public class WhileLoop04 {
    public static void main(String[] args) {
//        int whileCnt = 0;
//        while (whileCnt < 10) {
//            whileCnt ++;
//            System.out.println("whileCnt :: "+whileCnt);
//        }

        int whileCnt = 0;
        boolean isTrue = true;


            for (int i = 0; i<10; i++) {
                if (i % 3 == 0) {
                    continue; // 특정 조건을 만났을 때, 해당 조건문 내에서 continue 문장을 만나면 맨 위로 올라간다.
                }
                System.out.println(i);
            }
    }
}
