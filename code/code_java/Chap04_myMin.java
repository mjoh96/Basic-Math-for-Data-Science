public class Chap04_myMin {
    public int myMin(int[] numbers) {
        // 최소값(myMin)
        int min_value = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min_value > numbers[i]) {
                min_value = numbers[i];
            }
        }
        return min_value;
    }

}
