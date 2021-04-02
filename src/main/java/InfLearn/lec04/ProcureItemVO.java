package InfLearn.lec04;
/**
 * 구매품목
 */


/***
 * getter (가져오다), setter (저장하다)를 쓰는 이유?
 * private 으로 선언한 값은 외부에서 사용할 수 없기 때문에 getter와 setter를 사용한다.
 */
public class ProcureItemVO {
        private int id;
        private String name;
        private int quantity;
        private int price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override // toString -> 문자열로 바꿔준다 왜 사용?? => 값의 형태를 파악 (어떤 값들이 파악이 되는지!)
    public String toString() {
        return "ProcureItemVO{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", quantity = " + quantity +
                ", price = " + price +
                '}';
    }
}
