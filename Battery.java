public class Battery {
    private String name;	// Название
    private int capacity;		// Ёмкость
    private int mAh;			// Милиамп. часы

    Battery() {
        name = "default name";
        capacity = 1200;
        mAh = 1200;
        System.out.println("Battery was created with default params!");
    }

    Battery(String name) {
        this.name = name;
        capacity = 1200;
        mAh = 1200;
        System.out.println("Battery was created\n");

    }
    Battery(String name, int capacity, int mAh) {
        this.name = name;
        this.capacity = capacity;
        this.mAh = mAh;
        System.out.println("\nNew Battery was created");
    }

    void Battery_INFO() {
        System.out.println("\tname: " + name + "\n\tcapacity: " + capacity + "\n\tmAh: " + mAh);
    }

    void set_name(String name) {
        this.name = name;
    }
    String get_name() {
        return name;
    }

    void set_capacity(int capacity) {
        this.capacity = capacity;
    }
    int get_capacity() {
        return capacity;
    }

    void set_mAh(int mAh) {
        this.mAh = mAh;
    }
    int get_mAh() {
        return mAh;
    }
}
