package InfLearn.homeworkWithCar0411;

public abstract class Car implements Movable{
    protected String name;
    protected int number;

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void move() {
        System.out.println(name+"차"+number+"번 부릉부릉");
    }
}
