public class Chap04_myAvg {
    public double myAvg(int[] numbers) {
        Chap04_mySum sumCalculator = new Chap04_mySum();
        double avg_value = (double) sumCalculator.mySum(numbers) / numbers.length;
        return avg_value;
    }
}