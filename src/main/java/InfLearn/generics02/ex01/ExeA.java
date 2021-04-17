package InfLearn.generics02.ex01;

public class ExeA<T> {//generic 을 지정한다. 어떤 타입이든 들어갈 수 있다. T 를 지정해줌으로써 여러가지 형태로 나타낼 수 있다.

    private T t;

    public ExeA(T t) {
        this.t = t;
    } // generic 타입을 이용한 생성자 함수

    public T getT() {
        return t;
    }

}
