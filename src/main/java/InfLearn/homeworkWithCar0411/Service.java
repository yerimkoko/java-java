package InfLearn.homeworkWithCar0411;

public class Service {
    public static void main(String[] args) {
        Car hyundaiCar = new HyundaiCar("νλ", 4468);
        KiaCar kia = new KiaCar("κΈ°μ", 8864);
        hyundaiCar.move();
        kia.move();
    }

}
