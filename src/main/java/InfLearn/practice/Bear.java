package InfLearn.practice;

public class Bear {
    public String BearName = String.valueOf("곰");

    public void showBearProperty()
    {
        System.out.println("곰은 포유류에요");
    }

    public void showBearName(String getBearName) {
        BearName = String.valueOf(getBearName);
        System.out.println("곰 이름: "+ BearName);
    }
}
