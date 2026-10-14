public class Chap04_mySum {
    public int mySum(int[] numbers) {
        int sum_value = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum_value = sum_value + numbers[i];
        }
        return sum_value;
    }
}