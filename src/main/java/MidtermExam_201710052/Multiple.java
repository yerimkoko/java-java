package MidtermExam_201710052;

public class Multiple {
    public Multiple() {

    }

    public void evenMultiple() {
        System.out.println("[구구단 짝수 출력]");

        for(int i = 2; i < 10; i++ ) {
            if ( i % 2 == 0 )
                System.out.println("[" + i + "단]");
            for (int j = 1; j < 10; j++) {
                if (i % 2 == 0)
                System.out.println(i + " * " + j + " = "+i*j);
            }
        }
    }

    public void oddMultiple() {
        System.out.println("\n[구구단 홀수 출력]");
        for(int i = 2; i < 10; i++ ) {
            if ( i % 2 == 1 )
                System.out.println("[" + i + "단]");
            for (int j = 1; j < 10; j++) {
                if (i % 2 == 1)
                    System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
