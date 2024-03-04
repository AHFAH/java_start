package scanner;

import java.util.Scanner;
public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자가 모두 0일시 종료합니다.");

        while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int var1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int var2 = scanner.nextInt();

            if(var1 == 0 && var2 == 0){
                System.out.println("종료합니다.");
                break;
            }
            else{
                int sum = var1 + var2;
                System.out.println("두 수의 합: " + sum);
            }
        }
    }
}
