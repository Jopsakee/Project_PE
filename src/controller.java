import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.text.View;

import org.junit.Test.None;

import javafx.animation.PauseTransition;
import javafx.animation.TranslateTransition;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class controller {
    public TextField usernameField;

    public Text player;
    public Text titel;
    public Text titelChar;
    public Text nameHero;
    public Text hpHero;
    public Text strHero;
    public Text charText;
    public Text hpHeroEasy;
    public Text hpMonsterEasy;
    public Text healthHero;
    public Text healthMonster;
    public Text reviveText;
    public Text potionCount;
    public Text nameText;
    public Text hpText;
    public Text strText;
    public Text armorText;
    public Text miniName;
    public Text miniHp;
    public Text inspectStat;
    public Text inspectStatType;
    public Text scoreTeller;

    public AnchorPane anchor;

    public ImageView char1;
    public ImageView char2;
    public ImageView char3;
    public ImageView karakterKeuze;
    public ImageView heroEasy;
    public ImageView monsterEasy;
    public ImageView backpackImage;
    public ImageView backpackImageClosed;
    public ImageView inventorySlot1;
    public ImageView inventorySlot2;
    public ImageView inventorySlot3;
    public ImageView inventorySlot4;
    public ImageView inventorySlot5;
    public ImageView inventorySlot6;
    public ImageView inventorySlot7;
    public ImageView inventorySlot8;
    public ImageView inventorySlot9;
    public ImageView lootImage1;
    public ImageView lootImage2;
    public ImageView lootImage3;
    public ImageView potionSlot;
    public ImageView potionImage;
    public ImageView characterImage;
    public ImageView miniCharacterImage;
    public ImageView equipmentLeft;
    public ImageView equipmentRight;
    public ImageView equipmentBody;
    public ImageView inspectImg;
    public ImageView slashEffectOnMonster;
    public ImageView slashEffectOnHero;

    public Button startButton;
    public Button butChar1;
    public Button butChar2;
    public Button butChar3;
    public Button butBack;
    public Button butNext;
    public Button butEasy1;
    public Button butEasy2;
    public Button butEasy3;
    public Button butRevive;
    public Button butClose;
    public Button invButDel1;
    public Button invButDel2;
    public Button invButDel3;
    public Button invButDel4;
    public Button invButDel5;
    public Button invButDel6;
    public Button invButDel7;
    public Button invButDel8;
    public Button invButDel9;
    public Button invButEq1;
    public Button invButEq2;
    public Button invButEq3;
    public Button invButEq4;
    public Button invButEq5;
    public Button invButEq6;
    public Button invButEq7;
    public Button invButEq8;
    public Button invButEq9;
    public Button invButCl1;
    public Button invButCl2;
    public Button invButCl3;
    public Button invButCl4;
    public Button invButCl5;
    public Button invButCl6;
    public Button invButCl7;
    public Button invButCl8;
    public Button invButCl9;

    public VBox invBox1;
    public VBox invBox2;
    public VBox invBox3;
    public VBox invBox4;
    public VBox invBox5;
    public VBox invBox6;
    public VBox invBox7;
    public VBox invBox8;
    public VBox invBox9;

    public Pane startScreen;
    public Pane characterSelection;
    public Pane statScreen;
    public Pane levelScreen;;
    public Pane lootScreen;
    public Pane inventory;
    public Pane lootbag;
    public Pane deathScreen;
    public Pane fightScreen;
    public Pane characterMenu;
    public Pane miniScreen;
    public Pane inspect;

    public Label errorplayername;
    public Label playernamelabel;

    private Armor helmet;
    private Armor carapace;
    private Armor leggings;
    private Armor gloves;
    private Armor boots;
    private Armor upgradedhelmet;
    private Armor upgradedcarapace;
    private Armor upgradedleggings;
    private Armor upgradedgloves;
    private Armor upgradedboots;
    private Armor firerobe;
    private Armor necrorobe;
    private Armor druidrobe;
    private Armor darkcloak;
    private Armor shamanrobe;

    private String playerName;
    private Hero selectedHero;
    private Monster targetMonster;
    private Backpack backpack;

    private Weapon staffSkull;
    private Weapon staffFire;
    private Weapon staffNature;
    private Weapon staffVoid;
    private Weapon staffBroom;

    private Weapon sword;
    private Weapon sword2;
    private Weapon sword3;

    private Weapon daggerSkull;
    private Weapon daggerNature;
    private Weapon daggerVoid;
    private Weapon daggerFire;
    private Weapon daggerFireOffhand;

    public int level;
    private int revives = 2;
    private int potions = 1;
    private int scoreCounter = 0;

    private List<Monster> monsterList = new ArrayList<Monster>();
    private List<Gear> lootTable = new ArrayList<Gear>();
    private List<Gear> lootList = new ArrayList<Gear>();
    private List<ImageView> loot = new ArrayList<ImageView>();
    private List<ImageView> inventoryList = new ArrayList<ImageView>();
    private Monster deathKnight;
    private Monster shaman;
    private Monster succubus;
    private Monster assassin;
    private Monster witch;
    private Monster deadPrince;
    private Monster wolf;
    private Monster armorKnight;

    private JPanel healthbarHero;
    private JPanel healthbarMonster;
    private JProgressBar healthbar1;
    private JProgressBar healthbar2;
    private JPanel healthbars;

    public void initialize() throws IOException {

        /* Backpack initialiseren */
        backpack = new Backpack(100, 20);

        /* Monsters initialiseren */
        succubus = new Monster("Succubus", 10, 40, 30, "images/Dark_Elves/Character6_face2.png");
        monsterList.add(succubus);
        shaman = new Monster("Shaman", 15, 30, 30, "images/Dark_Elves/Character4_face1.png");
        monsterList.add(shaman);
        deathKnight = new Monster("DeathKnight", 20, 50, 30, "images/Dark_Elves/Character1_face3.png");
        monsterList.add(deathKnight);
        assassin = new Monster("Assassin", 25, 30, 50, "images/Dark_Elves/Character8_face4.png");
        monsterList.add(assassin);
        witch = new Monster("Witch", 30, 50, 35, "images/Dark_Elves/Character2_face3.png");
        monsterList.add(witch);
        deadPrince = new Monster("DeadPrince", 35, 60, 20, "images/Dark_Elves/Character3_face1.png");
        monsterList.add(deadPrince);
        wolf = new Monster("Wolf", 40, 70, 40, "images/Dark_Elves/Character5_face2.png");
        monsterList.add(wolf);
        armorKnight = new Monster("ArmorKnight", 50, 70, 35, "images/Dark_Elves/Character7_face4.png");
        monsterList.add(armorKnight);

        /* Armor initialiseren */
        helmet = new Armor(2, 5, "images/Armor/PNG/helmet.png");
        lootTable.add(helmet);
        carapace = new Armor(7, 10, "images/Armor/PNG/carapace.png");
        lootTable.add(carapace);
        leggings = new Armor(5, 8, "images/Armor/PNG/leggings.png");
        lootTable.add(leggings);
        gloves = new Armor(2, 3, "images/Armor/PNG/gloves.png");
        lootTable.add(gloves);
        boots = new Armor(2, 2, "images/Armor/PNG/boots.png");
        lootTable.add(boots);
        upgradedhelmet = new Armor(2, 8, "images/Armor/PNG/upgradedhelmet.png");
        lootTable.add(upgradedhelmet);
        upgradedcarapace = new Armor(8, 15, "images/Armor/PNG/upgradedcarapace.png");
        lootTable.add(upgradedcarapace);
        upgradedleggings = new Armor(5, 12, "images/Armor/PNG/upgradedleggings.png");
        lootTable.add(upgradedleggings);
        upgradedgloves = new Armor(2, 5, "images/Armor/PNG/upgradedgloves.png");
        lootTable.add(upgradedgloves);
        upgradedboots = new Armor(2, 4, "images/Armor/PNG/upgradedboots.png");
        lootTable.add(upgradedboots);
        darkcloak = new Armor(3, 7, "images/Armor/PNG/darkcloak.png");
        lootTable.add(darkcloak);
        druidrobe = new Armor(4, 9, "images/Armor/PNG/druidrobe.png");
        lootTable.add(druidrobe);
        firerobe = new Armor(4, 8, "images/Armor/PNG/firerobe.png");
        lootTable.add(firerobe);
        necrorobe = new Armor(5, 11, "images/Armor/PNG/necrorobe.png");
        lootTable.add(necrorobe);
        shamanrobe = new Armor(6, 10, "images/Armor/PNG/shamanrobe.png");
        lootTable.add(shamanrobe);

        /* Weapons initialiseren */
        // staffs
        staffFire = new Weapon(5, 7, "images/Weapons/Staffs/2.png");
        lootTable.add(staffFire);
        staffSkull = new Weapon(8, 14, "images/Weapons/Staffs/6.png");
        lootTable.add(staffSkull);
        staffNature = new Weapon(3, 7, "images/Weapons/Staffs/4.png");
        lootTable.add(staffNature);
        staffVoid = new Weapon(10, 21, "images/Weapons/Staffs/8.png");
        lootTable.add(staffVoid);
        staffBroom = new Weapon(3, 7, "images/Weapons/Staffs/10.png");
        lootTable.add(staffBroom);
        // swords
        sword = new Weapon(2, 7, "images/Weapons/Swords/1.png");
        lootTable.add(sword);
        sword2 = new Weapon(5, 14, "images/Weapons/Swords/2.png");
        lootTable.add(sword2);
        sword3 = new Weapon(5, 21, "images/Weapons/Swords/4.png");
        lootTable.add(sword3);
        // daggers
        daggerSkull = new Weapon(2, 7, "images/Weapons/Daggers/3.png");
        lootTable.add(daggerSkull);
        daggerNature = new Weapon(3, 7, "images/Weapons/Daggers/7.png");
        lootTable.add(daggerNature);
        daggerVoid = new Weapon(5, 14, "images/Weapons/Daggers/8.png");
        lootTable.add(daggerVoid);
        daggerFire = new Weapon(2, 14, "images/Weapons/Daggers/9.png");
        lootTable.add(daggerFire);
        daggerFireOffhand = new Weapon(2, 14, "images/Weapons/Daggers/10.png");
        lootTable.add(daggerFireOffhand);
        /* inventory slots toevoegen */
        inventoryList.add(inventorySlot1);
        inventoryList.add(inventorySlot2);
        inventoryList.add(inventorySlot3);
        inventoryList.add(inventorySlot4);
        inventoryList.add(inventorySlot5);
        inventoryList.add(inventorySlot6);
        inventoryList.add(inventorySlot7);
        inventoryList.add(inventorySlot8);
        inventoryList.add(inventorySlot9);

        loot.add(lootImage1);
        loot.add(lootImage2);
        loot.add(lootImage3);

    }

    /* Van startscherm naar hero selection */
    public void naBeginscherm() {
        playernamelabel.setText("");
        playerName = usernameField.getText();
        this.setPlayerName(playerName);
        if (playerName != null) {
            startScreen.setVisible(false);
            characterSelection.setVisible(true);
        }

    }

    // schermen afh van de geselecteerde hero
    public void selectedHero1() {
        Hero hero1 = new Hero("Gert", 50, 100, "images/Heroes/PNG/Warriors/Character3_face3.png",
                "images/Heroes/PNG/Warriors_faces_transperent/Character3_face3.png");
        characterSelection.setVisible(false);
        statScreen.setVisible(true);
        this.setSelectedHero(hero1);
        nameHero.setText(selectedHero.getName());
        hpHero.setText(String.valueOf(selectedHero.getHitpoints()));
        strHero.setText(String.valueOf((int) (selectedHero.getStrength())));
        System.out.println("Naam: " + selectedHero.getName());
        karakterKeuze.setImage(new Image(selectedHero.getImage()));
    }

    public void selectedHero2() {
        Hero hero2 = new Hero("Bob", 30, 130, "images/Heroes/PNG/Warriors/Character6_face4.png",
                "images/Heroes/PNG/Warriors_faces_transperent/Character6_face4.png");
        characterSelection.setVisible(false);
        statScreen.setVisible(true);
        this.setSelectedHero(hero2);
        nameHero.setText(selectedHero.getName());
        hpHero.setText(String.valueOf(selectedHero.getHitpoints()));
        strHero.setText(String.valueOf(selectedHero.getStrength()));
        System.out.println("Naam: " + selectedHero.getName());
        karakterKeuze.setImage(new Image(selectedHero.getImage()));
    }

    public void selectedHero3() {
        Hero hero3 = new Hero("Jan", 70, 60, "images/Heroes/PNG/Warriors/Character2_face1.png",
                "images/Heroes/PNG/Warriors_faces_transperent/Character2_face1.png");
        characterSelection.setVisible(false);
        statScreen.setVisible(true);
        this.setSelectedHero(hero3);
        nameHero.setText(selectedHero.getName());
        hpHero.setText(String.valueOf(selectedHero.getHitpoints()));
        strHero.setText(String.valueOf(selectedHero.getStrength()));
        System.out.println("Naam: " + selectedHero.getName());
        karakterKeuze.setImage(new Image(selectedHero.getImage()));
    }

    public void back() {
        statScreen.setVisible(false);
        characterSelection.setVisible(true);
    }

    public void next() {
        statScreen.setVisible(false);
        miniScreen.setVisible(true);
        miniName.setText(selectedHero.getName());
        miniHp.setText(selectedHero.geteHitPoints() + "/" + selectedHero.getHitpoints());
        miniCharacterImage.setImage(new Image(selectedHero.getHeadImage()));
        levelScreen.setVisible(true);
        fightScreen.setVisible(false);
        backpackImage.setVisible(true);
        potionSlot.setVisible(true);
        potionCount.setVisible(true);
        lootScreen.setVisible(false);
        inventory.setVisible(false);
        lootbag.setVisible(false);
        potionCount.setText(String.valueOf(potions));
        scoreTeller.setText(String.valueOf(scoreCounter));
    }

    // levels
    public void easyLevel1() {
        levelScreen.setVisible(false);
        fightScreen.setVisible(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        Image img = new Image(
                "images/Backgrounds/levelEasy.jpg");
        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                backgroundSize);
        Background bGround = new Background(bImg);
        fightScreen.setBackground(bGround);
        this.setTargetMonster(succubus);
        targetMonster.seteHitPoints(targetMonster.getHitpoints());
        heroEasy.setImage(new Image(selectedHero.getImage()));
        monsterEasy.setImage(new Image(this.getTargetMonster().getImage()));
        healthHero.setText(String.valueOf(selectedHero.geteHitPoints()));
        healthMonster.setText(String.valueOf(this.getTargetMonster().getHitpoints()));
        /*
         * healthbar1 = new JProgressBar(0, this.selectedHero.geteHitPoints());
         * healthbar2 = new JProgressBar(0, this.targetMonster.geteHitPoints());
         * healthbar1.setPreferredSize(new Dimension(300, 30));
         * healthbar2.setPreferredSize(new Dimension(300, 30));
         * healthbar1.setValue(this.selectedHero.geteHitPoints());
         * healthbar2.setValue(this.targetMonster.geteHitPoints());
         * 
         * 
         * healthbars.add(healthbar1);
         * healthbars.add(healthbar2);
         */
        for (int i = 0; i < lootList.size(); i++) {
            loot.get(i).setImage(null);
        }
        lootList.clear();
    }

    public void easyLevel2() {
        levelScreen.setVisible(false);
        fightScreen.setVisible(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        Image img = new Image(
                "images/Backgrounds/levelEasy.jpg");
        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                backgroundSize);
        Background bGround = new Background(bImg);
        fightScreen.setBackground(bGround);
        this.setTargetMonster(shaman);
        targetMonster.seteHitPoints(targetMonster.getHitpoints());
        heroEasy.setImage(new Image(selectedHero.getImage()));
        monsterEasy.setImage(new Image(this.getTargetMonster().getImage()));
        healthHero.setText(String.valueOf(selectedHero.geteHitPoints()));
        healthMonster.setText(String.valueOf(this.getTargetMonster().getHitpoints()));
        /*
         * healthbar1 = new JProgressBar(0, this.selectedHero.geteHitPoints());
         * healthbar2 = new JProgressBar(0, this.targetMonster.geteHitPoints());
         * healthbar1.setPreferredSize(new Dimension(300, 30));
         * healthbar2.setPreferredSize(new Dimension(300, 30));
         * healthbar1.setValue(this.selectedHero.geteHitPoints());
         * healthbar2.setValue(this.targetMonster.geteHitPoints());
         * 
         * healthbars.add(healthbar1);
         * healthbars.add(healthbar2);
         */
        for (int i = 0; i < lootList.size(); i++) {
            loot.get(i).setImage(null);
        }
        lootList.clear();
    }

    public void easyLevel3() {
        levelScreen.setVisible(false);
        fightScreen.setVisible(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        Image img = new Image(
                "images/Backgrounds/levelEasy.jpg");
        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                backgroundSize);
        Background bGround = new Background(bImg);
        fightScreen.setBackground(bGround);
        this.setTargetMonster(deathKnight);
        targetMonster.seteHitPoints(targetMonster.getHitpoints());
        heroEasy.setImage(new Image(selectedHero.getImage()));
        monsterEasy.setImage(new Image(this.getTargetMonster().getImage()));
        healthHero.setText(String.valueOf(selectedHero.geteHitPoints()));
        healthMonster.setText(String.valueOf(this.getTargetMonster().getHitpoints()));
        for (int i = 0; i < lootList.size(); i++) {
            loot.get(i).setImage(null);
        }
        lootList.clear();
    }

    public void medLevel1() {
        levelScreen.setVisible(false);
        fightScreen.setVisible(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        Image img = new Image(
                "images/Backgrounds/mediumBackground.png");
        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                backgroundSize);
        Background bGround = new Background(bImg);
        fightScreen.setBackground(bGround);
        this.setTargetMonster(witch);
        targetMonster.seteHitPoints(targetMonster.getHitpoints());
        heroEasy.setImage(new Image(selectedHero.getImage()));
        monsterEasy.setImage(new Image(this.getTargetMonster().getImage()));
        healthHero.setText(String.valueOf(selectedHero.geteHitPoints()));
        healthMonster.setText(String.valueOf(this.getTargetMonster().getHitpoints()));
        for (int i = 0; i < lootList.size(); i++) {
            loot.get(i).setImage(null);
        }
        lootList.clear();
    }

    public void medLevel2() {
        levelScreen.setVisible(false);
        fightScreen.setVisible(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        Image img = new Image(
                "images/Backgrounds/mediumBackground.png");
        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                backgroundSize);
        Background bGround = new Background(bImg);
        fightScreen.setBackground(bGround);
        this.setTargetMonster(assassin);
        targetMonster.seteHitPoints(targetMonster.getHitpoints());
        heroEasy.setImage(new Image(selectedHero.getImage()));
        monsterEasy.setImage(new Image(this.getTargetMonster().getImage()));
        healthHero.setText(String.valueOf(selectedHero.geteHitPoints()));
        healthMonster.setText(String.valueOf(this.getTargetMonster().getHitpoints()));
        for (int i = 0; i < lootList.size(); i++) {
            loot.get(i).setImage(null);
        }
        lootList.clear();
    }

    public void medLevel3() {
        levelScreen.setVisible(false);
        fightScreen.setVisible(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        Image img = new Image(
                "images/Backgrounds/mediumBackground.png");
        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                backgroundSize);
        Background bGround = new Background(bImg);
        fightScreen.setBackground(bGround);
        this.setTargetMonster(deadPrince);
        targetMonster.seteHitPoints(targetMonster.getHitpoints());
        heroEasy.setImage(new Image(selectedHero.getImage()));
        monsterEasy.setImage(new Image(this.getTargetMonster().getImage()));
        healthHero.setText(String.valueOf(selectedHero.geteHitPoints()));
        healthMonster.setText(String.valueOf(this.getTargetMonster().getHitpoints()));
        for (int i = 0; i < lootList.size(); i++) {
            loot.get(i).setImage(null);
        }
        lootList.clear();
    }

    public void hardLevel1() {
        levelScreen.setVisible(false);
        fightScreen.setVisible(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        Image img = new Image(
                "images/Backgrounds/hardBackground.png");
        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                backgroundSize);
        Background bGround = new Background(bImg);
        fightScreen.setBackground(bGround);
        this.setTargetMonster(wolf);
        targetMonster.seteHitPoints(targetMonster.getHitpoints());
        heroEasy.setImage(new Image(selectedHero.getImage()));
        monsterEasy.setImage(new Image(this.getTargetMonster().getImage()));
        healthHero.setText(String.valueOf(selectedHero.geteHitPoints()));
        healthMonster.setText(String.valueOf(this.getTargetMonster().getHitpoints()));
        for (int i = 0; i < lootList.size(); i++) {
            loot.get(i).setImage(null);
        }
        lootList.clear();
    }

    public void hardLevel2() {
        levelScreen.setVisible(false);
        fightScreen.setVisible(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        Image img = new Image(
                "images/Backgrounds/hardBackground.png");
        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                backgroundSize);
        Background bGround = new Background(bImg);
        fightScreen.setBackground(bGround);
        this.setTargetMonster(armorKnight);
        targetMonster.seteHitPoints(targetMonster.getHitpoints());
        heroEasy.setImage(new Image(selectedHero.getImage()));
        monsterEasy.setImage(new Image(this.getTargetMonster().getImage()));
        healthHero.setText(String.valueOf(selectedHero.geteHitPoints()));
        healthMonster.setText(String.valueOf(this.getTargetMonster().getHitpoints()));
        for (int i = 0; i < lootList.size(); i++) {
            loot.get(i).setImage(null);
        }
        lootList.clear();
    }

    public void attackEffectOnMonster() {
        slashEffectOnMonster.setVisible(true);
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(slashEffectOnMonster);
        translate.setDuration(Duration.millis(100));
        translate.setCycleCount(1);
        translate.play();
        translate.setOnFinished((e) -> {
            slashEffectOnMonster.setVisible(false);
        });
    }

    public void attackEffectOnHero() {
        slashEffectOnHero.setVisible(true);
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(slashEffectOnHero);
        translate.setDuration(Duration.millis(100));
        translate.setCycleCount(1);
        translate.play();
        translate.setOnFinished((e) -> {
            slashEffectOnHero.setVisible(false);
        });
    }

    /* ATTACK */
    public void autoAttack() {
        this.selectedHero.Hit(this.getTargetMonster());
        attackEffectOnMonster();
        healthMonster.setText(String.valueOf(this.targetMonster.geteHitPoints()));
        if (this.targetMonster.geteHitPoints() > 0) {
            this.targetMonster.Hit(this.selectedHero);
            attackEffectOnHero();

            miniHp.setText(selectedHero.geteHitPoints() + "/" + selectedHero.getHitpoints());
            if (this.selectedHero.geteHitPoints() <= 0) {
                System.out.println("Hero, " + this.selectedHero.getName() + " died!\n");
                healthHero.setText(String.valueOf(0));
                reviveText.setText(String.valueOf(revives));
                if (revives == 0) {
                    butRevive.setDisable(true);
                    butRevive.setVisible(false);
                }
                fightScreen.setVisible(false);
                potionSlot.setVisible(false);
                potionCount.setVisible(false);
                deathScreen.setVisible(true);
            } else {
                healthHero.setText(String.valueOf(this.selectedHero.geteHitPoints()));
            }

        } else {
            killTarget();
        }

    }

    public void killTarget() {
        int getal = 0;
        int teller = 0;
        if (this.targetMonster.geteHitPoints() <= 0) {
            scoreCounter++;
            lootImage1.setVisible(true);
            lootImage2.setVisible(true);
            lootImage3.setVisible(true);
            lootImage1.setDisable(false);
            lootImage2.setDisable(false);
            lootImage3.setDisable(false);
            lootScreen.setVisible(true);
            potionImage.setDisable(false);
            potionImage.setVisible(true);
            lootbag.setVisible(true);
            inventory.setVisible(true);
            teller = (int) (Math.random() * 3) + 1;
            int index = 0;
            // System.out.println("Teller: " + teller);
            int chanceOfPotion = (int) (Math.random() * 2);
            if (chanceOfPotion == 1) {
                potionImage.setImage(new Image("images/Backgrounds/potion.png"));
            }
            for (int i = 0; i < teller; i++) {
                index = (int) (Math.random() * lootTable.size());
                System.out.println("Your loot: " + lootTable.get(index).getIdNo());
                if (getal == 0) {
                    lootList.add(lootTable.get(index));
                    loot.get(0).setImage(new Image(lootTable.get(index).getImage()));
                    getal = 1;
                } else {
                    if (lootTable.get(index).getIdNo() == lootList.get(i - 1).getIdNo()) {
                        System.out.println("Item bestaat al.\n");
                        teller--;
                    } else {
                        lootList.add(lootTable.get(index));
                        loot.get(i).setImage(new Image(lootTable.get(index).getImage()));
                    }
                }

            }
        }

    }

    public void lootInBackpack1() {
        int teller = 0;
        for (int i = 0; i < inventoryList.size(); i++) {
            if (inventoryList.get(i).getImage() == null) {
                if (teller == 0) {
                    backpack.getBackpackContentList().add(lootList.get(0));
                    inventoryList.get(i).setImage(new Image(lootList.get(0).getImage()));
                    lootImage1.setVisible(false);
                    lootImage1.setDisable(true);
                    teller = 1;

                }
            }
        }

    }

    public void lootInBackpack2() {
        int teller = 0;
        for (int i = 0; i < inventoryList.size(); i++) {
            if (inventoryList.get(i).getImage() == null) {
                if (teller == 0) {
                    backpack.getBackpackContentList().add(lootList.get(1));
                    inventoryList.get(i).setImage(new Image(lootList.get(1).getImage()));
                    lootImage2.setVisible(false);
                    lootImage2.setDisable(true);
                    teller = 1;

                }
            }
        }

    }

    public void lootInBackpack3() {
        int teller = 0;
        for (int i = 0; i < inventoryList.size(); i++) {
            if (inventoryList.get(i).getImage() == null) {
                if (teller == 0) {
                    backpack.getBackpackContentList().add(lootList.get(2));
                    inventoryList.get(i).setImage(new Image(lootList.get(2).getImage()));
                    lootImage3.setVisible(false);
                    lootImage3.setDisable(true);
                    teller = 1;
                }
            }
        }

    }

    public void lootPotion() {
        potionImage.setVisible(false);
        potionImage.setDisable(true);
        potions++;
        potionCount.setText(String.valueOf(potions));
    }

    public void clearBackpack() {
        backpack.getBackpackContentList().clear();
        inventoryList.clear();
    }

    /* open vbox */
    public void selectItem1() {
        if (inventoryList.get(0).getImage() != null) {
            invBox1.setVisible(true);
            invBox1.setDisable(false);
        }

    }

    public void selectItem2() {
        if (inventoryList.get(1).getImage() != null) {
            invBox2.setVisible(true);
            invBox2.setDisable(false);
        }
    }

    public void selectItem3() {
        if (inventoryList.get(2).getImage() != null) {
            invBox3.setVisible(true);
            invBox3.setDisable(false);
        }
    }

    public void selectItem4() {
        if (inventoryList.get(3).getImage() != null) {
            invBox4.setVisible(true);
            invBox4.setDisable(false);
        }
    }

    public void selectItem5() {
        if (inventoryList.get(4).getImage() != null) {
            invBox5.setVisible(true);
            invBox5.setDisable(false);
        }
    }

    public void selectItem6() {
        if (inventoryList.get(5).getImage() != null) {
            invBox6.setVisible(true);
            invBox6.setDisable(false);
        }
    }

    public void selectItem7() {
        if (inventoryList.get(6).getImage() != null) {
            invBox7.setVisible(true);
            invBox7.setDisable(false);
        }
    }

    public void selectItem8() {
        if (inventoryList.get(7).getImage() != null) {
            invBox8.setVisible(true);
            invBox8.setDisable(false);
        }
    }

    public void selectItem9() {
        if (inventoryList.get(8).getImage() != null) {
            invBox9.setVisible(true);
            invBox9.setDisable(false);
        }
    }

    /* close vbox */
    public void closeItem1() {
        invBox1.setVisible(false);
    }

    public void closeItem2() {
        invBox2.setVisible(false);
    }

    public void closeItem3() {
        invBox3.setVisible(false);
    }

    public void closeItem4() {
        invBox4.setVisible(false);
    }

    public void closeItem5() {
        invBox5.setVisible(false);
    }

    public void closeItem6() {
        invBox6.setVisible(false);
    }

    public void closeItem7() {
        invBox7.setVisible(false);
    }

    public void closeItem8() {
        invBox8.setVisible(false);
    }

    public void closeItem9() {
        invBox9.setVisible(false);
    }

    /* delete item vbox */
    public void deleteItem1() {
        if (backpack.getBackpackContentList().size() == 1) {
            backpack.getBackpackContentList().remove(0);
            inventoryList.get(0).setImage(null);
        } else {
            backpack.getBackpackContentList().remove(0);
            for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
                System.out.println("Backpack size = " + backpack.getBackpackContentList().size());
                System.out.println(backpack.getBackpackContentList().get(i).getIdNo());
                if (inventoryList.get(i + 1).getImage() == null) {
                    inventoryList.get(i).setImage(null);
                } else {
                    inventoryList.get(i).setImage(new Image(backpack.getBackpackContentList().get(i).getImage()));
                    inventoryList.get(i + 1).setImage(null);
                }

            }
        }
        closeItem1();
    }

    public void deleteItem2() {
        backpack.getBackpackContentList().remove(1);
        for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
            if (inventoryList.get(i + 1).getImage() == null) {
                inventoryList.get(i).setImage(null);
            } else {
                inventoryList.get(i).setImage(new Image(backpack.getBackpackContentList().get(i).getImage()));
                inventoryList.get(i + 1).setImage(null);
            }

        }
        closeItem2();
    }

    public void deleteItem3() {
        backpack.getBackpackContentList().remove(2);
        for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
            if (inventoryList.get(i + 1).getImage() == null) {
                inventoryList.get(i).setImage(null);
            } else {
                inventoryList.get(i).setImage(new Image(backpack.getBackpackContentList().get(i).getImage()));
                inventoryList.get(i + 1).setImage(null);
            }

        }
        closeItem3();
    }

    public void deleteItem4() {
        backpack.getBackpackContentList().remove(3);
        for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
            if (inventoryList.get(i + 1).getImage() == null) {
                inventoryList.get(i).setImage(null);
            } else {
                inventoryList.get(i).setImage(new Image(backpack.getBackpackContentList().get(i).getImage()));
                inventoryList.get(i + 1).setImage(null);
            }

        }
        closeItem4();
    }

    public void deleteItem5() {
        backpack.getBackpackContentList().remove(4);
        for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
            if (inventoryList.get(i + 1).getImage() == null) {
                inventoryList.get(i).setImage(null);
            } else {
                inventoryList.get(i).setImage(new Image(backpack.getBackpackContentList().get(i).getImage()));
                inventoryList.get(i + 1).setImage(null);
            }

        }
        closeItem5();
    }

    public void deleteItem6() {
        backpack.getBackpackContentList().remove(5);
        for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
            if (inventoryList.get(i + 1).getImage() == null) {
                inventoryList.get(i).setImage(null);
            } else {
                inventoryList.get(i).setImage(new Image(backpack.getBackpackContentList().get(i).getImage()));
                inventoryList.get(i + 1).setImage(null);
            }

        }
        closeItem6();
    }

    public void deleteItem7() {
        backpack.getBackpackContentList().remove(6);
        for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
            if (inventoryList.get(i + 1).getImage() == null) {
                inventoryList.get(i).setImage(null);
            } else {
                inventoryList.get(i).setImage(new Image(backpack.getBackpackContentList().get(i).getImage()));
                inventoryList.get(i + 1).setImage(null);
            }

        }
        closeItem7();
    }

    public void deleteItem8() {
        backpack.getBackpackContentList().remove(7);
        for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
            if (inventoryList.get(i + 1).getImage() == null) {
                inventoryList.get(i).setImage(null);
            } else {
                inventoryList.get(i).setImage(new Image(backpack.getBackpackContentList().get(i).getImage()));
                inventoryList.get(i + 1).setImage(null);
            }

        }
        closeItem8();
    }

    public void deleteItem9() {
        backpack.getBackpackContentList().remove(8);
        inventoryList.get(8).setImage(null);
        // // for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
        // // inventoryList.get(i).setImage(new
        // Image(backpack.getBackpackContentList().get(i).getImage()));
        // // inventoryList.get(i + 1).setImage(null);
        // // }

        // }
        closeItem9();
    }
    /* equip item vbox */

    public void equipItem1() {
        if (backpack.getBackpackContentList().get(0) instanceof Armor) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor(backpack.getBackpackContentList().get(0));
                    deleteItem1();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor(backpack.getBackpackContentList().get(0));
                deleteItem1();
                equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(0) instanceof Weapon) {
            if (selectedHero.getHashmap().get(Anchor.LEFT) == null) {
                selectedHero.equipLeftWeapon(backpack.getBackpackContentList().get(0));
                deleteItem1();
                equipmentLeft.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEFT).getImage()));
            } else if (selectedHero.getHashmap().get(Anchor.RIGHT) == null) {
                selectedHero.equipRightWeapon(backpack.getBackpackContentList().get(0));
                deleteItem1();
                equipmentRight.setImage(new Image(selectedHero.getHashmap().get(Anchor.RIGHT).getImage()));

            }
        }
    }

    public void equipItem2() {
        if (backpack.getBackpackContentList().get(1) instanceof Armor) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor(backpack.getBackpackContentList().get(1));
                    deleteItem2();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor(backpack.getBackpackContentList().get(1));
                deleteItem2();
                equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(1) instanceof Weapon) {
            if (selectedHero.getHashmap().get(Anchor.LEFT) == null) {
                selectedHero.equipLeftWeapon(backpack.getBackpackContentList().get(1));
                deleteItem2();
                equipmentLeft.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEFT).getImage()));
            } else if (selectedHero.getHashmap().get(Anchor.RIGHT) == null) {
                selectedHero.equipRightWeapon(backpack.getBackpackContentList().get(1));
                deleteItem2();
                equipmentRight.setImage(new Image(selectedHero.getHashmap().get(Anchor.RIGHT).getImage()));

            }
        }
    }

    public void equipItem3() {
        if (backpack.getBackpackContentList().get(2) instanceof Armor) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor(backpack.getBackpackContentList().get(2));
                    deleteItem3();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor(backpack.getBackpackContentList().get(2));
                deleteItem3();
                equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(2) instanceof Weapon) {
            if (selectedHero.getHashmap().get(Anchor.LEFT) == null) {
                selectedHero.equipLeftWeapon(backpack.getBackpackContentList().get(2));
                deleteItem3();
                equipmentLeft.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEFT).getImage()));
            } else if (selectedHero.getHashmap().get(Anchor.RIGHT) == null) {
                selectedHero.equipRightWeapon(backpack.getBackpackContentList().get(2));
                deleteItem3();
                equipmentRight.setImage(new Image(selectedHero.getHashmap().get(Anchor.RIGHT).getImage()));

            }
        }
    }

    public void equipItem4() {
        if (backpack.getBackpackContentList().get(3) instanceof Armor) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor(backpack.getBackpackContentList().get(3));
                    deleteItem4();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor(backpack.getBackpackContentList().get(3));
                deleteItem4();
                equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(3) instanceof Weapon) {
            if (selectedHero.getHashmap().get(Anchor.LEFT) == null) {
                selectedHero.equipLeftWeapon(backpack.getBackpackContentList().get(3));
                deleteItem4();
                equipmentLeft.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEFT).getImage()));
            } else if (selectedHero.getHashmap().get(Anchor.RIGHT) == null) {
                selectedHero.equipRightWeapon(backpack.getBackpackContentList().get(3));
                deleteItem4();
                equipmentRight.setImage(new Image(selectedHero.getHashmap().get(Anchor.RIGHT).getImage()));

            }
        }
    }

    public void equipItem5() {
        if (backpack.getBackpackContentList().get(4) instanceof Armor) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor(backpack.getBackpackContentList().get(4));
                    deleteItem5();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor(backpack.getBackpackContentList().get(4));
                deleteItem5();
                equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(4) instanceof Weapon) {
            if (selectedHero.getHashmap().get(Anchor.LEFT) == null) {
                selectedHero.equipLeftWeapon(backpack.getBackpackContentList().get(4));
                deleteItem5();
                equipmentLeft.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEFT).getImage()));
            } else if (selectedHero.getHashmap().get(Anchor.RIGHT) == null) {
                selectedHero.equipRightWeapon(backpack.getBackpackContentList().get(4));
                deleteItem5();
                equipmentRight.setImage(new Image(selectedHero.getHashmap().get(Anchor.RIGHT).getImage()));

            }
        }
    }

    public void equipItem6() {
        if (backpack.getBackpackContentList().get(5) instanceof Armor) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor(backpack.getBackpackContentList().get(5));
                    deleteItem6();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor(backpack.getBackpackContentList().get(5));
                deleteItem6();
                equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(5) instanceof Weapon) {
            if (selectedHero.getHashmap().get(Anchor.LEFT) == null) {
                selectedHero.equipLeftWeapon(backpack.getBackpackContentList().get(5));
                deleteItem6();
                equipmentLeft.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEFT).getImage()));
            } else if (selectedHero.getHashmap().get(Anchor.RIGHT) == null) {
                selectedHero.equipRightWeapon(backpack.getBackpackContentList().get(5));
                deleteItem6();
                equipmentRight.setImage(new Image(selectedHero.getHashmap().get(Anchor.RIGHT).getImage()));

            }
        }
    }

    public void equipItem7() {
        if (backpack.getBackpackContentList().get(6) instanceof Armor) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor(backpack.getBackpackContentList().get(6));
                    deleteItem7();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor(backpack.getBackpackContentList().get(6));
                deleteItem7();
                equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(6) instanceof Weapon) {
            if (selectedHero.getHashmap().get(Anchor.LEFT) == null) {
                selectedHero.equipLeftWeapon(backpack.getBackpackContentList().get(6));
                deleteItem7();
                equipmentLeft.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEFT).getImage()));
            } else if (selectedHero.getHashmap().get(Anchor.RIGHT) == null) {
                selectedHero.equipRightWeapon(backpack.getBackpackContentList().get(6));
                deleteItem7();
                equipmentRight.setImage(new Image(selectedHero.getHashmap().get(Anchor.RIGHT).getImage()));

            }
        }
    }

    public void equipItem8() {
        if (backpack.getBackpackContentList().get(7) instanceof Armor) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor(backpack.getBackpackContentList().get(7));
                    deleteItem8();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor(backpack.getBackpackContentList().get(7));
                deleteItem8();
                equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(7) instanceof Weapon) {
            if (selectedHero.getHashmap().get(Anchor.LEFT) == null) {
                selectedHero.equipLeftWeapon(backpack.getBackpackContentList().get(7));
                deleteItem8();
                equipmentLeft.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEFT).getImage()));
            } else if (selectedHero.getHashmap().get(Anchor.RIGHT) == null) {
                selectedHero.equipRightWeapon(backpack.getBackpackContentList().get(7));
                deleteItem8();
                equipmentRight.setImage(new Image(selectedHero.getHashmap().get(Anchor.RIGHT).getImage()));

            }
        }
    }

    public void equipItem9() {
        if (backpack.getBackpackContentList().get(8) instanceof Armor) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor(backpack.getBackpackContentList().get(8));
                    deleteItem9();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor(backpack.getBackpackContentList().get(8));
                deleteItem9();
                equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(8) instanceof Weapon) {
            if (selectedHero.getHashmap().get(Anchor.LEFT) == null) {
                selectedHero.equipLeftWeapon(backpack.getBackpackContentList().get(8));
                deleteItem9();
                equipmentLeft.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEFT).getImage()));
            } else if (selectedHero.getHashmap().get(Anchor.RIGHT) == null) {
                selectedHero.equipRightWeapon(backpack.getBackpackContentList().get(8));
                deleteItem9();
                equipmentRight.setImage(new Image(selectedHero.getHashmap().get(Anchor.RIGHT).getImage()));

            }
        }
    }

    public void unequipWeaponLeft() {
        backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.LEFT));
        selectedHero.unequipWeapon1();
        equipmentLeft.setImage(null);
        strText.setText(String.valueOf((int) (this.selectedHero.getStrength() + this.selectedHero.bonusStrength())));
        inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                        .getImage()));

    }

    public void unequipWeaponRight() {
        backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.RIGHT));
        selectedHero.unequipWeapon2();
        equipmentRight.setImage(null);
        strText.setText(String.valueOf((int) (this.selectedHero.getStrength() + this.selectedHero.bonusStrength())));
        inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                        .getImage()));
    }

    public void unequipBody() {
        backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
        selectedHero.unequipArmor();
        equipmentBody.setImage(null);
        armorText.setText(String.valueOf(selectedHero.getProtection()));
        inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                        .getImage()));
    }

    public void revive() {

        if (revives > 0) {
            revives--;
            selectedHero.seteHitPoints(selectedHero.getHitpoints());
            miniHp.setText(selectedHero.geteHitPoints() + "/" + selectedHero.getHitpoints());
            deathScreen.setVisible(false);
            levelScreen.setVisible(true);
            potionSlot.setVisible(true);
            potionCount.setVisible(true);
            System.out.println(selectedHero.getName() + " has been revived!\n");
        }

    }

    public void usePotion() {

        if (selectedHero.geteHitPoints() != selectedHero.getHitpoints() && potions > 0) {
            potions--;
            selectedHero.seteHitPoints(selectedHero.geteHitPoints() + (int) (selectedHero.getHitpoints() * 0.25D));
            if (selectedHero.geteHitPoints() > selectedHero.getHitpoints()) {
                selectedHero.seteHitPoints(selectedHero.getHitpoints());
                miniHp.setText(selectedHero.geteHitPoints() + "/" + selectedHero.getHitpoints());
            }
            healthHero.setText(String.valueOf(selectedHero.geteHitPoints()));
            hpHero.setText(String.valueOf(selectedHero.geteHitPoints()));
            potionCount.setText(String.valueOf(potions));
            miniHp.setText(selectedHero.geteHitPoints() + "/" + selectedHero.getHitpoints());
        }
    }

    public void expandCharacterMenu() {
        miniScreen.setVisible(false);
        characterMenu.setVisible(true);
        inventory.setVisible(false);
        characterImage.setImage(new Image(selectedHero.getImage()));
        nameText.setText(selectedHero.getName());
        hpText.setText(selectedHero.geteHitPoints() + "/" + selectedHero.getHitpoints());
        strText.setText(String.valueOf((int) (this.selectedHero.getStrength() + this.selectedHero.bonusStrength())));
        armorText.setText(String.valueOf(selectedHero.getProtection()));
    }

    public void closeCharacterMenu() {
        miniScreen.setVisible(true);
        characterMenu.setVisible(false);
    }

    public void hoverAb() {

    }

    public void inspectItem() {
        int teller = 0;
        for (int i = 0; i < inventoryList.size(); i++) {
            teller = i;
            if (this.inventoryList.get(teller).isHover() == true && inventoryList.get(teller).getImage() != null) {
                inspect.setVisible(true);
                inspectItemTeller(teller);
            }
        }
    }

    public void inspectItemTeller(int teller) {

        if (backpack.getBackpackContentList().get(teller) instanceof Weapon) {
            inspectStatType.setText("Damage");
            this.inspectStat.setText(
                    String.valueOf((((Weapon) backpack.getBackpackContentList().get(teller)).getDamage())));
        } else {
            inspectStatType.setText("Armor");
            this.inspectStat.setText(
                    String.valueOf((((Armor) backpack.getBackpackContentList().get(teller)).getActualArmor())));
        }
        this.inspectImg.setImage(new Image(
                (backpack.getBackpackContentList().get(teller))
                        .getImage()));
    }

    public void inspectLoot() {
        int teller = 0;
        for (int i = 0; i < loot.size(); i++) {
            teller = i;
            if (this.loot.get(teller).isHover() == true && loot.get(teller).getImage() != null) {
                inspect.setVisible(true);
                inspectLootTeller(teller);
            }
        }
    }

    public void inspectLootTeller(int teller) {

        if (lootList.get(teller) instanceof Weapon) {
            inspectStatType.setText("Damage");
            this.inspectStat.setText(
                    String.valueOf((((Weapon) lootList.get(teller)).getDamage())));
        } else {
            inspectStatType.setText("Armor");
            this.inspectStat.setText(
                    String.valueOf((((Armor) lootList.get(teller)).getActualArmor())));
        }
        this.inspectImg.setImage(new Image(
                (lootList.get(teller))
                        .getImage()));
    }

    public void exitInspect() {
        this.inspect.setVisible(false);
    }

    /* backpack */
    public void openInventory() {
        // for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
        // ImageView temp = this.getInventoryList().get(i);
        // temp.setImage(new
        // Image(backpack.getBackpackContentList().get(i).getImage()));
        // }
        inventory.setVisible(true);
        closeCharacterMenu();
        backpackImage.setVisible(false);
        backpackImageClosed.setVisible(true);
        // characterMenu.setVisible(false);
    }

    public void closeInventory() {
        inventory.setVisible(false);
        backpackImageClosed.setVisible(false);
        backpackImage.setVisible(true);
    }

    /* Player name */
    public boolean isValidPlayerName(String playerName) {
        return playerName.matches("[A-Z]{1}[A-Za-z\\s]*[']?[A-Za-z\\s]*[']?[A-Za-z\\s]*");
    }

    public void setPlayerName(String playerName) {
        if (this.isValidPlayerName(playerName) == false) {
            this.playerName = null;
            errorplayername.setText("Please start with a capital letter!");
        } else {
            this.playerName = playerName;
            errorplayername.setVisible(false);
            playernamelabel.setText(this.playerName);
        }
    }

    public Hero getSelectedHero() {
        return selectedHero;
    }

    public void setSelectedHero(Hero SelectedHero) {
        selectedHero = SelectedHero;
    }

    public Monster getTargetMonster() {
        return targetMonster;
    }

    public void setTargetMonster(Monster TargetMonster) {
        targetMonster = TargetMonster;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public List<ImageView> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<ImageView> InventoryList) {
        inventoryList = InventoryList;
    }
}
