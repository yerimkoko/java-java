package InfLearn.ver2_lec03;

public abstract class AbstractClass { // 추상클래스-> 구체적인 기능이 명시되지 않은 클래스
// 복잡한 기능제공 x,  간단한 로직,, 사용할 공통된 것..
    public abstract void methodFirst();

    public void methodSecond() {
        System.out.println("추상클래스 methodSecond");
        methodFirst();
    }

    public int methodThird() {
        return 10 + 2;
    }

}
