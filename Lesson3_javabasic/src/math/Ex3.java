package math;

public class Ex3 {
    public static void main(String[] args){
        int x = 6;
        double a = Math.pow(x,3) + Math.log(Math.pow(x,4) + 2)/Math.log(2) - Math.pow((x -4) , 1/3);
        System.out.println("a = " + a);
    }
}
