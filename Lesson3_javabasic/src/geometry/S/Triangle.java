package geometry.S;

public class Triangle {
    public static void main(String [] args){
        int a = 5 , b = 6 , c = 7;
        double p = (a + b + c)/2  ;
        double s = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        System.out.println("S = " + s);
    }
}
