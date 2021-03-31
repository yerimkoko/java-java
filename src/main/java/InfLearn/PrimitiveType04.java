package InfLearn;

import java.util.Date;

public class PrimitiveType04 {
    public static void main(String[] args) {
        Date today = new Date();

        boolean isTrue = false;

        int accountDocumentCount = 10;
        int humanResourceDocumentcount = 20;
        int productionDocumentCount = 15;
        int salesDocumentcount = 25;

        int totalDailyDocumentCount = accountDocumentCount
                + humanResourceDocumentcount + productionDocumentCount + salesDocumentcount;
        System.out.println(totalDailyDocumentCount);
    }
}
