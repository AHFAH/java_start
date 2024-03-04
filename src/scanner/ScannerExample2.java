package scanner;

import java.util.Scanner;
public class ScannerExample2 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("양수인 정수를 입력하시오 ");
        int num = number.nextInt();

        if(num%2 == 1)
            System.out.println("이 숫자는 홀수입니다.");
        else
            System.out.println("이 숫자는 짝수입니다.");
    }
}
