package InfLearn.lec05;
// SamsungElectronics 는 Electronics 의 선언된 값을 사용할 수 있다. => 상속 (부모 클래스의 개념을 상속받아서 자식클래스에서 쓸 수 있다)
public class SamsungElectronics extends Electronics {
    int productsCount = 0;
    // super는 extends를 통해 상속받은 부모 클래스의 값을 알아낼 때 사용될 수 있다.
    public void showCount() {
        System.out.println("show value::: " + productsCount);
        System.out.println("super.show value::: "+ super.productsCount);
    }

}
