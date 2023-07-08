import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("Def", "Attack", "HP", "HP", "Def", "HP", "Crit"));
        task1(nums);
        task2(nums);
        task3(strings);
        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        System.out.println("Задача 1");
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2(List<Integer> nums) {
        System.out.println("Задача 2");
        Set<Integer> integerSet = new TreeSet<>(nums);
        for (Integer num : integerSet) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void task3(List<String> strings) {
        System.out.println("Задача 3");
        System.out.println(new HashSet<>(strings));
    }

    public static void task4(List<String> strings) {
        System.out.println("Задача 4");
        Map<String, Integer> countByWord = new HashMap<>();
        for (String str : strings) {
            if (countByWord.containsKey(str)) {
                countByWord.put(str, countByWord.get(str) + 1);
            } else {
                countByWord.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : countByWord.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry);
            }
        }
    }
}