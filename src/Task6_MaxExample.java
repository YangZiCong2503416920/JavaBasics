public class Task6_MaxExample {
    //创建检测getMax方法
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }  else {
            return b;
        }
    }

    //主方法用于验证getMax
    public static void main(String[] args) {
        System.out.println(getMax(10, 20));
        System.out.println(getMax(-10, -20));
        System.out.println(getMax(10, -20));
    }
}
