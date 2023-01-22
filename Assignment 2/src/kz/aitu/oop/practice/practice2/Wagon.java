package kz.aitu.oop.practice.practice2;

public class Wagon {
    protected int Capacity;
    protected String Wname;
    protected Boolean Invalid;
    protected int FreeSeats;

    public Wagon(String Wname, Boolean Invalid){
        this.Wname = Wname;
        this.Invalid = Invalid;
    }

    public void getInfo(){
    }
}
