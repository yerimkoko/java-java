package InfLearn.lec03;

public class Sample02 {
    public static void main(String[] args) {


        StringBuilder sbPlus = new StringBuilder("");
        String strSave = "";


        String[] arrStr = new String[]{"가", "나", "다", "라", "마", "바", "사"};

        for (int i = 0; i < 7; i++) {
            int mathRandom = (int) (Math.random() * 7);
            System.out.println("랜덤하게 값을 출력합니다. :::" + arrStr[mathRandom]);
            System.out.println(mathRandom);
            strSave = strSave+arrStr[mathRandom];
        }

        System.out.println("strSave::: " + strSave);
    }
}
