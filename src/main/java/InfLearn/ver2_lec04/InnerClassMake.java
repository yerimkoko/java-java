package InfLearn.ver2_lec04;


public class InnerClassMake { // 이게 외부 클래스이다.

    public void outMainMethod1() {
        System.out.println("외부 클래스의 메소드1");
    }

    class SampleInnerClass {
        public void inMethod() {
            System.out.println("내부 클래스의 메소드1");
        }
    }
}
