package InfLearn.ver2_lec03;

public class MainMethod {
    // 추상클래스 : 상속과 인터페이스를 모두 사용하기 위한 클래스 인터페이스+ 확장된 기능 -> 기능목록, 같은 메서드 이지만 공통된 기능을 추가해주기도 한다.

    public static void main(String[] args) {

        System.out.println("메인 메소드를 실행합니다.");

        ExtendsClass extendsClass = new ExtendsClass();
        extendsClass.methodSecond();
        int thirdResult = extendsClass.methodThird();
        System.out.println("세 번째 값입니다. ::: " + thirdResult);




    }

}
