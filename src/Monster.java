public class Monster extends Entity {
    private int protection;

    public Monster(String name, int protection, int hitpoints, double strength, String image) {
        super(name, hitpoints, strength, image);
        if (protection > 0 && protection <= 100) {
            this.setProtection(protection);
        } else {
            throw new IllegalArgumentException("Armor value is not valid.");
        }
    }

    public void Hit(Entity opponent) {
        int number = (int) (Math.random() * 101);
        if (number >= 20) {
            int damage = (int) ((this.getStrength() - opponent.getProtection()) / 3);
            System.out.println(this.getName() + " hit " + opponent.getName() + " for " + damage + "!");
            opponent.seteHitPoints(opponent.geteHitPoints() - damage);
            System.out.println(opponent.getName() + " has " + opponent.geteHitPoints() + " hitpoints left!");
        } else {
            System.out.println("Miss! number = " + number);
        }
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int bonusStrength() {
        return 0;
    }

}
