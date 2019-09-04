package bai6.lesson7;
import  java.util.Scanner;
public  class DailyBill extends Bill {
    protected int day;
    Scanner sc = new Scanner (System.in);
    public DailyBill(){
        super();
        this.day = 0;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Input day: ");
        day = sc.nextInt();
    }
    double total_price(){
        double totalprice;
        if(day <= 7) totalprice = day*price;
        else{
            totalprice = (double) (day*price*8)/10;
        }
        return totalprice;
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Total price : " + total_price());
    }
}
