import java.util.Random;

class Main {

    public static void main(String[] args) {
        Manowar man1 = new Manowar();
        man1.name = "man1";
        Manowar man2 = new Manowar();
        man2.name = "man2";
        Random hit = new Random();
        int man1Health = man1.getHealth();
        int man2Health = man2.getHealth();
        while (man1Health > 0 | man2Health > 0) {
            boolean bool = hit.nextBoolean();
            if (man1Health == 0 | man2Health == 0) break;
            if (bool) {
                man1.fight(man1, man2);
                man2Health -= 20;
            } else {
                man2.fight(man2, man1);
                man1Health -= 20;
            }
        }
    }
}