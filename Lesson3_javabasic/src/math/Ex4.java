package math;

public class Ex4 {
    public static void main(String[] args){
        int s = 543200;
        int h = s/3600;
        int m  = (s%3600)/60;
        int s1 = (s%3600) % 60;
        System.out.println("h = " + h);
        System.out.println("m = " + m);
        System.out.println("s = " + s1);
    }
}
