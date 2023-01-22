package kz.aitu.oop.practice.practice2;
import javax.naming.Name;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Train train1 = new Train("Astana - Novoishimka", "12:35 - 16:05", 80, 1);
        Train train2 = new Train("Almaty - Petropavlovsk", "6:30 - 2:45", 120, 2);
        Train train3 = new Train("Kokshetau - Pavlodar", "19:34 - 5:16", 105, 3);
        Luxe luxe = new Luxe("Luxe wagon", true);
        Plackart plackart = new Plackart("Plackart", false);
        Caffe caffe = new Caffe("Caffe", false);

        System.out.println("Choose option:\n" + "1. Train information\n" + "2. Add wagon to the train\n" + "3. Remove wagon from the train\n"+ "4. See wagons of trains\n" + "5. Quit from program\n");
        int choose = 0;

        while(choose != 5) {
            choose = scanner.nextInt();
            if (choose == 1) {
                System.out.println("Train information:\n" + train1.Display() + "\n" + train2.Display() + "\n" + train3.Display() + "\n");
                System.out.println("Choose option:\n" + "1. Train information\n" + "2. Add wagon to the train\n" + "3. Remove wagon from the train\n" + "4. See wagons of trains\n" + "5. Quit from program\n");
            } else if (choose == 2) {
                System.out.println("Choose train:\n");
                System.out.println("Train information:\n" + train1.Display() + "\n" + train2.Display() + "\n" + train3.Display() + "\n");
                byte chooseTrain = scanner.nextByte();
                switch (chooseTrain) {
                    case 1:
                        System.out.println(train1.Display());
                        System.out.println("Write wagon name:\n 1) Luxe\n 2) Plackart\n 3) Caffe");
                        int chooseWagon = scanner.nextInt();
                        switch (chooseWagon) {
                            case 1:
                                train1.AddWagon(luxe);
                                System.out.println("You add Luxe wagon to train 1");
                                break;
                            case 2:
                                train1.AddWagon(plackart);
                                System.out.println("You add Plackart wagon to train 1");
                                break;
                            case 3:
                                train1.AddWagon(caffe);
                                System.out.println("You add Caffe wagon to train 1");
                                break;
                        }
                        System.out.println("\nChoose option:\n" + "1. Train information\n" + "2. Add wagon to the train\n" + "3. Remove wagon from the train\n" + "4. See wagons of trains\n" + "5. Quit from program\n");
                        break;

                    case 2:
                        System.out.println(train2.Display());
                        System.out.println("Write wagon name:\n 1) Luxe\n 2) Plackart\n 3) Caffe");
                        int chooseWagon2 = scanner.nextInt();
                        switch (chooseWagon2) {
                            case 1:
                                train2.AddWagon(luxe);
                                System.out.println("You add Luxe wagon to train 2");
                                break;
                            case 2:
                                train2.AddWagon(plackart);
                                System.out.println("You add Plackart wagon to train 2");
                                break;
                            case 3:
                                train2.AddWagon(caffe);
                                System.out.println("You add Caffe wagon to train 2");
                                break;
                        }
                        System.out.println("\nChoose option:\n" + "1. Train information\n" + "2. Add wagon to the train\n" + "3. Remove wagon from the train\n" + "4. See wagons of trains\n" + "5. Quit from program\n");
                        break;
                    case 3:
                        System.out.println(train3.Display());
                        System.out.println("Write wagon name:\n 1) Luxe\n 2) Plackart\n 3) Caffe");
                        int chooseWagon3 = scanner.nextInt();
                        switch (chooseWagon3) {
                            case 1:
                                train3.AddWagon(luxe);
                                System.out.println("You add Luxe wagon to train 3");
                                break;
                            case 2:
                                train3.AddWagon(plackart);
                                System.out.println("You add Plackart wagon to train 3");
                                break;
                            case 3:
                                train3.AddWagon(caffe);
                                System.out.println("You add Caffe wagon to train 3");
                                break;
                        }
                        System.out.println("\nChoose option:\n" + "1. Train information\n" + "2. Add wagon to the train\n" + "3. Remove wagon from the train\n" + "4. See wagons of trains\n" + "5. Quit from program\n");
                        break;
                }
            } else if (choose == 3) {
                System.out.println("Choose train:\n");
                System.out.println("Train information:\n" + train1.Display() + "\n" + train2.Display() + "\n" + train3.Display() + "\n");
                byte chooseTrain = scanner.nextByte();
                switch (chooseTrain) {
                    case 1:
                        System.out.println(train1.Display());
                        train1.DisplayWagons();
                        System.out.println("Write number of wagon to remove it");
                        int numWagon = scanner.nextInt();
                        train1.RemoveWagon(numWagon);
                        System.out.println("\nChoose option:\n" + "1. Train information\n" + "2. Add wagon to the train\n" + "3. Remove wagon from the train\n" + "4. See wagons of trains\n" + "5. Quit from program\n");
                        break;
                    case 2:
                        System.out.println(train2.Display());
                        train2.DisplayWagons();
                        System.out.println("Write number of wagon to remove it");
                        int numWagon2 = scanner.nextInt();
                        train2.RemoveWagon(numWagon2);
                        System.out.println("\nChoose option:\n" + "1. Train information\n" + "2. Add wagon to the train\n" + "3. Remove wagon from the train\n" + "4. See wagons of trains\n" + "5. Quit from program\n");
                        break;
                    case 3:
                        System.out.println(train3.Display());
                        train3.DisplayWagons();
                        System.out.println("Write number of wagon to remove it");
                        int numWagon3 = scanner.nextInt();
                        train3.RemoveWagon(numWagon3);
                        System.out.println("\nChoose option:\n" + "1. Train information\n" + "2. Add wagon to the train\n" + "3. Remove wagon from the train\n" + "4. See wagons of trains\n" + "5. Quit from program\n");
                        break;
                }
            }
            else if(choose == 4){
                System.out.println("Choose train:");
                System.out.println(train1.Display() + "\n" + train2.Display() + "\n" + train3.Display() + "\n4. Exit\n");
                boolean a = true;
                while(a) {
                    byte chooseTrain = scanner.nextByte();
                    switch (chooseTrain) {
                        case 1:
                            System.out.println(train1.Display());
                            train1.DisplayWagons();
                            System.out.println("Choose train:");
                            System.out.println(train1.Display() + "\n" + train2.Display() + "\n" + train3.Display() + "\n4. Exit\n");
                            break;
                        case 2:
                            System.out.println(train2.Display());
                            train2.DisplayWagons();
                            System.out.println("Choose train:");
                            System.out.println(train1.Display() + "\n" + train2.Display() + "\n" + train3.Display() + "\n4. Exit\n");
                            break;
                        case 3:
                            System.out.println(train3.Display());
                            train3.DisplayWagons();
                            System.out.println("Choose train:");
                            System.out.println(train1.Display() + "\n" + train2.Display() + "\n" + train3.Display() + "\n4. Exit\n");
                            break;
                        case 4:
                            a = false;
                    }
                }
                System.out.println("\nChoose option:\n" + "1. Train information\n" + "2. Add wagon to the train\n" + "3. Remove wagon from the train\n" + "4. See wagons of trains\n" + "5. Quit from program\n");
            }
            else if(choose == 5){
                System.out.println("Thanks you. Goodbye!");
                break;
            }
        }
    }
}