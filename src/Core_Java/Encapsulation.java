package Core_Java;

class Human{
    private String Name;
    private int age;

    //With the help of getName and getAge method we can access the private instance variable,Because getName and getAge, Name and Age belongs from same class.
    public String getName(){
        return Name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        Name = n;
    }
    //Constructor
    public Human(){ //Default Constructor
//        System.out.println("In Constructor!!!");
        Name = "Sahin";
        age = 21;
    }

    public Human(String name) {
        Name = name;
        this.age = 12;
    }

    public Human(int a, String n){ //Parameterized Constructor
        age = a;
        Name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();


//        We are making your variable Private and the only way to access them with the Methods,So Basically we're binding our data with the methods ,notone outside the class can directly access the variables Directly. -- Here We are encapsulate Data and Methods and that is Encapsulation :) .

//        obj.setAge(21);
//        obj.setName("Sahin");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        Human obj1 = new Human(21,"Sayak");
        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());

        Human h = new Human("Abc");
        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());


        new Human(); //Anonymous Objects : Because This Object Don't Have a name; You can't use Anonymous object more then one's.

        Human sahin; //Reference Creation
        sahin = new Human();//Object Creation




    }
}
