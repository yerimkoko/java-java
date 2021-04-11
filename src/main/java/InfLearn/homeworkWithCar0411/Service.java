package InfLearn.homeworkWithCar0411;

public class Service {
    public static void main(String[] args) {
        Car hyundaiCar = new HyundaiCar("현대", 4468);
        KiaCar kia = new KiaCar("기아", 8864);
        hyundaiCar.move();
        kia.move();
    }

}
