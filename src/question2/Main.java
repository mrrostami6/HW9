package question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1));
        numbers = deleteWrongBinaries(numbers);
        System.out.println(numbers);
    }

    public static List<Integer> deleteWrongBinaries(List<Integer> numbers) {
        if  (numbers.isEmpty()) return numbers;
        if  (numbers.size() % 2 != 0)  numbers.remove(numbers.size() - 1);

        List<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i += 2) {
            if(numbers.get(i) <= numbers.get(i + 1)){
                finalList.add(numbers.get(i));
                finalList.add(numbers.get(i + 1));
            }
        }
        return finalList;
    }

}
