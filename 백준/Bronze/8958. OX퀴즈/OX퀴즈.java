import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < count; i++) {
            String line = sc.nextLine();
            int score = 0;
            int currentStreak = 0;
            for(char c: line.toCharArray()) {
                if(c == 'O') {
                    currentStreak += 1;
                } else {
                    currentStreak = 0;
                }
                score += currentStreak;
            }
            System.out.println(score);
        }
    }
}