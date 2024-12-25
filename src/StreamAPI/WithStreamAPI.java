package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithStreamAPI {
    public static void main(String[] args) {

        List<Integer> list = List.of(2,4,1,2,8,7,10,5,8,9,22,47);

       // List<Integer> listOfEvenNumbers = new ArrayList<>();

        //Using Stream

        Stream<Integer> streamTest = list.stream();

        List<Integer> listOfEvenNumbers =
        streamTest.filter(element -> element % 2 == 0 )    //it will return true or false
                .toList();            //it will collect filter elements

        System.out.println("List Of Even Number : "+listOfEvenNumbers);


        //we can reduce code further also

        List<Integer> listOfOddNumbers =
        list.stream().filter(element -> element % 2 == 1).toList();

        System.out.println("List Of Odd Numbers : "+listOfOddNumbers);


        List<String> names = List.of("Vishal", "Bob", "Charlie");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("V"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        System.out.println(filteredNames); // Output: [ALICE]

    }
}
