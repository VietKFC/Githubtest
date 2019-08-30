import java.util.Scanner;
public class Book {
    Scanner sc = new Scanner (System.in);
    String code , name , author , publisher , college ;
    int pn;
    public Book(){
        this.code = "";
        this.name = "";
        this.author = "";
        this.publisher = "";
        this.college = "";
        this.pn = 0;
    }

    public void input(){
        code = sc.nextLine();
        name = sc.nextLine();
        author = sc.nextLine();
        publisher = sc.nextLine();
        pn = sc.nextInt();
    }

}
