package InfLearn.practice;

public class IceBear extends Bear{
    @Override
    public void showBearProperty() {
        super.showBearProperty();
    }

    @Override
    public void showBearName(String getBearName) {
        super.showBearName(getBearName);
        System.out.println("나는 아이스베어에요");
    }

    public void whereIsIceBear() {
        System.out.println("북극에 있어요");
    }
}
