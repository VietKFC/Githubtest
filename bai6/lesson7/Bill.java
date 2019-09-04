package bai6.lesson7;
import java.util.Scanner;
public abstract class Bill {
    Scanner sc = new Scanner(System.in);
    protected String billcode;
    protected String date;
    protected String clientname;
    protected String roomcode;
    protected int price;
    public Bill(){
        this.billcode = "";
        this.date = "";
        this.clientname = "";
        this.roomcode = "";
        this.price = 0;
    }
    public void input(){
        System.out.println("Input information : ");
        billcode = sc.nextLine();
        date = sc.nextLine();
        clientname = sc.nextLine();
        roomcode = sc.nextLine();
        price = sc.nextInt();
    }
    public void output(){
        System.out.println(billcode + " / " + roomcode );
        System.out.println(clientname + " / " + date);
        System.out.println(price);
    }
}
