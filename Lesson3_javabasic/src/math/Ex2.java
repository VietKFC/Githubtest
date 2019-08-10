package math;

public class Ex2 {
    public static void main(String [] args){
        int x = 3;
        double a = Math.sqrt(x + Math.sqrt( x + Math.sqrt(x)));
        System.out.println("a = " + a);
    }
}
