package InfLearn.lec03;

public class Sample01 {
    public static void main(String[] args) {
//        for (int x = 2; x < 10; x++) {
//            System.out.println("--------"+x + "단--------");
//            for (int y = 1; y < 10; y++) {
//                System.out.println(x + "*" + y + "=" + (x * y));
//            }
//        }
//
//        for (int i = 0; i < 10; i++) {
//            int random = (int) (Math.random() * 10);
//            System.out.println("random:: " + random);
//        }
 /*       for (int i = 0; i < 10; i++) {
            int getMathRandom = (int) (Math.random() * 10);
            System.out.println("getMathRandom:: " + getMathRandom);

            if (getMathRandom % 2 == 0) {
                System.out.println("랜덤값은 짝수 입니다.");
                if (getMathRandom % 4 == 0) {
                    System.out.println("4로 나누어서 0으로 떨어집니다.");
                } else {
                    System.out.println("4로 나누어서 0으로 떨어지지 않습니다.");
                }
            } else {
                System.out.println("랜덤값은 홀수입니다.");
                if (getMathRandom % 3 == 0) {
                    System.out.println("3으로 나누어 떨어져서 0으로 떨어집니다.");
                } else {
                    System.out.println("3으로 나누어서 0으로 떨어지지 않습니다.");
                }
            }

        }*/

/*    for (int i = 0; i < 10; i++) {
        if (i % 2 == 0){
            System.out.println(i+" :: 현재 반복문은 짝수입니다.");
        }
        else{
            System.out.println(i+" :: 현재 반복문은 홀수입니다.");
        }
        }*/


        StringBuilder sbPlus = new StringBuilder("");
        String[] arrStr = new String[] {"가","나","다","라","마","바","사","자","차"};

        for (int i = 0; i < 9; i++ ) {
            int mathRandom = (int) (Math.random() * 10);
            System.out.println("랜덤하게 값을 출력합니다. ::: " + arrStr[mathRandom]);
        }
    }


}
