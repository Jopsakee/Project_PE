import java.util.HashMap;

public class Hero extends Entity {
    private int deathBlowPercentage;
    private int protection = 10;
    private String headImage;
    private HashMap<Anchor, Gear> hashmap = new HashMap<Anchor, Gear>();

    public Hero(String name, double strength, int hitpoints, String image, String headImage) {
        super(name, hitpoints, strength, image);
        this.setHeadImage(headImage);
    }

    // public boolean isPrimeNr(int eHitPoints) {
    // for (int i = 1; i < (eHitPoints / 2) + 1; i++) {
    // if (i % 2 == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public int isPrimeHitPoint() {
    // boolean count = false;
    // while (count == false) {
    // if (!isPrimeNr((int) (this.geteHitPoints()))) {
    // this.seteHitPoints((int) (this.geteHitPoints() - 1));
    // } else {
    // count = true;
    // }

    // }
    // return (int) (this.geteHitPoints());
    // }

    public void Hit(Entity enemyHero) {
        System.out.println(this.getName() + " prepares to attack " + enemyHero.getName() + "..");
        int slaagkans = (int) (Math.random() * 101);
        if (slaagkans >= 20) {
            System.out.println("Hit!");
            this.calculateDamage(enemyHero);
        } else {
            System.out.println("Miss!");

        }
    }

    public void calculateDamage(Entity enemyHero) {
        double damage = 0;
        int weaponDamage = bonusStrength();
        damage = (int) ((this.getStrength() + weaponDamage - enemyHero.getProtection()) / 2D);
        System.out.println("(Strength + weapon - protection)/2 -> (" + this.getStrength() + " + " + weaponDamage
                + " - " + enemyHero.getProtection() + ")/2 = " + damage);
        if (damage >= enemyHero.geteHitPoints()) {
            this.deathBlowPercentage = (int) Math.random() * 100;
            this.seteHitPoints((int) (this.geteHitPoints()
                    + this.getDeathBlowPercentage() * (this.getHitpoints() - this.geteHitPoints())));
            System.out.println(this.getName() + " hit " + enemyHero.getName() + " for " + damage + " hitpoints!");
            enemyHero.seteHitPoints(0);
            System.out.println(
                    "K.O.! " + this.getName() + " has bested " + enemyHero.getName() + " in combat! Leaving combat..");

        } else {
            enemyHero.seteHitPoints((int) (enemyHero.geteHitPoints() - damage));
            System.out.println(
                    "Hero, " + this.getName() + " hit " + enemyHero.getName() + " for " + damage + " hitpoints!");
            System.out.println(enemyHero.getName() + " has " + enemyHero.geteHitPoints() + " hitpoints left!");
        }
    }

    public void equipLeftWeapon(Gear weapon) {
        this.getHashmap().put(Anchor.LEFT, weapon);
    }

    public void equipRightWeapon(Gear weapon) {
        this.getHashmap().put(Anchor.RIGHT, weapon);
    }

    public HashMap<Anchor, Gear> getHashmap() {
        return this.hashmap;
    }

    public int getProtection() {
        return protection + this.bonusArmor();
    }

    public int getDeathBlowPercentage() {
        return deathBlowPercentage;
    }

    public void unequipWeapon1() {
        this.getHashmap().remove(Anchor.LEFT);
    }

    public void unequipWeapon2() {
        this.getHashmap().remove(Anchor.RIGHT);
    }

    public int bonusStrength() {
        int bonus = 0;
        if (this.getHashmap().get(Anchor.LEFT) instanceof Weapon) {
            bonus += ((Weapon) this.getHashmap().get(Anchor.LEFT)).getDamage();
        }
        if (this.getHashmap().get(Anchor.RIGHT) instanceof Weapon) {
            bonus += ((Weapon) this.getHashmap().get(Anchor.RIGHT)).getDamage();
        }
        return bonus;
    }

    public int bonusArmor() {
        if (this.getHashmap().get(Anchor.BODY) == null) {
            return 0;
        } else {
            return ((Armor) this.getHashmap().get(Anchor.BODY)).getActualArmor();
        }
    }

    public void equipArmor(Gear gear) {
        this.getHashmap().remove(Anchor.BODY, this.getHashmap().get(Anchor.BODY));
        this.getHashmap().put(Anchor.BODY, gear);
    }

    public void unequipArmor() {
        this.getHashmap().remove(Anchor.BODY);
    }

    public void dropGear(Anchor anchor) {
        this.getHashmap().get(anchor).setHolder(null);
        ;
        this.getHashmap().put(anchor, null);
        this.getHashmap().remove(anchor);
    }

    public void heal() {
        double percentage = (int) (Math.random() * 101) / 100D;
        int increasedHp = (int) (percentage * (this.getHitpoints() - this.geteHitPoints()));
        while (increasedHp < 40) {
            percentage = (int) (Math.random() * 101) / 100D;
            increasedHp = (int) (percentage * (this.getHitpoints() - this.geteHitPoints()) + 25);
        }
        this.seteHitPoints(this.geteHitPoints() + increasedHp);
        if (this.geteHitPoints() > this.getHitpoints()) {
            this.seteHitPoints(this.getHitpoints());
        }
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

}