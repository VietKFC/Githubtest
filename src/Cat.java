import java.util.Scanner;
public class Cat extends Animal {
    protected int age;
    protected int height;
    protected  int weight;
    Scanner sc = new Scanner (System.in);
    public void setCat(){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public void input(){
        super.input();
        System.out.println("input information : ");
        age = sc.nextInt();
        height = sc.nextInt();
        weight = sc.nextInt();
    }
    public void output(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("height : " + height);
        System.out.println("weight : " + weight);
    }
}
