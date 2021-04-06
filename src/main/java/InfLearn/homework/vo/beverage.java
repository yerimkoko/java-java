package InfLearn.homework.vo;

public class beverage {
    private int beverageCount; //남은 음료수
    private int count; // 몇 개
    private int changes; // 잔여금.

    public int getCount() {
        return count;
    }
    public void setCount(int Count) {
        this.count = Count;
    }

    public int getChanges() {
        return changes;
    }
    public void setChanges(int changes) {
        this.changes = changes;
    }

    public int getBeverageCount() {
        return beverageCount;
    }
    public void setBeverageCount(int beverageCount) {
        this.beverageCount = beverageCount;
    }

    @Override
    public String toString() {
        return "beverage{" +
                "beverageCount=" + beverageCount +
                ", count=" + count +
                ", changes=" + changes +
                '}';
    }
}
