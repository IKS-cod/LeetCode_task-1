import java.util.Arrays;

public class Main {
    /* Дан массив целых чисел nums и целое число target, вернуть индексы двух чисел, чтобы их сумма давала target .
    Вы можете предположить, что каждый вход будет иметь ровно одно решение , и вы не можете использовать один и тот же элемент дважды.
    Вы можете возвращать ответ в любом порядке.
            Пример 1:
    Ввод: nums = [2,7,11,15], цель = 9
    Вывод: [0,1]
    Объяснение: поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].

    Пример 2:
    Ввод: числа = [3,2,4], цель = 6
    Вывод: [1,2]

    Пример 3:
    Ввод: числа = [3,3], цель = 6
    Вывод: [0,1]*/
        public static int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for (int i = 0; i < nums.length - 1; i++) {
                for (int y = i + 1; y < nums.length; y++) {
                    int sum = nums[i] + nums[y];
                    if (sum == target) {
                        result[0] = i;
                        result[1] = y;
                    }
                }
            }
            return result;
        }

        public static void main(String[] args) {
            int[]nums = {2,7,11,15};
            int target = 9;
            System.out.println(Arrays.toString(twoSum(nums, target)));
            int[]nums1 = {3,2,4};
            target = 6;
            System.out.println(Arrays.toString(twoSum(nums1, target)));
            int[]nums2 = {3,3};
            target = 6;
            System.out.println(Arrays.toString(twoSum(nums2, target)));
        }
}