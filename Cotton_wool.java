public class Cotton_wool {
    private String name;			// Название
    private int heating_temperature;	// Температура нагревания
    private int fiber_density;			// Плотность волокон

    Cotton_wool() {
        name = "default name";
        heating_temperature = 50;
        fiber_density = 45;
        System.out.println("Cotton wool was created with default params!");
    }

    Cotton_wool(String name) {
        this.name = name;
        heating_temperature = 50;
        fiber_density = 45;
        System.out.println("Cotton wool was created\n");
    }
    Cotton_wool(String name, int heating_temperature, int fiber_density) {
        this.name = name;
        this.heating_temperature = heating_temperature;
        this.fiber_density = fiber_density;
        System.out.println("\nNew Cotton wool was created");
    }

    void Cotton_wool_INFO() {
        System.out.println("\tname: " + name + "\n\theating temperature: " + heating_temperature + "\n\tfiber density: " + fiber_density);
    }

    void set_name(String name) {
        this.name = name;
    }
    String get_name() {
        return name;
    }

    void set_heating_temperature(int heating_temperature) {
        this.heating_temperature = heating_temperature;
    }
    int get_heating_temperature() {
        return heating_temperature;
    }

    void set_fiber_density(int fiber_density) {
        this.fiber_density = fiber_density;
    }
    int get_fiber_density() {
        return fiber_density;
    }
}
