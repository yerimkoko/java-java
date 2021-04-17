package MidtermExam_201710052;


public class Program {
    public static void main(String[] args) {
        // 1-1번 별찍기
        Figure figure = new Figure(10);
        figure.rectangle();

        // 1-2 구구단
        Multiple multiple = new Multiple();
        multiple.evenMultiple();
        multiple.oddMultiple();

        // 2번. 한세 자바 계산기
        HanseiCalculator hanseiCalculator = new HanseiCalculator();
        hanseiCalculator.calculator();

    }
}
