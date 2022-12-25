import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double[] scores = new double[count];
        double highestScore = 0;
        for(int i = 0; i < count; i++) {
            scores[i] = sc.nextInt();
            highestScore = Math.max(scores[i], highestScore);
        }
        double sum = 0;
        for(int i = 0; i < scores.length; i++) {
            sum += (scores[i] / highestScore * 100);
        }
        System.out.println(sum/count);
    }
}