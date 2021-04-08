package InfLearn.practice;

public class MainMethod {
    public static void main(String[] args) {
        PandaBear pandaBear = new PandaBear();
        IceBear iceBear = new IceBear();

        pandaBear.showBearName("pubao");
        pandaBear.whereIsPubao("pubao");
        iceBear.showBearName("icebear");
        iceBear.whereIsIceBear("icebear");
        pandaBear.showBearProperty();
    }
}
