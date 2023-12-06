package week10.lab;

public class Main {
    public static void main(String[] args) {
        User bassar = new User("chrvtzbssr");
        Admin daniel = new Admin("Daniel");

        MessagingSystem ms = new MessagingSystem();

        ms.sendMessage(daniel);
    }
}
