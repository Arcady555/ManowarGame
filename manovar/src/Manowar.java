public class Manowar {

    private  int health = 100;
    public int getHealth() {
        return health;
    }
    String name = this.toString();
    public void fight(Manowar point1, Manowar point2) {
        System.out.println(point1.name + " strike!");
        point2.health -= 20;
        System.out.println("The " + point2.name + "'s health is " + point2.health);
        if (point2.health == 0) {
            System.out.println(point1.name + " win!!!!!");
        }
    }
}