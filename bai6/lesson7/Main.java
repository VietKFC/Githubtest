package bai6.lesson7;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Bill[] b = new Bill[100];
        int index = 0;
        boolean check = true;
        while (check) {
            System.out.println("1.Add hourly bill ");
            System.out.println("2.Add daily bill");
            System.out.println("3.Exit");
            System.out.println("----------------------------------------------------------");
            System.out.println("What do you need ?");
            int x = sc.nextInt();
            switch (x){
                case 1:
                    b[index] = new HourlyBill();
                    b[index].input();
                    index++;
                    break;
                case 2:
                    b[index] = new DailyBill();
                    b[index].input();
                    break;
                case 3:
                    check = false;
                    break;
            }
        }
        System.out.println("Bill list : ");
        for(int i = 0 ; i <= index ; i++){
            b[i].output();
            System.out.println("---------------------------------------------------------------");
        }
    }
}
