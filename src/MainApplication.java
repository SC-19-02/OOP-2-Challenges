public class MainApplication {
    public static void main(String[] args) {
        Admin curAdmin = new Admin(1234, "Stephan", "xa1@LW42%3");
        User curUser = new User(4455, "John");

        System.out.println("\nAdmin ID: " + curAdmin.getId());
        System.out.println("Admin name: " + curAdmin.getName());

        System.out.println("\nAdmin (" + curAdmin.getName() + ") operations:");
        curAdmin.performOperation(new Update());
        curAdmin.performOperation(new Delete());
        curAdmin.performOperation(new View());

        System.out.println("\nUser ID: " + curUser.getId());
        System.out.println("User name: " + curUser.getName());

        System.out.println("\nUser (" + curUser.getName() + ") operations:");
        curUser.performOperation(new View());
    }
}