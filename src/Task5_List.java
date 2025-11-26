import java.util.List;

public class Task5_List {
    static void main(String[] args) {
        //创建一个存5个成绩的数组，计算平均分

        //创建数组
        double[] scores = new double[5];
        scores[0] = 85.0;
        scores[1] = 82.0;
        scores[2] = 83.5;
        scores[3] = 87.0;
        scores[4] = 72.5;

        //计算总分
        double sum = 0;
        int i = 0;
        while (i < scores.length) {
            sum += scores[i];
            i++;
        }

        //计算平均分
        double average = sum / scores.length;

        //输出结果
        System.out.println("Average score: " + average);
    }
}
