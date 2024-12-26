package MethodRefernceInJava;

public class MethodRefernceDemo {

    public static void main(String[] args) {


        //Providing implmentation of stuffInterface

        stuffInterface stuffInterface = stuff::doStuff;  //-> here we have use method doStuff implementation
                                                       // from class stuff ,

        stuffInterface.dotask();        // & called dotask method of interface ,with implementation from
                                        // dostuff method . so no need to create another implementation
                                        //simply import implemenatation from anyever else and refer to this method



        stuff st = new stuff();
        stuffInterface stuffInterface1 = st::doFun;  //Calling Non Static Method
        stuffInterface1.dotask();



    }
}
