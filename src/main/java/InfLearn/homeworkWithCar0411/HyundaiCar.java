package InfLearn.homeworkWithCar0411;

public class HyundaiCar extends Car {
    public HyundaiCar(String name, int number) {
        super(name, number);
    }

    public void move() {
        super.move();
        System.out.println("슈우웅");
    }
}
