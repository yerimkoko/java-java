package InfLearn.practice;

public class practiceClass01 {
    public static void main(String[] args) {
        practiceUserVo practiceUserVo = new practiceUserVo(); // 클래스 생성

        System.out.println("아무것도 셋팅하지 않은 객체::: " + practiceUserVo.toString());

        practiceUserVo.setId(2);
        practiceUserVo.setMajor("컴퓨터공학");
        practiceUserVo.setName("고예림");

        System.out.println(practiceUserVo.toString());

    }
}
