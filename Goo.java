public class Goo {
    private String name;	// Название
    private int strength;		// Крепость
    private String smack;	// Вкус

    Goo() {
        name = "default name";
        strength = 20;
        smack = "Brucko";
        System.out.println("Goo was created with default params!");
    }

    Goo(String name) {
        this.name = name;
        strength = 20;
        smack = "Brucko";
        System.out.println("Goo was created\n");
    }
    Goo(String name, int strength, String taste) {
        this.name = name;
        this.strength = strength;
        this.smack = taste;
        System.out.println("\nNew Goo was created");
    }

    void Goo_INFO() {
        System.out.println("\tname: " + name + "\n\tstrength: " + strength + "\n\tsmack: " + smack);
    }

    void set_name(String name) {
        this.name = name;
    }
    String get_name() {
        return name;
    }

    void set_strength(int strength) {
        this.strength = strength;
    }
    int get_strength() {
        return strength;
    }

    void set_smack(String smack) {
        this.smack = smack;
    }
    String get_smack() {
        return smack;
    }
}
