package InfLearn.homeworkByWill;

public class HyundaiCar extends Car {
    public HyundaiCar(String carName, int carNumber) {
        super(carName, carNumber);
    }

    public void move() {
        System.out.println(name+number+" 부릉부릉");
    }
}
