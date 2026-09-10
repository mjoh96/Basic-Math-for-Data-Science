package javastudy.Chap01;
import java.util.Scanner;

public class CirclArea_recap {public static void main(String[] args) {

//1. 파이값을 설정한다 (final)
    final double pi = 3.14;
//2. 반지름을 입력받는다
    System.out.println("반지름을 입력하세요");
    Scanner input = new Scanner(System.in);
    double R=input.nextDouble();
//2-1. 반지름이 0보다 같거나 작다면 오류창을 생성하고 다시 입력받는다.
    if (R<=0) {
        System.out.println("반지름을 다시 입력하세요 (0보다 큰 정수)");
        R=input.nextDouble();
    }
    //3. 넓이를 구한다 (반지름*반지름*파이)
    double circle_area=R*R*pi;
    //4. 넓이를 출력한다
    System.out.println("반지름이 "+R+"인 원의 넓이는 "+circle_area+"입니다.");

//5. 스캐너를 종료한다
    input.close();
    
}

}
