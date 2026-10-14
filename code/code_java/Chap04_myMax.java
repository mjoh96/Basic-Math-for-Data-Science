public class Chap04_myMax {
    public int myMax(int[] numbers) {
        int max_value = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max_value < numbers[i]) {
                max_value = numbers[i];
            }
        }
        return max_value;
    }
}
