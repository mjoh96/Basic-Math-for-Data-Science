// 사용자로부터 5개의 숫자를 임의로 입력 받아 배열에 저장하고, 이 숫자들 중에서 
// 1) 최대값(max)
// 2) 최소값(min)
// 3) 총합(sum)
// 4) 평균값(avg)
// 을 구하는 함수로 만들어라. 그 이후 4개의 함수를 따로 클래스로 만들어서 겍체로 호출할 수 있는 코드로 완성하여라. 

import java.util.Scanner;

public class Chap04_class {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + "번째 숫자를 입력하세요: ");
            numbers[i] = scanner.nextInt();
        }
        Chap04_myMax maxCalculator = new Chap04_myMax();
        int max_value = maxCalculator.myMax(numbers);

        Chap04_myMin minCalculator = new Chap04_myMin();
        int min_value = minCalculator.myMin(numbers);

        Chap04_mySum sumCalculator = new Chap04_mySum();
        int sum_value = sumCalculator.mySum(numbers);

        Chap04_myAvg avgCalculator = new Chap04_myAvg();
        double avg_value = avgCalculator.myAvg(numbers);

        System.out.println("최댓값은 " + max_value + "입니다.");
        System.out.println("최솟값은 " + min_value + "입니다.");
        System.out.println("합계는 " + sum_value + "입니다.");
        System.out.println("평균은 " + avg_value + "입니다.");
        scanner.close();
    }

}