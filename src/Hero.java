import java.util.HashMap;

public class Hero extends Entity {
    private int deathBlowPercentage;
    private int protection = 0;
    private String headImage;
    private String angryImage;
    private int damage = 0;
    private HashMap<Anchor, Gear> hashmap = new HashMap<Anchor, Gear>();

    public Hero(String name, double strength, int hitpoints, String image, String headImage, String angryImage) {
        super(name, hitpoints, strength, image);
        this.setHeadImage(headImage);
        this.setAngryImage(angryImage);
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
        // System.out.println(this.getName() + " prepares to attack " +
        // enemyHero.getName() + "..");
        int slaagkans = (int) (Math.random() * 101);
        if (slaagkans >= 20) {
            // System.out.println("Hit!");
            this.calculateDamage(enemyHero);
        } else {
            // System.out.println("Miss!");

        }
    }

    public void calculateDamage(Entity enemyHero) {

        int weaponDamage = bonusStrength();
        damage = (int) ((this.getStrength() + weaponDamage - (enemyHero.getProtection() * 0.4)) / 2D);
        // System.out.println("(Strength + weapon - protection)/2 -> (" +
        // this.getStrength() + " + " + weaponDamage
        // + " - " + enemyHero.getProtection() + ")/2 = " + damage);
        if (damage >= enemyHero.geteHitPoints()) {
            this.deathBlowPercentage = (int) Math.random() * 100;
            this.seteHitPoints((int) (this.geteHitPoints()
                    + this.getDeathBlowPercentage() * (this.getHitpoints() - this.geteHitPoints())));
            enemyHero.seteHitPoints(0);
            // System.out.println(
            // "K.O.! " + this.getName() + " has bested " + enemyHero.getName() + " in
            // combat! Leaving combat..");
        } else {
            enemyHero.seteHitPoints((int) (enemyHero.geteHitPoints() - damage));
            // System.out.println(
            // "Hero, " + this.getName() + " hit " + enemyHero.getName() + " for " + damage
            // + " hitpoints!");
            // System.out.println(enemyHero.getName() + " has " + enemyHero.geteHitPoints()
            // + " hitpoints left!");
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
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getDeathBlowPercentage() {
        return deathBlowPercentage;
    }

    public int getDamage() {
        return damage;
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

    public void equipHelmet(Helmet helmet) {
        this.getHashmap().remove(Anchor.HELMET, this.getHashmap().get(Anchor.HELMET));
        this.getHashmap().put(Anchor.HELMET, helmet);
        this.setProtection(this.getProtection() + helmet.getActualArmor());
    }

    public void unequipHelmet(Helmet helmet) {
        this.setProtection(this.getProtection() - helmet.getActualArmor());
        this.getHashmap().remove(Anchor.HELMET);
    }

    public void equipArmor(Body body) {
        this.getHashmap().remove(Anchor.BODY, this.getHashmap().get(Anchor.BODY));
        this.getHashmap().put(Anchor.BODY, body);
        this.setProtection(this.getProtection() + body.getActualArmor());
    }

    public void unequipArmor(Body body) {
        this.setProtection(this.getProtection() - body.getActualArmor());
        this.getHashmap().remove(Anchor.BODY);
    }

    public void equipLeggings(Leggings leggings) {
        this.getHashmap().remove(Anchor.LEGGINGS, this.getHashmap().get(Anchor.LEGGINGS));
        this.getHashmap().put(Anchor.LEGGINGS, leggings);
        this.setProtection(this.getProtection() + leggings.getActualArmor());
    }

    public void unequipLeggings(Leggings leggings) {
        this.setProtection(this.getProtection() - leggings.getActualArmor());
        this.getHashmap().remove(Anchor.LEGGINGS);
    }

    public void equipBoots(Boots boots) {
        this.getHashmap().remove(Anchor.BOOTS, this.getHashmap().get(Anchor.BOOTS));
        this.getHashmap().put(Anchor.BOOTS, boots);
        this.setProtection(this.getProtection() + boots.getActualArmor());
    }

    public void unequipBoots(Boots boots) {
        this.setProtection(this.getProtection() - boots.getActualArmor());
        this.getHashmap().remove(Anchor.BOOTS);
    }

    public void equipGloves(Gloves gloves) {
        this.getHashmap().remove(Anchor.GLOVES, this.getHashmap().get(Anchor.GLOVES));
        this.getHashmap().put(Anchor.GLOVES, gloves);
        this.setProtection(this.getProtection() + gloves.getActualArmor());
    }

    public void unequipGloves(Gloves gloves) {
        this.setProtection(this.getProtection() - gloves.getActualArmor());
        this.getHashmap().remove(Anchor.GLOVES);
    }

    public void dropGear(Anchor anchor) {
        this.getHashmap().get(anchor).setHolder(null);
        ;
        this.getHashmap().put(anchor, null);
        this.getHashmap().remove(anchor);
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getAngryImage() {
        return angryImage;
    }

    public void setAngryImage(String angryImage) {
        this.angryImage = angryImage;
    }
}