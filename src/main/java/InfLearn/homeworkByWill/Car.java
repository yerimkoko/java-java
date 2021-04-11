package InfLearn.homeworkByWill;
// 추상 클래스: 틀만 제공해준다.
public abstract class Car implements Movable{
    protected String name;
    protected int number;

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }


    public abstract void move();  // 인스턴스를 생성할 수 없다. (인터페이스랑 마찬가지로) ..
    // 실제 구현체 x .. 나를 상속받는 것들은 필수적으로 move()를 자신만의 알고리즘으로 구현해야된다.



}
