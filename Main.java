import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{

        String name, taste, answer;
        int diameter, watts, resistance, capacity, mAh, heating_temperature, fiber_density, strength;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Evaporator [] evaporators = new Evaporator[5];
        Battery [] batteries = new Battery[5];
        Cotton_wool [] cotton_wools = new Cotton_wool[5];
        Goo [] goos = new Goo[5];

        evaporators[0] = new Evaporator();
        batteries[0] = new Battery();
        cotton_wools[0] = new Cotton_wool();
        goos[0] = new Goo();

        Device device = new Device(evaporators[0], batteries[0], cotton_wools[0], goos[0]);

        System.out.println("\nPress any key to continue...");
        reader.readLine();


        while (true) {
            System.out.println("Menu:\n\t1 to show Device's info.\n\t2 to change part of device.\n\t3 to exit.\nYour answer: ");
            answer = reader.readLine();

            if (answer.charAt(0) == '1') {
                device.Info_Device();
                System.out.println("\nPress any key to continue...");
                reader.readLine();
            }

            else if (answer.charAt(0) == '2') {
                System.out.println("Select part to change:\n\t1 Evaporator\n\t2 Battery\n\t3 Cotton wool\n\t4 Goo\n\t5 to menu\nYour answer: ");
                answer = reader.readLine();

                if (answer.charAt(0) == '1') {
                    System.out.println("Choose Evaporator in list:\n");
                    for (int i = 0; i < 5; i++) {
                        if (evaporators[i] != null)
                            System.out.println((i + 1) + " " + evaporators[i].get_name());
                else System.out.println((i + 1) + " create new...");
                    }

                    System.out.println("\n6 Remove added parts.\n");

                    System.out.println("Your answer: ");
                    answer = reader.readLine();

                    if (answer.charAt(0) == '6') {
                        for (int i = 1; i < 5; i++) {
                            if (evaporators[i] == null) continue;
                            evaporators[i] = null;
                        }
                        System.out.println("All added evaporators were deleted!");
                        device.set_Evaporator(evaporators[0]);
                        System.out.println("\n\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }

                    if (evaporators[Integer.parseInt(answer) - 1] == null) {
                        System.out.println("\nCreate new:\n");

                        System.out.println("Enter Evaporator's name: "); name = reader.readLine();
                        System.out.println("Enter Evaporator's diameter: "); diameter = Integer.parseInt(reader.readLine());
                        System.out.println("Enter Evaporator's watts: "); watts = Integer.parseInt(reader.readLine());
                        System.out.println("Enter Evaporator's resistance: "); resistance = Integer.parseInt(reader.readLine());

                        evaporators[Integer.parseInt(answer) - 1] = new Evaporator(name, diameter, watts, resistance);
                        device.set_Evaporator(evaporators[Integer.parseInt(answer) - 1]);
                        System.out.println("\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }
                    System.out.println("\n");
                    device.set_Evaporator(evaporators[Integer.parseInt(answer) - 1]);
                    System.out.println("\nPress any key to continue...");
                    reader.readLine();
                }

                else if (answer.charAt(0) == '2') {
                    System.out.println("Choose Battery in list:\n");
                    for (int i = 0; i < 5; i++) {
                        if (batteries[i] != null)
                            System.out.println((i + 1) + " " + batteries[i].get_name());
                else System.out.println((i + 1) + " create new...");

                    }
                    System.out.println("\n6 Remove added parts.\n");

                    System.out.println("Your answer: ");
                    answer = reader.readLine();

                    if (answer.charAt(0) == '6') {
                        for (int i = 1; i < 5; i++) {
                            if (batteries[i] == null) continue;
                            batteries[i] = null;
                        }
                        System.out.println("All added batteries were deleted!");
                        device.set_Battery(batteries[0]);
                        System.out.println("\n\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }

                    if (batteries[Integer.parseInt(answer) - 1] == null) {
                        System.out.println("\nCreate new:\n");

                        System.out.println("Enter Battery's name: "); name = reader.readLine();
                        System.out.println("Enter Battery's capacity: "); capacity = Integer.parseInt(reader.readLine());
                        System.out.println("Enter Battery's mAh: "); mAh = Integer.parseInt(reader.readLine());

                        batteries[Integer.parseInt(answer) - 1] = new Battery(name, capacity, mAh);
                        device.set_Battery(batteries[Integer.parseInt(answer) - 1]);
                        System.out.println("\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }
                    System.out.println("\n");
                    device.set_Battery(batteries[Integer.parseInt(answer) - 1]);
                    System.out.println("\nPress any key to continue...");
                    reader.readLine();
                }

                else if (answer.charAt(0) == '3') {
                    System.out.println("Choose Cotton wool in list:\n");
                    for (int i = 0; i < 5; i++) {
                        if (cotton_wools[i] != null)
                            System.out.println((i + 1) + " " + cotton_wools[i].get_name());
                else System.out.println((i + 1) + " create new...");

                    }
                    System.out.println("\n6 Remove added parts.\n");

                    System.out.println("Your answer: ");
                    answer = reader.readLine();

                    if (answer.charAt(0) == '6') {
                        for (int i = 1; i < 5; i++) {
                            if (cotton_wools[i] == null) continue;
                            cotton_wools[i] = null;
                        }
                        System.out.println("All added cotton wools were deleted!");
                        device.set_Cotton_wool(cotton_wools[0]);
                        System.out.println("\n\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }

                    if (cotton_wools[Integer.parseInt(answer) - 1] == null) {
                        System.out.println("\nCreate new:\n");

                        System.out.println("Enter Cotton wool's name: "); name = reader.readLine();
                        System.out.println("Enter Cotton wool's heating temperature: "); heating_temperature = Integer.parseInt(reader.readLine());
                        System.out.println("Enter Cotton wool's fiber density: "); fiber_density = Integer.parseInt(reader.readLine());

                        cotton_wools[Integer.parseInt(answer) - 1] = new Cotton_wool(name, heating_temperature, fiber_density);
                        device.set_Cotton_wool(cotton_wools[Integer.parseInt(answer) - 1]);
                        System.out.println("\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }
                    System.out.println("\n");
                    device.set_Cotton_wool(cotton_wools[Integer.parseInt(answer) - 1]);
                    System.out.println("\nPress any key to continue...");
                    reader.readLine();
                }

                else if (answer.charAt(0) == '4') {
                    System.out.println("Choose Goo in list:\n");
                    for (int i = 0; i < 5; i++) {
                        if (goos[i] != null)
                            System.out.println((i + 1) + " " + goos[i].get_name());
                else System.out.println((i + 1) + " create new...");

                    }
                    System.out.println("\n6 Remove added parts.\n");

                    System.out.println("Your answer: ");
                    answer = reader.readLine();

                    if (answer.charAt(0) == '6') {
                        for (int i = 1; i < 5; i++) {
                            if (goos[i] == null) continue;
                            goos[i] = null;
                        }
                        System.out.println("All added goos were deleted!");
                        device.set_Goo(goos[0]);
                        System.out.println("\n\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }

                    if (goos[Integer.parseInt(answer) - 1] == null) {
                        System.out.println("\nCreate new:\n");

                        System.out.println("Enter Goo's name: "); name = reader.readLine();
                        System.out.println("Enter Goo's strength: "); strength = Integer.parseInt(reader.readLine());
                        System.out.println("Enter Goo's taste: "); taste = reader.readLine();

                        goos[Integer.parseInt(answer) - 1] = new Goo(name, strength, taste);
                        device.set_Goo(goos[Integer.parseInt(answer) - 1]);
                        System.out.println("\nPress any key to continue...");
                        reader.readLine();
                        continue;
                    }
                    System.out.println("\n");
                    device.set_Goo(goos[Integer.parseInt(answer) - 1]);
                    System.out.println("\nPress any key to continue...");
                    reader.readLine();
                }

            }

            else if (answer.charAt(0) == '3') break;
        }
    }
}
