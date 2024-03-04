package array;

import java.util.Scanner;
public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = input.nextInt();
        int sum = 0;
        double avg;

        int[] num = new int[count];
        System.out.println(count + "개의 정수를 입력하세요");

        for(int i=0; i<count; i++){
            num[i] = input.nextInt();
            sum += num[i];
        }

        avg = (double) sum / count;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
