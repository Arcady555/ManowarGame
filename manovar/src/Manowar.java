public class Manowar {
    private final int health = 100;
    public void strike (Manowar opponent) {
        System.out.println(this + " strike!");
    }

    public int getHealth() {
        return health;
    }
    public String toString() {
        return "man";
    }
}
