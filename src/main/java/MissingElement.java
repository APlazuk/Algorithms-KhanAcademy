//Napisz metodę findMissingElement, która jako argument przyjmuje tablicę liczb
//        całkowitych z zakresu od 0 do n. Liczby w tablicy nie powtarzają się.
//        W tablicy brakuje jednego elementu z zakresu <0, n>.
//        Metoda findMissingElement powinna zwrócić brakujący element.

// Wzór na sumę ciągu arytmetycznego:
//Sn= n * (2 * a1 + (n-1) * r)/2 gdzie:
//Sn - to suma ciągu
//n -dł. tablicy
//a1 - pierwszy element
//r - różnica między kolejnymi wyrazami ciągu
// Sn = 11 *(2*0 +(11-1)*1)/2
// Sn = 11 *10 /2 = 55

import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[]someArray = {0,1,2,3,9,8,7,6,5,10};
        System.out.println(findMissingElement(someArray));
    }

    private static int findMissingElement(int[] someArray) {
        int sum = (someArray.length + 1) * someArray.length/2;

        int actualSum = Arrays.stream(someArray).sum();
//        int actualSum = 0;
//        for (int i : someArray) {
//            actualSum += i;
//        }
        return sum - actualSum;
    }
}
