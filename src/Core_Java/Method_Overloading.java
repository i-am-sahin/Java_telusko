package Core_Java;
 class Calculator{
    public int add(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
    //Method Overloading

     //You can have different number of parameters
    public int add(int n1,int n2){
        return n1 + n2 ;
    }
     //You can have same number of parameters but  different types
     public double add(double n1,int n2){
         return n1 + n2 ;
     }

}
public class Method_Overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(3,4);
        System.out.println(r1);

    }
}
