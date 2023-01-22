package kz.aitu.oop.practice.practice2;

public class Luxe extends Wagon{
    public Luxe(String Wname, Boolean Invalid){
        super(Wname, Invalid);
        super.Capacity = 10;
        super.FreeSeats = 10;
    }
    @Override
    public void getInfo(){
        System.out.println("Luxe");
    }

}
