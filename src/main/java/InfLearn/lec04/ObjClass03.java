package InfLearn.lec04;

public class ObjClass03 {
    public static void main(String[] args) {
        ProcureItemDocument procureItemDocument = new ProcureItemDocument();

        procureItemDocument.id = 1;
        procureItemDocument.procureItemName = "의자";
        procureItemDocument.procureItemUnitName = "개";
        procureItemDocument.procureItemPrice = 2000;
        procureItemDocument.procureItemQty = 5;

        int addItemQtyPrice = procureItemDocument.addProcureItemQtyPrice();

        System.out.println(addItemQtyPrice);
        System.out.println("addItemQtyPrice:::" + procureItemDocument.addProcureItemQtyPrice());
        System.out.println(procureItemDocument.procureItemPrice);
        String concatStrval = procureItemDocument.concatStringValues();
        System.out.println("concatsStrVal:::"+concatStrval);

    }
}
