import java.util.Scanner;
public abstract class Animal {
    protected String name;
    Scanner sc = new Scanner(System.in);
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void input(){
        System.out.println("input name : ");
        name = sc.nextLine();
    }
}
