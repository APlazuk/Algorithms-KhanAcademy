import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        Integer[] ints = {-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6};

        List<Integer> integers = Arrays.asList(ints);

        System.out.println(findDuplicates(integers, 2));


    }


    public static List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {

        List<Integer> integerList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        int countDuplicates = 0;
        int count = 0;
        try {
            for (int i = 0; i < integers.size(); i++) {
                for (int j = i + 1; j < integers.size(); j++) {
                    if (integers.get(i).equals(integers.get(j))) {
                        countDuplicates++;
                        int duplicatedValue = integers.get(i);
                        integerList.add(duplicatedValue);
                    }
                }
            }
        } catch (NullPointerException e) {
            return new ArrayList();
        }


        for (int i = 0; i < countDuplicates; i++) {
            count = 0;
            for (Integer integer : integers) {
                if (integerList.get(i).equals(integer)) {
                    count++;
                }
            }
            if (count == numberOfDuplicates) {
                result.add(integerList.get(i));
            }
        }

        return result;
    }
}
