package week5.lab;

public class Main {
    public static void main(String[] args) {
//        CivilService cs = new CivilService();
//        System.out.println(cs.getDaysLeft());
//        cs.work();
//        cs.work();
//        System.out.println(cs.getDaysLeft());

        Book tsh = new Book("Donna Tartt", "The Secret History", 1);
        CD cd = new CD("Pink Floyd", "Atom Heart Mother", 1970);

        Book book = new Book("Lav Nikolayevich Tolstoy", "Anna Karenina", 4);

        Box box = new Box(5);
        box.add(cd);
        box.add(tsh);
        box.add(book);
        System.out.println(box);

    }
}
