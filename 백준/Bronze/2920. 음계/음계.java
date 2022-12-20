import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 9;
        boolean isAsc = true, isDesc = true;
        for(int i = 1; i < length; i++) {
            int num = sc.nextInt();
            if(num != i) isAsc = false;
            if(num != length - i) isDesc = false;
        }
        System.out.println(isAsc ? "ascending" : isDesc ? "descending": "mixed" );
    }
}