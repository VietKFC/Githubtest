package bai6.lesson7;
import java.util.Scanner;
public class HourlyBill extends Bill {
    protected int hour;
    Scanner sc = new Scanner (System.in);

    public HourlyBill(){
        super();
        this.hour = 0;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Input hour :" );
        hour = sc.nextInt();
    }
    double total_price() {
        double totalprice;
        if(hour > 24 && hour < 30 ) totalprice = 24 * price;
        else if (hour < 24) totalprice = hour * price;
        else {
            System.out.println("Use daily bill !");
            totalprice = ((int) hour/24) * price;
        }
        return totalprice;
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Total price : " + total_price());
    }
}
