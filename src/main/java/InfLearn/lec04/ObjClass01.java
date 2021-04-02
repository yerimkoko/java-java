package InfLearn.lec04;

public class ObjClass01 {
    public static void main(String[] args) {
        ProcureItemVO procureItemVO = new ProcureItemVO(); // procure

        System.out.println("아무 것도 셋팅하지 않은 객체::: " + procureItemVO.toString());

        procureItemVO.setId(1);
        procureItemVO.setName("옥수수");
        procureItemVO.setPrice(10000);
        procureItemVO.setQuantity(2);

        System.out.println("옥수수 vo : " + procureItemVO.toString());

        ProcureItemVO procureItemVoNull = null; // 변수명: 참조변수의 주소값,, exception : 예외처리.. 에러라고 표현 많이 함. 에러 !== 예외

        String sampleString = "가나다";
        String sampleExt = "abc";

    }
}
