package kz.aitu.oop.practice.practice2;

public class Plackart extends Wagon{
    public Plackart(String Wname, Boolean Invalid){
        super(Wname, Invalid);
        super.Capacity = 50;
        super.FreeSeats = 50;
    }
    @Override
    public void getInfo(){
        System.out.println("Plackart");
    }
}
