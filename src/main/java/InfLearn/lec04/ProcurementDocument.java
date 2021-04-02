package InfLearn.lec04;

public class ProcurementDocument {
    public int procureRequestDocumentQty;
    public int orderRequestDocumentQty;
    public int orderDocumentQty;
    public int contractDocumentQty;
    public int estimateDocumentQty;


    // 변수?: 저장하는 공간, 메서드?: 계산하는 로직이 담겨있는 공간!

    public int totalDocumentQtyDailyMake() {
        int totalDocument = procureRequestDocumentQty + orderRequestDocumentQty
                + orderDocumentQty + contractDocumentQty + estimateDocumentQty;

        return totalDocument;
    }

    ;

    public int staticValueCalculateDailyDocument() {
        int totalDocuCnt = 0;

        totalDocuCnt = 10 + 5 + 1 + 3 + 5;

        return totalDocuCnt;
    }


}
