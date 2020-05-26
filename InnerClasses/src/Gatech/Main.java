package Gatech;

public class Main {

    public static void main(String[] args) {
        Gearbox prado  = new Gearbox(6);
        prado.addGear(1,5.3);
        prado.addGear(2, 10.6);
        prado.addGear(3, 15.9);

        prado.operateClutch(true);
        prado.changGear(1);
        prado.operateClutch(false);

        /* anonymous inner class*/
        Gearbox.Gear first = prado.new Gear(1, 12.3);
        //try to understand why the following syntax is not right
        // Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
        System.out.println(first.driveSpeed(1000));

    }
}
