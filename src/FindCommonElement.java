import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindCommonElement {
	public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6};
        int[] secondArray = {2, 3, 6, 1, 3, 9, 7, 3, 2, 1};

        printCommonElements(firstArray, secondArray);
    }

    private static void printCommonElements(int[] firstArray, int[] secondArray) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : firstArray) {
            set.add(num);
        }

        for (int num : secondArray) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + ",");
        }
    }
}