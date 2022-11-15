public class Evaporator {
    private String name;	// Название
    private int diameter;		// Диамерт
    private int watts;			// Ватты
    private int resistance;		// Сопративление

    public Evaporator() {
        name = "default name";
        diameter = 20;
        watts = 10;
        resistance = 5;
        System.out.println("\nEvaporator was created with default params!");
    }

    public Evaporator(String name) {
        this.name = name;
        diameter = 20;
        watts = 10;
        resistance = 5;
        System.out.println("Evaporator was created\n");
    }
    Evaporator(String name, int diameter, int watts, int resistance) {
        this.name = name;
        this.diameter = diameter;
        this.watts = watts;
        this.resistance = resistance;
        System.out.println("\nNew Evaporator was created");
    }

    public void Evaporator_INFO() {
        System.out.println("\tname: " + name + "\n\tdiameter: " + diameter +
                "\n\twatts: " + watts + "\n\tresistance: " + resistance);
    }


    public void set_name(String name) {
        this.name = name;
    }
    public String get_name() {
        return name;
    }

    public void set_diameter(int diameter) {
        this.diameter = diameter;
    }
    public int get_diameter() {
        return diameter;
    }

    public void set_watts(int watts) {
        this.watts = watts;
    }
    public int get_watts() {
        return watts;
    }

    public void set_resistance(int resistance) {
        this.resistance = resistance;
    }
    public int get_resistance() {
        return resistance;
    }
}
