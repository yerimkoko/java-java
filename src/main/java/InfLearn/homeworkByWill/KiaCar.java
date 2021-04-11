package InfLearn.homeworkByWill;

public class KiaCar extends Car {

    public KiaCar(String name, int number){
        super(name, number);
    }

    public void move() {
        System.out.println(name+number+" 부릉부릉");
    }

    public void carBreak() {
        System.out.println("멈췄습니다.");
    }



}
