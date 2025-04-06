package Core_Java;

class Computer{
    public void playMusic(){
        System.out.println("Playing Music....");
    }
    public String getPen(int cost){
        if (cost >= 10) return "Pen";
        return "Nothing.....";
    }
}

public class Methods {
    public static void main(String[] args) {

        //Creating Core_Java.Computer Object
        Computer obj = new Computer();
        //Class_name reference_name = new_keyword againClassName;
        obj.playMusic();
        String getPen = obj.getPen(15);
        System.out.println(getPen);

    }
}
