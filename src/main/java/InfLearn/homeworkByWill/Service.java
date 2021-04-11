package InfLearn.homeworkByWill;

public class Service {
    public static void main(String[] args) {
        Movable kiaCar = new KiaCar("기아차",8255);
        Movable hyundaiCar = new HyundaiCar("현대차", 2468);
        // Car는 인터페이스를 구현해준다.

        kiaCar.move();
        hyundaiCar.move();

    }
}
