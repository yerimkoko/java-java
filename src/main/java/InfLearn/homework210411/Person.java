package InfLearn.homework210411;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("안뇽 나는"+name+"!!"+age+"살이얌");
    }
}
