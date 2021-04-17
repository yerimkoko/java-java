package MidtermExam_201710052;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HanseiCalculator {
    private boolean exitCalculator = true;

    public HanseiCalculator() {
    }

    public void calculator() {
        while (exitCalculator) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n===== 한세 자바 계산기 메뉴 =====");
            System.out.println("[입력] 연산을 선택하세요(숫자 입력)");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("0. 종료");

            try {

                int selectOne = scanner.nextInt();

                if (selectOne == 1) {
                    plus();
                } else if (selectOne == 2) {
                    minus();
                } else if (selectOne == 3) {
                    multiple();
                } else if (selectOne == 4) {
                    division();
                } else if (selectOne == 0) {
                    System.out.println("[안내] 프로그램을 종료합니다.");
                    exitCalculator = false;
                }
                else {
                    System.out.println("[안내] 표시된 연산중 1개를 선택 해야합니다.");
                }
            }
            catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("[안내] 입력하신 데이터는 정수가 아닙니다.");
            }

        }
    }

    private void plus() {
        System.out.println("더하기를 선택하셨습니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("[입력] 첫번째 정수 입력하세요.");
        int n = scanner.nextInt();
        System.out.println("[입력] 두번째 정수 입력하세요.");
        int m = scanner.nextInt();
        System.out.println("[결과] " + n + " + " + m + " = " + (n + m));
    }

    private void minus() {
        System.out.println("빼기를 선택하셨습니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("[입력] 첫번째 정수 입력하세요.");
        int n = scanner.nextInt();
        System.out.println("[입력] 두번째 정수 입력하세요.");
        int m = scanner.nextInt();
        System.out.println("[결과] " + n + " - " + m + " = " + (n - m));
    }

    private void multiple() {
        System.out.println("곱하기를 선택하셨습니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("[입력] 첫번째 정수 입력하세요.");
        int n = scanner.nextInt();
        System.out.println("[입력] 두번째 정수 입력하세요.");
        int m = scanner.nextInt();
        System.out.println("[결과] " + n + " * " + m + " = " + (n * m));
    }

    private void division() {
        System.out.println("나누를 선택하셨습니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("[입력] 첫번째 정수 입력하세요.");
        int n = scanner.nextInt();
        System.out.println("[입력] 두번째 정수 입력하세요.");
        int m = scanner.nextInt();
        System.out.println("[결과] " + n + " / " + m + " = " + (n / m));
    }
}
