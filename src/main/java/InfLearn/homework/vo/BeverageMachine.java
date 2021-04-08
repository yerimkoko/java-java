package InfLearn.homework.vo;

public class BeverageMachine {
    private int remainingQuantity; // 남은 수량
    private int machineAmount; // 자판기가 가지고 있는 돈
    private int price;
    private int balance; // 거슬러줄 돈

    // 생성자. (메소드명이 클래스명과 동일하고, 리턴 자료형이 없는 메소드)
    public BeverageMachine(int price, int remainingQuantity)
    {
        this.remainingQuantity = remainingQuantity;
        this.price = price;
        this.machineAmount = 0;
        this.balance = 0; // 잔돈을 줄 수 있다
    }

    // 들어온 돈에 맞게 음료수를 교환해주는 행위
    public int sell (int inputMoney)
    {
        int count =  inputMoney / price;
        this.remainingQuantity -= count;
        this.balance = inputMoney % inputMoney;
        return count;
    }

    // 거스름돈을 주는 행위
    public int outMoney ()
    {
        int won = this.balance;
        this.balance = 0;
        return won;
    }

    public int getRemainingQuantity() {
        return getRemainingQuantity();
    }


}