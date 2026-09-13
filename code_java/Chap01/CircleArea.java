package javastudy.Chap01;
import java.util.Scanner;

//1. 상수 파이값을 지정한다.
//2. 반지름을 입력받는다.
//2-2. 반지름이 0하면 오류를 알려준다.
//3. 넓이를 구한다 (반지름^2*파이)
//4. 값을 출력한다

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.println("원의 넓이를 구할 반지름을 입력하세요");
        Scanner input = new Scanner(System.in);
        double radius=input.nextDouble();
        double Cirvolume = radius*radius*PI;
        System.out.println("원의 넓이는" + Cirvolume);

    input.close();

    } 
}