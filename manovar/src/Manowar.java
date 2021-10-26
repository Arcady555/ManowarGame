public class Manowar {

    private  int health = 100;
    public int getHealth() {
        return health;
    }
    public String toString() {
        return "man";
    }

    public void fight(Manowar point1, Manowar point2) {
        System.out.println(point1 + " strike!");
        point2.health -= 20;
        System.out.println("The " + point2 + "'s health is " + point2.health);
        if (point2.health == 0) {
            System.out.println(point1 + " win!!!!!");
            System.exit(0);
        }
    }
}