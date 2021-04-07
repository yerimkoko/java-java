package InfLearn.homework;
import InfLearn.homework.vo.Beverage;

import java.util.Scanner;

/*
 음료수 (500원) 자판기가 있습니다.
 사장님은 자판기에 10개의 음료수를 보관하고 있습니다.
-----------------------------
1. 구입하기
2. 현재 남은 수량 확인하기
-----------------------------
1번을 클릭하면
“얼마를 넣으시겠습니까?: ” 하고  1200원을 넣으면
“음료수 2개를 구매하였습니다 잔돈은 200원입니다”
2번을 클릭하면 (2개 빠져나갔으니깐)
“현재 음료수는 8개 남았습니다!”
 */
public class main {
    public static void main(String[] args) {

        int remainder = 0;
        Beverage beverage = new Beverage();
        Scanner scanner = new Scanner(System.in);
        boolean loopContinue = true;
        while (loopContinue) {
            System.out.println(" ------------------------------");
            System.out.println("| 예림스 자판기에 오신 것을 환영합니다!  |");
            System.out.println(" ------------------------------");
            System.out.println("1. 구매하기");
            System.out.println("2. 현재 남은 수량 확인하기");
            System.out.println("3. 종료하기");
            int chooseOne = scanner.nextInt();
            if (chooseOne == 3) {
                loopContinue = false;
                System.out.println("종료되었습니다.");
            }

            whatYouChoose(chooseOne, scanner, beverage, remainder);
        }
    }

    public static void whatYouChoose(int chooseOne, Scanner scanner, Beverage beverage, int remainder) {
        if (chooseOne == 1) {
            System.out.println("구입하기 버튼을 클릭하셨습니다.");
            System.out.println("얼마를 자판기에 투입하시겠습니까?");
            int won = scanner.nextInt();
            beverage.setInputAmount(won);
            beverage.setChanges(won);
            beverage.setTheQuantityToBuy(won);
            System.out.println("("+beverage.getTheQuantityToBuy()+") 개 구매하고 ("+beverage.getChanges()+ ") 원 반환되었습니다.");
        }
        else if (chooseOne == 2) {
            beverage.setRemainingQuantity();
            System.out.println("현재 남은 수량을 확인하기를 선택하셨습니다.");
            System.out.println("현재 남아있는 음료수는"+beverage.getRemainingQuantity()+"개 남아있습니다.");

        }
    }
}


