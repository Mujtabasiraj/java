import java.util.Scanner;

public class WhileExam {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("enter limit ");
        int n = sc.nextInt();
        System.out.println("enter marks");
        int marks[] = new int[n];
        while (i < n) {
            marks[i] = sc.nextInt();
            i++;
        }
        System.out.println("marks are ");
        for (int nn : marks) {
            System.out.println(nn);
        }
        sc.close();

    }
}
