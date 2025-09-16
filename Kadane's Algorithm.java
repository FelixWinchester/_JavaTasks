import java.util.*;
import java.lang.*;

public class Main {

    public static int maxSubArraySum(int[] arr) {
        if (arr.length == 0) return 0; // защита от пустого массива

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArraySum(arr)); // ожидаем 9
    }
}
