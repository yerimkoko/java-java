package InfLearn.lec02;

public class DoWhile05 {

    public static void main(String[] args) {
        int whileCnt = 0;
        do {
            System.out.println("do, first");
            System.out.println(("whileCnt :::" + whileCnt));
            whileCnt++;
        } while(whileCnt < 3);
    }
}
