package kz.aitu.oop.practice.practice2;

public class Caffe extends Wagon{
    public Caffe(String Wname, Boolean Invalid){
        super(Wname, Invalid);
        super.Capacity = 25;
        super.FreeSeats = 25;
    }
    @Override
    public void getInfo(){
        System.out.println("Caffe");
    }
}
