package InfLearn.lec04;

public class ObjClass02 {
// 구매 문서 클래스를 활용해서 코딩을 해보려고 한다.

    // 객체지향을 위해서!!
    public static void main(String[] args) {
        ProcurementDocument procurementDocument = new ProcurementDocument(); // 클래스를 활용할 수 있게됨. 클래스에 설계된 대로 객체를 생성.
        ProcurementDocument procurementDocument2 = new ProcurementDocument();
        //
        procurementDocument.procureRequestDocumentQty = 10;
        procurementDocument.orderRequestDocumentQty = 5;
        procurementDocument.orderDocumentQty = 3;
        procurementDocument.contractDocumentQty = 20;
        procurementDocument.estimateDocumentQty = 25;

        System.out.println(procurementDocument.procureRequestDocumentQty);
        System.out.println(procurementDocument.orderRequestDocumentQty);
        System.out.println(procurementDocument.orderDocumentQty);
        System.out.println(procurementDocument.contractDocumentQty);
        System.out.println(procurementDocument.estimateDocumentQty);

        int getTotalDocuQty = procurementDocument.totalDocumentQtyDailyMake();
        System.out.println("getTotalDocuQty:::" + getTotalDocuQty);

        int getStatictotalDocuQty = procurementDocument.staticValueCalculateDailyDocument();
        System.out.println(("getStatic"));



    }
}
