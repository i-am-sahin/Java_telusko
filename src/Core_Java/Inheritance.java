package Core_Java;
class Calc{
    public int addition(int n1,int n2){
        return n1 + n2;
    }
    public int subtraction(int n1,int n2){
        return n1 - n2;
    }
}
class AdvCalc extends Calc{
    public int multiplication(int n1,int n2){
        return n1 * n2;
    }
    public int division(int n1,int n2){
        return n1/n2;

    }
}

//Multilevel Inheritance
class VeryAdvCalc extends AdvCalc{
    public int power(int n1,int n2){
        return (int)Math.pow(n1,n2);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj1 = new VeryAdvCalc();
        int r1 = obj1.addition(4,5);
        int r2 = obj1.subtraction(5,8);
        int r3 = obj1.multiplication(5,8);
        int r4 = obj1.division(5,8);
        int r5 = obj1.power(2,5);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
