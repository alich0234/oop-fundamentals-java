package polymorphism;

class  MathUtil{

    public int add(int a, int b){
        return  a+b;
    }

    public double add(double a, double b, double c){
        return  a+b+c;
    }

}

public class OverridingDemo {



    public static void main(String args[]){
        MathUtil mathUtil = new MathUtil();
        System.out.println("Sum int : " +mathUtil.add(3,10));
        System.out.println("Sum double : "+mathUtil.add(2.2,3.4,9.0));
    }
}
