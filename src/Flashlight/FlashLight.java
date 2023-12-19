package Flashlight;

public class FlashLight {
    private String name;
    private boolean light;
    private ChinaBattery battery = new ChinaBattery();


    public FlashLight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on() {
        light = true;
        System.out.println("Status: " + isLight());
        if (battery.discharge()) {
            light = true;
            System.out.println("Status: " + isLight());
        } else {
            System.out.println("Батарея разряжена");
        }
    }

    public void off() {
        light = false;
        System.out.println("Status: " + isLight());
    }

    public boolean isLight() {
        System.out.println("Status: " + isLight());
        return light;

    }

}

