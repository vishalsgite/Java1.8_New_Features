package LambdaExpression;


//anonymous class method for implementing interface
public class testAnonymousClassMethodToImplementInterface {


    public static void main(String[] args) {

        functionalInterface1 f =  new functionalInterface1() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
                     f.sayHello();

    }


}
