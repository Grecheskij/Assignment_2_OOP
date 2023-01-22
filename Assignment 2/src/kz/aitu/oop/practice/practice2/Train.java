package kz.aitu.oop.practice.practice2;
import java.util.ArrayList;
import java.util.List;

public class Train {
    private int ID;
    private String Name;
    private String Time;
    private double Speed;
    private List<Wagon> wagons = new ArrayList<Wagon>();

    public Train(String name, String time, double speed, int ID){
        this.ID = ID;
        this.Name = name;
        this.Time = time;
        this.Speed = speed;
    }

    public String Display(){
        return this.ID + ". " + this.Name + ", Time interval: " + this.Time + ", Speed: " + this.Speed;
    }

    public void DisplayWagons(){
        for (int i = 0; wagons.size() > i; i++){
            wagons.get(i).getInfo();
        }
    }

    public void AddWagon(Wagon wagon){
        this.wagons.add(wagon);
    }

    public void RemoveWagon(int idwagon){
        this.wagons.remove(idwagon);
    }

}
