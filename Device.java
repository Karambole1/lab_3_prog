public class Device {
    private Evaporator evaporator;
    private Battery battery;
    private Cotton_wool cotton_wool;
    private Goo goo;

    Device() {
        this.evaporator = new Evaporator();
        this.battery = new Battery();
        this.cotton_wool = new Cotton_wool();
        this.goo = new Goo();
        System.out.println("\nDevice was created with default params!\n");
    }
    Device(Evaporator evaporator, Battery battery, Cotton_wool cotton_wool, Goo goo) {
        this.evaporator = evaporator;
        this.battery = battery;
        this.cotton_wool = cotton_wool;
        this.goo = goo;
        System.out.println("\nDevice was created");
    }

    void set_Evaporator(Evaporator evaporator) {
        System.out.println("Current Evaporator was changed to\n");
        evaporator.Evaporator_INFO();
        this.evaporator = evaporator;
    }

    void set_Battery(Battery battery) {
        System.out.println("Current Battery was changed to\n");
        battery.Battery_INFO();
        this.battery = battery;
    }

    void set_Cotton_wool(Cotton_wool cotton_wool) {
        System.out.println("Current Cotton wool was changed to\n");
        cotton_wool.Cotton_wool_INFO();
        this.cotton_wool = cotton_wool;
    }

    void set_Goo(Goo goo) {
        System.out.println("Current Goo was changed to\n");
        goo.Goo_INFO();
        this.goo = goo;
    }

    void Info_Device() {
        System.out.println("Device's info:\n");
        System.out.println("Evaporator:");
        evaporator.Evaporator_INFO();
        System.out.println("\nBattery:");
        battery.Battery_INFO();
        System.out.println("\nCotton wool:");
        cotton_wool.Cotton_wool_INFO();
        System.out.println("\nGoo:");
        goo.Goo_INFO();
    }
}
