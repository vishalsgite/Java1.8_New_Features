package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {


        //filter : return true or false
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A")) // Only names starting with 'A'
                .collect(Collectors.toList());
        System.out.println(filteredNames); // Output: [Alice]

        //map() : Transforms elements by applying a function.
        List<String> listOfNames = Arrays.asList("alice", "bob", "charlie");
        List<String> uppercaseNames = listOfNames.stream()
                .map(String::toUpperCase) // Convert each name to uppercase
                .collect(Collectors.toList());
        System.out.println(uppercaseNames); // Output: [ALICE, BOB, CHARLIE]


        //sorted() : Sorts elements in natural order or using a custom comparator.
        List<Integer> numbersInAscending = Arrays.asList(5, 3, 8, 1, 2);
        List<Integer> sortedNumbersInAsc = numbersInAscending.stream()
                .sorted() // Sorts in ascending order
                .collect(Collectors.toList());
        System.out.println(sortedNumbersInAsc); // Output: [1, 2, 3, 5, 8]

        List<Integer> numbersInDescending = Arrays.asList(5, 3, 8, 1, 2);
        List<Integer> sortedDesc = numbersInDescending.stream()
                .sorted(Comparator.reverseOrder()) // Sorts in descending order
                .collect(Collectors.toList());
        System.out.println(sortedDesc); // Output: [8, 5, 3, 2, 1]


        //distinct() : Removes duplicate elements.

        List<Integer> distinctNumbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> ListOfDistinctNumbers = distinctNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(ListOfDistinctNumbers); // Output: [1, 2, 3, 4, 5]

        //limit() : Limits the number of elements in the stream.

        List<Integer> LimitNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> limitedNumbers = LimitNumbers.stream()
                .limit(5) // Takes the first 5 elements
                .collect(Collectors.toList());
        System.out.println(limitedNumbers); // Output: [1, 2, 3, 4, 5]

        //skip() : Skips a specified number of elements.

        List<Integer> SkipNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> skippedNumbers = SkipNumbers.stream()
                .skip(5) // Skips the first 5 elements
                .collect(Collectors.toList());
        System.out.println(skippedNumbers); // Output: [6, 7, 8, 9]

        //forEach() : Performs an action on each element of the stream.

        List<String> listOfNames1 = Arrays.asList("Alice", "Bob", "Charlie");
        listOfNames1.stream()
                .forEach(name -> System.out.println(name));


        //collect() : Converts the stream into a collection or string.
        List<String> collectionOfNames = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> collected = collectionOfNames.stream()
                .collect(Collectors.toList());
        System.out.println(collected); // Output: [Alice, Bob, Charlie]


        //findFirst() and findAny() : Finds the first or any element in the stream.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> first = numbers.stream().findFirst();
        first.ifPresent(System.out::println); // Output: 1


        //anyMatch(), allMatch(), noneMatch() : Tests whether elements match a given predicate.

        List<Integer> anyMatchNumbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean hasEven = anyMatchNumbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven); // Output: true

        boolean allPositiveAllMatch = anyMatchNumbers.stream().allMatch(n -> n > 0);
        System.out.println(allPositiveAllMatch); // Output: true

        boolean noNegativeNoneMatch = anyMatchNumbers.stream().noneMatch(n -> n < 0);
        System.out.println(noNegativeNoneMatch); // Output: true



    }
}
