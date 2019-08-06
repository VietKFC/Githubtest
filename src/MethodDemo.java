
public class MethodDemo {
    public static void main(String[] args){
        Cat tom = new Cat();
        boolean isCat = tom instanceof Cat;
        System.out.println("Tom is cat ? " + isCat);
        tom.input();
        tom.output();
    }
}
