public class Task4_While {
    public static void main(String[] args) {
        //用 while 计算 1+2+...+100 的和

        //初始化变量
        int i = 1;
        int total = 0;

        while (i <= 100) {
            total += i;
            i++;
        }

        //输出结果
        System.out.println(total);
    }
}
