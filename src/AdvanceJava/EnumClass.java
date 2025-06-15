package AdvanceJava;
//Here this Laptops is  a class and all the values are objects.
enum Laptops{
    Macbook(1500),XPS(1800),Surface,ThinkPad(1200);
    private int price ;
    private Laptops(){
        price = 500;
    }
    private Laptops(int price){
        this.price = price;
        System.out.println("From price Constructor" + " : " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        Laptops lap = Laptops.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

        for (Laptops l : Laptops.values()){
            System.out.println(l + " : " + l.getPrice());
        }

        System.out.println(lap.getClass().getSuperclass());
    }
}
