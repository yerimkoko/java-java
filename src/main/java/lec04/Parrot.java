package lec04;
// 외부에 만들어져 있는 scanner를 가져온다.
import java.util.Scanner;

public class Parrot {
    /**
     * 앵무새 : 내가 입력한 문장을 똑같이 출력해주는 프로그
     */
    public static void main(String[] args) {
        System.out.println("앵무앵무 나는 앵무새 입니다....");


        // parrot 이라는 이름을 가진 스캐너, System 안으로 데이터를 가져온다.
        Scanner parrot = new Scanner(System.in);

        // parrot (Scanner) 이 한 줄을 읽어와 (nextLine) 문장(String) 상자 (이름: str)에 저장한다.
       String str = parrot.nextLine();

    }

}
