import java.util.Random;

class Main {

    public static void main(String[] args) {
        String winner = "";
        Manowar man1 = new Manowar1();
        Manowar man2 = new Manowar2();
        Random hit = new Random();
        int man1Health = man1.getHealth();
        int man2Health = man2.getHealth();
        while (man1Health > 0 | man2Health > 0) {
            boolean man = hit.nextBoolean();
            if (man) {
                man1.strike(man2);
                man2Health -= 20;
                System.out.println("The man2's health is " + man2Health);
                if (man2Health == 0) {
                    winner = man1.toString();
                    break;
                }
            } else {
                man2.strike(man1);
                man1Health -= 20;
                System.out.println("The man1's health is " + man1Health);
                if (man1Health == 0) {
                    winner = man2.toString();
                    break;
                }
            }
        }
        System.out.println(winner + " win!!!");
    }
}
