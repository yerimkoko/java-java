package InfLearn.lec04;

public class ObjClass03 {
    public static void main(String[] args) {
        ProcureItemDocument procureItemDocument = new ProcureItemDocument();

        procureItemDocument.id = 1;
        procureItemDocument.procureItemName = "의자";
        procureItemDocument.procureItemUnitName = "개";
        procureItemDocument.procureItemPrice = 1000;
        procureItemDocument.procureItemQty = 1;

        int addItemQtyPrice = procureItemDocument.addProcureItemQtyPrice();
        System.out.println("addItemQtyPrice:::" + addItemQtyPrice);
        String concatStrval = procureItemDocument.concatStringValues();
        System.out.println("concatsStrVal:::"+concatStrval);

    }
}
