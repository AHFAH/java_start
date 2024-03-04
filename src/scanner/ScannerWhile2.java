package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while(true){
            System.out.print("정수를 입력하시오(0입력시 종료): ");
            int num = input.nextInt();

            if(num == 0){
                System.out.println("종료합니다.");
                break;
            }
            sum += num;
        }
        System.out.println("지금까지 입력한 정수의 합: " + sum);
    }
}
