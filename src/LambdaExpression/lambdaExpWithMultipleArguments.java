package LambdaExpression;

public class lambdaExpWithMultipleArguments {

    public static void main(String[] args) {

        functionalInterface2 fn = (int a , int b) ->{
            return a + b;
        };

        functionalInterface2 fn2 = (int a , int b ) -> a + b;



        System.out.println(fn.add(5,4));
        System.out.println(fn2.add(7,3));
    }
}
