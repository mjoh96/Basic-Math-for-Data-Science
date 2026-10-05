package code.code_java;

import java.util.Scanner;

public class Chap03_function {

    public static void main(String[] args) {

        // 1. 값 입력받기
        Scanner scanner = new Scanner(System.in);

        // 1-1. 시작단 입력받기
        System.out.println("시작단을 입력하세요");
        int start_Num = scanner.nextInt();

        // 1-2. 끝단 입력받기
        System.out.println("끝단을 입력하세요");
        int end_Num = scanner.nextInt();

        // 끝단이 시작단보다 작다면 다시 입력
        while (end_Num < start_Num) {
            System.out.println("끝단은 시작단보다 커야합니다.");
            System.out.println("끝단을 다시 입력하세요.");
            end_Num = scanner.nextInt();
        }


        // 2. 구구단 결과를 저장할 배열 생성
        // 2~9까지 총 8개의 결과를 저장
        int[][] guguArray = new int[end_Num - start_Num + 1][8];


        // 3. 배열에 구구단 결과 저장
        for (int i = 0; i < guguArray.length; i++) {
            for (int j = 0; j < guguArray[i].length; j++) {
                guguArray[i][j] = (start_Num + i) * (j + 2);
            }
        }

        // 4. 출력 함수 호출
        printGugu(guguArray, start_Num);

        // 5. Scanner 종료
        scanner.close();
    }

    // 구구단 출력 함수
    public static void printGugu(int[][] guguArray, int start_Num) {
        int i = start_Num;
        // for-each
        for (int[] dan : guguArray) {
            int j = 2;
            for (int result : dan) {
                System.out.print('\t');
                System.out.println(i + "*" + j + "=" + result);
                j++;
            }

            i++;
            System.out.println();
        }
    }
}