package InfLearn.ver2_lec01;

public class CocaCola extends Cola { // Cola 클래스 상속

    @Override //부모 클래스 속성을 그대로 보여준다. 콜라라는 이름을 받아서 사용하는 클래스이다.
    public void showColaProperty() {
        super.showColaProperty();
    }

    @Override
    public void showColaName(String getColaName) {
        super.showColaName(getColaName);
    }

    public void whereIsCocaCola() {
        System.out.println("미국 조지아");
    }
}
