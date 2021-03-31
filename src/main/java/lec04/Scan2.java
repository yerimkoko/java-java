package lec04;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {


         Scanner scan = new Scanner(System.in);

        // 1. 작은 정수
        // int number = scan.nextInt();

        // 2. 큰 정수
        // long number = scan.nextLong();

        // 3. 작은 실수
        // float number = scan.nextFloat();

        // 4. 큰 실수
        // double number = scan.nextDouble();

        // System.out.println(number);

//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//        int age = scan.nextInt();
//        System.out.println("이름은? :" + name + " 나이는? :"+ age);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("받은 숫자 :"+ a+"\n" + b +"순서를 바꿔보기"+b+"\n" + a);
    }
}
