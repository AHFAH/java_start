package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("문장을 입력하세요(exit는 종료): ");
            String str = scanner.nextLine();
            if(str.equals("exit")){
                break;
            }
            System.out.println("입력한 문자열: " + str);
        }
    }
}
