package InfLearn.lec02;

public class CaseLogic02 {
    public static void main(String[] args) {
        int intParamA = 9;
        switch (intParamA) {
            case 0:
                System.out.println("intParamA는 0 입니다.");
                break;
            case 1:
                System.out.println("intParamA는 1 입니다.");
                break;
            case 2:

                System.out.println("intParamA는 2 입니다.");
                break;
            case 5:
                System.out.println("intParamA는 5 입니다.");
                break;
                default: // 해당하는 값이 없으면 기본적인 값을 실행한다.
                    System.out.println("intParamA는 default 입니다.");
                    break;

        }
    }
}
