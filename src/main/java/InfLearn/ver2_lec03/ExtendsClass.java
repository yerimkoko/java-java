package InfLearn.ver2_lec03;

import org.w3c.dom.ls.LSOutput;

public class ExtendsClass extends AbstractClass{
    @Override
    public void methodFirst() {
        System.out.println("상속받은 클래스의 오버라이드된 methodFirst");
    }

    @Override
    public void methodSecond() {
        System.out.println("상속받은 클래스에서 약간의 로직이 더 들어갑니다.");
        super.methodSecond(); // 부모클래스의 기능을 불러온다. 로직의 흐름을 따라갈 수 있다.
    }

    @Override
    public int methodThird() {
        int getData = super.methodThird();
        int addMoreValue = 12;
        return getData + addMoreValue;
    }

}
