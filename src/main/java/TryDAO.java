public class TryDAO {
    public static void main(String[] args) {
        DAO cur = new DAO();
        HuluRegistration user1 = new HuluRegistration("aaa@bbb", "passcode", "myname",
                "Female", 03, 02, 1999);
        HuluRegistration user2 = new HuluRegistration("cd@edu", "randomnumber", "anonymous",
                "Male", 13, 12, 1987);
        HuluRegistration user3 = new HuluRegistration("frozenlich318@gmail.com", "Icannottell",
                "Lichking", "Male", 18, 03, 1998);

        cur.registerUser(user1);
        cur.registerUser(user2);
        cur.printAllUser();

        cur.deleteUser("myname");
        cur.registerUser(user3);
        cur.updateUser(user2);
        cur.printAllUser();
    }
}
