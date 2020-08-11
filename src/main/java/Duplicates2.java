import java.util.*;
import java.util.stream.Collectors;

public class Duplicates2 {
    public static void main(String[] args) {
        Integer[] ints = {-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6};

        List<Integer> integers = Arrays.asList(ints);

        System.out.println(findDuplicates(integers, 2));


    }

    public static List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {

        List<Integer> integerList = new ArrayList<>();
        try {
            Map<Integer, Long> countDuplicates = integers.stream().collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
            Iterator<Map.Entry<Integer, Long>> iterator = countDuplicates.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Long> next = iterator.next();
                if (next.getValue() == numberOfDuplicates) {
                    integerList.add(next.getKey());
                }
            }
        } catch (NullPointerException e) {
            return new ArrayList<>();
        }

        return integerList;
    }
}
