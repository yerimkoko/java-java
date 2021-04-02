package InfLearn.lec04;

/**
 * 구매품목문서
 */
public class ProcureItemDocument {
    public int id;
    public String procureItemName;
    public String procureItemUnitName;
    public int procureItemQty;
    public int procureItemPrice;

    public int addProcureItemQtyPrice() {
        int result = 0;
        result = procureItemQty * procureItemPrice;
        return result;

        // return procureItemQty * procureItemPrice; => 소나린트?? 같은 경우 이렇게 짜기도 한다.
    }

    public void showEachVariableValue() { // void가 붙은 메서드는 아무런 리턴을 하지 않는 메서드이다. 내부에서 로직을 수행하고 아무것도 리턴하지 않고 끝낸다.
        System.out.println("id ::: " + id);
        System.out.println("procureItemName ::: " + procureItemName);
        System.out.println("procureItemUnitName ::: " + procureItemUnitName);
        System.out.println("procureItemQty ::: " + procureItemQty);
        System.out.println("procureItemPrice ::: " + procureItemPrice);
    }

    public String concatStringValues() {
        String returnValues = "";
        returnValues = "안녕하세요" + "구매문서품목 클래스입니다.";
        return returnValues;
    }

}
