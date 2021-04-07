package InfLearn.homework.vo;

public class Beverage {
    private int remainingQuantity = 10; // 음료수의 남은 수량
    private int theQuantityToBuy; // 구매할 수량
    private int inputAmount; // 투입 금액
    private int changes; // 거스름돈

    public int getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity() {

        this.remainingQuantity = 10 - theQuantityToBuy;
    }

    public int getTheQuantityToBuy() {
        return theQuantityToBuy;
    }

    public void setTheQuantityToBuy(int inputAmount) {
        this.theQuantityToBuy = inputAmount / 500;
    }

    public int getInputAmount() {
        return inputAmount;
    }

    public void setInputAmount(int inputAmount) {
        this.inputAmount = inputAmount;
    }

    public int getChanges() {
        return changes;
    }

    public void setChanges(int inputAmount) {
        this.changes = inputAmount % 500;
    }


    @Override
    public String toString() {
        return "Beverage{" +
                "remainingQuantity=" + remainingQuantity +
                ", theQuantityToBuy=" + theQuantityToBuy +
                ", inputAmount=" + inputAmount +
                ", changes=" + changes +
                '}';
    }
}
