package Flashlight;

public class ChinaBattery {
    private int charge;

    public ChinaBattery() {
        this.charge = 100;
    }

    public boolean discharge() {
        if (charge > 0) {
            charge -= 33;
            return true;
        } else {
            return false;
        }
    }

    public int getCharge() {
        return charge;
    }
}
