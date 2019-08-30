import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Book[] b = new Book[100];
        int m;
        System.out.println("How many book you wanna add ?");
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("0.Exit");
            System.out.println("1.Informatin Technology");
            System.out.println("2.Science and Lifestyle");
            System.out.println("3.Literature and Art");
            System.out.println("----------------------------");
            System.out.println("What do you need ?");
            int x;
            x = sc.nextInt();
            switch (x) {
                case 0:
                    break;
                case 1:
                    b[i] = new IT();
                    b[i].input();
                    break;
                case 2:
                    b[i] = new SC();
                    b[i].input();
                    break;
                case 3:
                    b[i] = new LA();
                    b[i].input();
                    break;
            }
        }
    }
}
