import java.util.ArrayList;
import java.util.Scanner;

public class DAO {
    private ArrayList<HuluRegistration> registeredUser = new ArrayList<HuluRegistration>();

    public void registerUser(HuluRegistration user) {
        registeredUser.add(user);
    }

    public void deleteUser(String name) {
        registeredUser.removeIf(user -> user.getName().equals(name));
    }

    /*
     * This method only updates the user's name by input
     */
    public void updateUser(HuluRegistration user) {
        Scanner in = new Scanner(System.in);
        String newName = in.nextLine();

        user.setName(newName);
    }

    public void printAllUser() {
        for (HuluRegistration user : registeredUser) {
            System.out.print(user.getName());
            System.out.println("  " + user.getEmail());
        }
    }
}
