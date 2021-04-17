package MidtermExam_201710052;

public class Figure {
    private int n;
    public Figure(int n) {
        this.n = n;
    }

    public void rectangle() {
       for (int i = 0; i < n; i ++) {
           for (int j = 0; j < n; j++) {
               System.out.println("*");
           }
           System.out.println();
       }
    }

    public void triangle() {
        for (int i = 0; i < n; i++) {
        }
    }

}
