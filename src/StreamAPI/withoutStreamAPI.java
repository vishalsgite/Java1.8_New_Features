package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class withoutStreamAPI {
    public static void main(String[] args) {

        List<Integer> list = List.of(2,4,1,2,8,7,10,5,8,9,22,47);

        List<Integer> listOfEvenNumbers = new ArrayList<>();


        //Without Stream  ---> Bolier Plate Code
        for(Integer itr : list){
            if(itr % 2 == 0){
                listOfEvenNumbers.add(itr);
            }
        }

        System.out.println(listOfEvenNumbers);
    }
}
