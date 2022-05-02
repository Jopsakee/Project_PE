public class Monster extends Entity {
    private int damage;
    private int protection;

    public Monster(String name, int damage, int protection, int hitpoints, double strength, String image) {
        super(name, hitpoints, strength, image);
        if (damage > 0 && damage <= 100) {
            this.damage = damage;
        } else {
            throw new IllegalArgumentException("Weapon damage is not valid.");
        }
        if (protection > 0 && protection <= 100) {
            this.setProtection(protection);
        } else {
            throw new IllegalArgumentException("Armor value is not valid.");
        }
    }

    public void Hit(Entity opponent) {
        int number = (int) (Math.random() * 101);
        if (number >= opponent.getProtection()) {
            int damage = (int) (this.getDamage() + (this.getStrength() - 5) / 3);
            System.out.println(this.getName() + " hit " + opponent.getName() + " for " + damage + "!");
            opponent.seteHitPoints(opponent.geteHitPoints() - damage);
            System.out.println(opponent.getName() + " has " + opponent.geteHitPoints() + " hitpoints left!");
        } else {
            System.out.println("Miss! number = " + number);
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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
