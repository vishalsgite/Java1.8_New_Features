package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {
        String[] names = { "Vishal","Durgesh","Ankit","Avdhoot" };

        Stream<String> stream1 = Stream.of(names);

        stream1.forEach(element -> {
            System.out.println(element);
        });

        List<Integer> list = new ArrayList<>();

        list.add(17);
        list.add(15);
        list.add(11);
        list.add(19);

       Stream<Integer> stream2 =  list.stream();
       stream2.forEach(element -> {
           System.out.print(element+",");
       });



    }
}
