package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.4;
        //printNumber(number);  double을 int에 대입하면 컴파일 오류
        printNumber((int)number); // 명시적 형변환을 통해 double->int
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
