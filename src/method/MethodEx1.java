package method;

public class MethodEx1 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = depositAmount(balance, 1000);
        balance = withdrawAmount(balance, 2200);
        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int depositAmount(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }
    
    public static int withdrawAmount(int balance, int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        else{
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
