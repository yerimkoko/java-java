package InfLearn.ver2_lec04;

public class InnerClassMainMethod {
    public static void main(String[] args) {
        InnerClassMake innerClassMake = new InnerClassMake();
        InnerClassMake.SampleInnerClass sampleInnerClass = innerClassMake.new SampleInnerClass();

        innerClassMake.outMainMethod1();;
        sampleInnerClass.inMethod();
    }
}
