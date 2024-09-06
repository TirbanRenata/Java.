package MultilevelInheritance;

import HierarchicalInheritance.FishingBoat;
import HierarchicalInheritance.Boat;
import HierarchicalInheritance.SpeedBoat;
import SingleInheritance.MountainBike;
import SingleInheritance.Bicycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bine ai venit la programul de testare a vehiculelor!");
        System.out.println("Alege un vehicul pentru a începe testul:");
        System.out.println("1. MountainBike");
        System.out.println("2. Tesla");
        System.out.println("3. SpeedBoat");
        System.out.println("4. FishingBoat");
        System.out.print("Introduceți numărul vehiculului dorit: ");

        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                MountainBike mountainBike = new MountainBike(20, 5, "knobby", "soft");
                System.out.println("Ai ales MountainBike! Să facem câteva teste...");
                mountainBike.speedUp(10);
                mountainBike.changeGear(3);
                mountainBike.adjustSuspension("firm");
                System.out.println(mountainBike);
                break;

            case 2:
                Tesla tesla = new Tesla("Tesla", "Model X", 2024, 100, 500, "v10.0");
                System.out.println("Ai ales Tesla! Să vedem cum funcționează...");
                tesla.start();
                tesla.charge();
                tesla.enableAutopilot();
                tesla.accelerate();
                System.out.println(tesla);
                break;

            case 3:
                SpeedBoat speedBoat = new SpeedBoat(15, 2000, 150, "V8");
                System.out.println("Ai ales SpeedBoat! Navigăm rapid...");
                speedBoat.sail();
                speedBoat.turboBoost();
                System.out.println(speedBoat);
                break;

            case 4:
                FishingBoat fishingBoat = new FishingBoat(20, 5000, 1000, "trawl");
                System.out.println("Ai ales FishingBoat! Să vedem cum aruncăm plasa...");
                fishingBoat.sail();
                fishingBoat.castNet();
                System.out.println(fishingBoat);
                break;

            default:
                System.out.println("Opțiune invalidă. Te rugăm să încerci din nou.");
                break;
        }

        System.out.println();
        System.out.println("Mulțumim că ai testat vehiculele noastre!");
        scanner.close();
    }
}