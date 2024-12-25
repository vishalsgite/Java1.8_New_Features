package LambdaExpression;


///using our functional interface using lambda Expression
public class ImplementInterfaceUsingLambda {

    public static void main(String[] args) {


        functionalInterface1 fn = () ->{
            System.out.println("Implemented functional Interface Using Lambda");
           };

        fn.sayHello();

        functionalInterface1 fn2 = () -> System.out.println("Implemented functional Interface " +
                "in single line Using Lambda");

        fn2.sayHello();
    }

}