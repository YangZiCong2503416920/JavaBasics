import java.util.Scanner;

public class Test1_Calculator {
    static void main(String[] args) {
        //初始化键入
        Scanner sc = new Scanner(System.in);

        //键入数字和计算方式
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        System.out.print("Enter method: ");
        String method = sc.next();

        //计算
        double total = 0;
        switch (method) {
            case "+":
                total =  number1 + number2;
                break;
            case "-":
                total =  number1 - number2;
                break;
            case "*":
                total =  number1 * number2;
                break;
            case  "/":
                if (number2 != 0) {
                    total =  number1 / number2;
                }  else {
                    System.out.println("Error");
                }
                break;
        }
        //输出计算结果
        System.out.println("number1" + " method: " +  " number2" + " = " + total);
        sc.close();
    }
}
