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
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
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
import javafx.scene.text.TextFlow;
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
    public Text gearType;
    public Text cooldownText;
    public Text monsterFightName;
    public Text heroFightName;
    public Text hoverAbilityText;

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
    public ImageView equipmentGloves;
    public ImageView equipmentBoots;
    public ImageView equipmentLeggings;
    public ImageView equipmentHelmet;
    public ImageView inspectImg;
    public ImageView slashEffectOnMonster;
    public ImageView slashEffectOnHero;
    public ImageView burnEffect;
    public ImageView healEffect;
    public ImageView bulwarkEffect;

    public Button startButton;
    public Button butChar1;
    public Button butChar2;
    public Button butChar3;
    public Button butBack;
    public Button butNext;
    public Button butEasy1;
    public Button butEasy2;
    public Button butEasy3;
    public Button butMed1;
    public Button butMed2;
    public Button butMed3;
    public Button butHard1;
    public Button butHard2;
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
    public Button butCombatLog;
    public Button burnAbility;
    public Button blockAbility;
    public Button healAbility;
    public Button butExit;
    public Button autoAttack;

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
    public Pane hoverAbility;

    public Label errorplayername;
    public Label playernamelabel;

    private Armor helmet;
    private Armor carapace;
    private Armor leggings;
    private Gloves gloves;
    private Boots boots;
    private Armor upgradedhelmet;
    private Armor upgradedcarapace;
    private Armor upgradedleggings;
    private Gloves upgradedgloves;
    private Boots upgradedboots;
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

    Timeline timeline = new Timeline();

    public int level;
    private int revives = 2;
    private int potions = 1;
    private int scoreCounter = 0;
    private int nrOfLines;
    private int abilityCooldown = 0;
    private int bulwarkDuration;
    private int burnDuration;
    private int percent;
    private int tickDamage;
    private int increasedHp;

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

    public TextFlow combatlog;

    public void initialize() throws IOException {

        /* Backpack initialiseren */
        backpack = new Backpack(100, 20);

        generateItems();

        /* Monsters initialiseren */
        succubus = new Monster("Succubus", 10, 40, 30, "images/Dark_Elves/Character6_face2.png",
                "images/Dark_Elves/Character6_face3.png");
        monsterList.add(succubus);
        shaman = new Monster("Shaman", 15, 45, 30, "images/Dark_Elves/Character4_face1.png",
                "images/Dark_Elves/Character4_face3.png");
        monsterList.add(shaman);
        deathKnight = new Monster("DeathKnight", 20, 50, 30, "images/Dark_Elves/Character1_face2.png",
                "images/Dark_Elves/Character1_face3.png");
        monsterList.add(deathKnight);
        witch = new Monster("Witch", 30, 50, 35, "images/Dark_Elves/Character2_face1.png",
                "images/Dark_Elves/Character2_face3.png");
        monsterList.add(witch);
        assassin = new Monster("Assassin", 25, 30, 50, "images/Dark_Elves/Character8_face4.png",
                "images/Dark_Elves/Character8_face3.png");
        monsterList.add(assassin);
        deadPrince = new Monster("DeadPrince", 35, 60, 20, "images/Dark_Elves/Character3_face1.png",
                "images/Dark_Elves/Character3_face3.png");
        monsterList.add(deadPrince);
        wolf = new Monster("Wolf", 40, 70, 40, "images/Dark_Elves/Character5_face2.png",
                "images/Dark_Elves/Character5_face3.png");
        monsterList.add(wolf);
        armorKnight = new Monster("ArmorKnight", 50, 70, 35, "images/Dark_Elves/Character7_face4.png",
                "images/Dark_Elves/Character7_face3.png");
        monsterList.add(armorKnight);

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
        butEasy2.setStyle("-fx-background-color: #A9A9A9");
        butEasy2.setDisable(true);
        butEasy3.setStyle("-fx-background-color: #A9A9A9");
        butEasy3.setDisable(true);
        butMed1.setStyle("-fx-background-color: #A9A9A9");
        butMed1.setDisable(true);
        butMed2.setStyle("-fx-background-color: #A9A9A9");
        butMed2.setDisable(true);
        butMed3.setStyle("-fx-background-color: #A9A9A9");
        butMed3.setDisable(true);
        butHard1.setStyle("-fx-background-color: #A9A9A9");
        butHard1.setDisable(true);
        butHard2.setStyle("-fx-background-color: #A9A9A9");
        butHard2.setDisable(true);
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
        Hero hero1 = new Hero("Zoe", 40, 100, "images/Heroes/PNG/Warriors/Character3_face2.png",
                "images/Heroes/PNG/Warriors_faces_transperent/Character3_face2.png",
                "images/Heroes/PNG/Warriors/Character3_face3.png");
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
        Hero hero2 = new Hero("Bob", 20, 120, "images/Heroes/PNG/Warriors/Character6_face4.png",
                "images/Heroes/PNG/Warriors_faces_transperent/Character6_face4.png",
                "images/Heroes/PNG/Warriors/Character6_face3.png");
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
        Hero hero3 = new Hero("Gandalf", 50, 80, "images/Heroes/PNG/Warriors/Character2_face1.png",
                "images/Heroes/PNG/Warriors_faces_transperent/Character2_face1.png",
                "images/Heroes/PNG/Warriors/Character2_face3.png");
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

    public void toLevelScreen() {
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
        characterMenu.setVisible(false);
        potionCount.setText(String.valueOf(potions));
        scoreTeller.setText(String.valueOf(scoreCounter));
    }

    public void generateItems() {
        /* Armor initialiseren */
        helmet = new Helmet(2, "images/Armor/PNG/helmet.png");
        lootTable.add(helmet);
        carapace = new Body(7, "images/Armor/PNG/carapace.png");
        lootTable.add(carapace);
        leggings = new Leggings(5, "images/Armor/PNG/leggings.png");
        lootTable.add(leggings);
        gloves = new Gloves(2, "images/Armor/PNG/gloves.png");
        lootTable.add(gloves);
        boots = new Boots(2, "images/Armor/PNG/boots.png");
        lootTable.add(boots);
        upgradedhelmet = new Helmet(2, "images/Armor/PNG/upgradedhelmet.png");
        lootTable.add(upgradedhelmet);
        upgradedcarapace = new Body(8, "images/Armor/PNG/upgradedcarapace.png");
        lootTable.add(upgradedcarapace);
        upgradedleggings = new Leggings(5, "images/Armor/PNG/upgradedleggings.png");
        lootTable.add(upgradedleggings);
        upgradedgloves = new Gloves(2, "images/Armor/PNG/upgradedgloves.png");
        lootTable.add(upgradedgloves);
        upgradedboots = new Boots(2, "images/Armor/PNG/upgradedboots.png");
        lootTable.add(upgradedboots);
        darkcloak = new Body(3, "images/Armor/PNG/darkcloak.png");
        lootTable.add(darkcloak);
        druidrobe = new Body(4, "images/Armor/PNG/druidrobe.png");
        lootTable.add(druidrobe);
        firerobe = new Body(4, "images/Armor/PNG/firerobe.png");
        lootTable.add(firerobe);
        necrorobe = new Body(5, "images/Armor/PNG/necrorobe.png");
        lootTable.add(necrorobe);
        shamanrobe = new Body(6, "images/Armor/PNG/shamanrobe.png");
        lootTable.add(shamanrobe);

        /* Weapons initialiseren */
        // staffs
        staffFire = new Weapon(5, "images/Weapons/Staffs/2.png");
        lootTable.add(staffFire);
        staffSkull = new Weapon(8, "images/Weapons/Staffs/6.png");
        lootTable.add(staffSkull);
        staffNature = new Weapon(3, "images/Weapons/Staffs/4.png");
        lootTable.add(staffNature);
        staffVoid = new Weapon(10, "images/Weapons/Staffs/8.png");
        lootTable.add(staffVoid);
        staffBroom = new Weapon(3, "images/Weapons/Staffs/10.png");
        lootTable.add(staffBroom);
        // swords
        sword = new Weapon(2, "images/Weapons/Swords/1.png");
        lootTable.add(sword);
        sword2 = new Weapon(5, "images/Weapons/Swords/2.png");
        lootTable.add(sword2);
        sword3 = new Weapon(5, "images/Weapons/Swords/4.png");
        lootTable.add(sword3);
        // daggers
        daggerSkull = new Weapon(2, "images/Weapons/Daggers/3.png");
        lootTable.add(daggerSkull);
        daggerNature = new Weapon(3, "images/Weapons/Daggers/7.png");
        lootTable.add(daggerNature);
        daggerVoid = new Weapon(5, "images/Weapons/Daggers/8.png");
        lootTable.add(daggerVoid);
        daggerFire = new Weapon(2, "images/Weapons/Daggers/9.png");
        lootTable.add(daggerFire);
        daggerFireOffhand = new Weapon(2, "images/Weapons/Daggers/10.png");
        lootTable.add(daggerFireOffhand);
    }

    public void next() {
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
        characterMenu.setVisible(false);
        abilityCooldown = 0;
        cooldownText.setVisible(false);
        cooldownText.setDisable(true);
        if (this.selectedHero.getName().equals("Zoe")) {
            burnAbility.setDisable(false);
        } else if (this.selectedHero.getName().equals("Bob")) {
            blockAbility.setDisable(false);
        } else {
            healAbility.setDisable(false);
        }
        potionCount.setText(String.valueOf(potions));
        scoreTeller.setText(String.valueOf(scoreCounter));
        // levelChecker();
        combatlog.getChildren().clear();
        nrOfLines = 0;
        if (monsterList.get(0).getDefeated()) {
            butEasy2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy2.setDisable(false);
            butEasy3.setStyle("-fx-background-color: #A9A9A9");
            butEasy3.setDisable(true);
            butMed1.setStyle("-fx-background-color: #A9A9A9");
            butMed1.setDisable(true);
            butMed2.setStyle("-fx-background-color: #A9A9A9");
            butMed2.setDisable(true);
            butMed3.setStyle("-fx-background-color: #A9A9A9");
            butMed3.setDisable(true);
            butHard1.setStyle("-fx-background-color: #A9A9A9");
            butHard1.setDisable(true);
            butHard2.setStyle("-fx-background-color: #A9A9A9");
            butHard2.setDisable(true);
        }

        if (monsterList.get(1).getDefeated()) {
            butEasy2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy2.setDisable(false);
            butEasy3.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy3.setDisable(false);
            butMed1.setStyle("-fx-background-color: #A9A9A9");
            butMed1.setDisable(true);
            butMed2.setStyle("-fx-background-color: #A9A9A9");
            butMed2.setDisable(true);
            butMed3.setStyle("-fx-background-color: #A9A9A9");
            butMed3.setDisable(true);
            butHard1.setStyle("-fx-background-color: #A9A9A9");
            butHard1.setDisable(true);
            butHard2.setStyle("-fx-background-color: #A9A9A9");
            butHard2.setDisable(true);
        }
        if (monsterList.get(2).getDefeated()) {
            butEasy2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy2.setDisable(false);
            butEasy3.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy3.setDisable(false);
            butMed1.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed1.setDisable(false);
            butMed2.setStyle("-fx-background-color: #A9A9A9");
            butMed2.setDisable(true);
            butMed3.setStyle("-fx-background-color: #A9A9A9");
            butMed3.setDisable(true);
            butHard1.setStyle("-fx-background-color: #A9A9A9");
            butHard1.setDisable(true);
            butHard2.setStyle("-fx-background-color: #A9A9A9");
            butHard2.setDisable(true);
        }
        if (monsterList.get(3).getDefeated()) {
            butEasy2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy2.setDisable(false);
            butEasy3.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy3.setDisable(false);
            butMed1.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed1.setDisable(false);
            butMed2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed2.setDisable(false);
            butMed3.setStyle("-fx-background-color: #A9A9A9");
            butMed3.setDisable(true);
            butHard1.setStyle("-fx-background-color: #A9A9A9");
            butHard1.setDisable(true);
            butHard2.setStyle("-fx-background-color: #A9A9A9");
            butHard2.setDisable(true);
        }
        if (monsterList.get(4).getDefeated()) {
            butEasy2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy2.setDisable(false);
            butEasy3.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy3.setDisable(false);
            butMed1.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed1.setDisable(false);
            butMed2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed2.setDisable(false);
            butMed3.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed3.setDisable(false);
            butHard1.setStyle("-fx-background-color: #A9A9A9");
            butHard1.setDisable(true);
            butHard2.setStyle("-fx-background-color: #A9A9A9");
            butHard2.setDisable(true);
        }
        if (monsterList.get(5).getDefeated()) {
            butEasy2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy2.setDisable(false);
            butEasy3.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy3.setDisable(false);
            butMed1.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed1.setDisable(false);
            butMed2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed2.setDisable(false);
            butMed3.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed3.setDisable(false);
            butHard1.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butHard1.setDisable(false);
            butHard2.setStyle("-fx-background-color: #A9A9A9");
            butHard2.setDisable(true);
        }
        if (monsterList.get(6).getDefeated()) {
            butEasy2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy2.setDisable(false);
            butEasy3.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butEasy3.setDisable(false);
            butMed1.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed1.setDisable(false);
            butMed2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed2.setDisable(false);
            butMed3.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butMed3.setDisable(false);
            butHard1.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butHard1.setDisable(false);
            butHard2.setStyle(
                    "-fx-background-color: #000000,linear-gradient(#000000, #000000),linear-gradient(#000000, #000000),linear-gradient(#580404, #140404);");
            butHard2.setDisable(false);
        }
    }

    int tellerCombatLog = 0;

    public void combatLog() {
        if (tellerCombatLog % 2 == 0) {
            combatlog.setVisible(false);
        } else {
            combatlog.setVisible(true);
        }
        tellerCombatLog++;
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
        monsterFightName.setText(this.targetMonster.getName());
        heroFightName.setText(this.selectedHero.getName());
        healthHero.setText(
                String.valueOf(selectedHero.geteHitPoints() + "/" + String.valueOf(this.selectedHero.getHitpoints())));
        healthMonster.setText(String.valueOf(
                this.getTargetMonster().getHitpoints() + "/" + String.valueOf(this.targetMonster.getHitpoints())));
        if (this.selectedHero.getName().equals("Zoe")) {
            burnAbility.setVisible(true);
            healAbility.setDisable(true);
            blockAbility.setDisable(true);
        } else if (this.selectedHero.getName().equals("Bob")) {
            blockAbility.setVisible(true);
            healAbility.setDisable(true);
            burnAbility.setDisable(true);
        } else {
            healAbility.setVisible(true);
            burnAbility.setDisable(true);
            blockAbility.setDisable(true);
        }
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
        monsterFightName.setText(this.targetMonster.getName());
        heroFightName.setText(this.selectedHero.getName());
        healthHero.setText(
                String.valueOf(selectedHero.geteHitPoints() + "/" + String.valueOf(this.selectedHero.getHitpoints())));
        healthMonster.setText(String.valueOf(
                this.getTargetMonster().getHitpoints() + "/" + String.valueOf(this.targetMonster.getHitpoints())));
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
        monsterFightName.setText(this.targetMonster.getName());
        heroFightName.setText(this.selectedHero.getName());
        healthHero.setText(
                String.valueOf(selectedHero.geteHitPoints() + "/" + String.valueOf(this.selectedHero.getHitpoints())));
        healthMonster.setText(String.valueOf(
                this.getTargetMonster().getHitpoints() + "/" + String.valueOf(this.targetMonster.getHitpoints())));
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
        monsterFightName.setText(this.targetMonster.getName());
        heroFightName.setText(this.selectedHero.getName());
        healthHero.setText(
                String.valueOf(selectedHero.geteHitPoints() + "/" + String.valueOf(this.selectedHero.getHitpoints())));
        healthMonster.setText(String.valueOf(
                this.getTargetMonster().getHitpoints() + "/" + String.valueOf(this.targetMonster.getHitpoints())));
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
        monsterFightName.setText(this.targetMonster.getName());
        heroFightName.setText(this.selectedHero.getName());
        healthHero.setText(
                String.valueOf(selectedHero.geteHitPoints() + "/" + String.valueOf(this.selectedHero.getHitpoints())));
        healthMonster.setText(String.valueOf(
                this.getTargetMonster().getHitpoints() + "/" + String.valueOf(this.targetMonster.getHitpoints())));
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
        monsterFightName.setText(this.targetMonster.getName());
        heroFightName.setText(this.selectedHero.getName());
        healthHero.setText(
                String.valueOf(selectedHero.geteHitPoints() + "/" + String.valueOf(this.selectedHero.getHitpoints())));
        healthMonster.setText(String.valueOf(
                this.getTargetMonster().getHitpoints() + "/" + String.valueOf(this.targetMonster.getHitpoints())));
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
        monsterFightName.setText(this.targetMonster.getName());
        heroFightName.setText(this.selectedHero.getName());
        healthHero.setText(
                String.valueOf(selectedHero.geteHitPoints() + "/" + String.valueOf(this.selectedHero.getHitpoints())));
        healthMonster.setText(String.valueOf(
                this.getTargetMonster().getHitpoints() + "/" + String.valueOf(this.targetMonster.getHitpoints())));
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
        monsterFightName.setText(this.targetMonster.getName());
        heroFightName.setText(this.selectedHero.getName());
        healthHero.setText(
                String.valueOf(selectedHero.geteHitPoints() + "/" + String.valueOf(this.selectedHero.getHitpoints())));
        healthMonster.setText(String.valueOf(
                this.getTargetMonster().getHitpoints() + "/" + String.valueOf(this.targetMonster.getHitpoints())));
        for (int i = 0; i < lootList.size(); i++) {
            loot.get(i).setImage(null);
        }
        lootList.clear();
    }

    TranslateTransition translate = new TranslateTransition();

    public void attackEffectOnMonster() {
        slashEffectOnMonster.setVisible(true);
        translate.setNode(slashEffectOnMonster);
        translate.setDuration(Duration.millis(300));
        translate.setCycleCount(1);
        heroEasy.setImage(new Image(this.selectedHero.getAngryImage()));
        translate.play();
        Text heroHit = new Text(this.selectedHero.getName() + " hit " + this.targetMonster.getName() + " for "
                + this.selectedHero.getDamage() + " hitpoints!\n");
        combatlog.getChildren().add(heroHit);
        nrOfLines++;
        translate.setOnFinished((e) -> {
            slashEffectOnMonster.setVisible(false);
            attackEffectOnHero();
            heroEasy.setImage(new Image(this.selectedHero.getImage()));
        });

    }

    public int currentHitpointsHero = 0;
    TranslateTransition translate2 = new TranslateTransition();

    public void attackEffectOnHero() {
        if (currentHitpointsHero != this.selectedHero.geteHitPoints()) {
            slashEffectOnHero.setVisible(true);
            translate2.setNode(slashEffectOnHero);
            translate2.setDuration(Duration.millis(300));
            translate2.setCycleCount(1);
            monsterEasy.setImage(new Image(this.targetMonster.getAngryImage()));
            translate2.play();
            Text monsterHit = new Text(this.targetMonster.getName() + " hit " + this.selectedHero.getName() + " for "
                    + this.targetMonster.getDamage() + " hitpoints!\n");
            combatlog.getChildren().add(monsterHit);
            nrOfLines++;
            healthHero.setText(
                    String.valueOf(this.selectedHero.geteHitPoints() + "/" + this.selectedHero.getHitpoints()));
            translate2.setOnFinished((e) -> {
                slashEffectOnHero.setVisible(false);
                monsterEasy.setImage(new Image(this.targetMonster.getImage()));
            });
        } else {
            Text monsterMiss = new Text(this.targetMonster.getName() + " missed!\n");
            combatlog.getChildren().add(monsterMiss);
            nrOfLines++;
        }
    }

    /* ATTACK */
    public void autoAttack() {
        if (nrOfLines >= 12) {
            combatlog.getChildren().clear();
            nrOfLines = 0;
        }
        int currentHitpointsMonster = this.targetMonster.geteHitPoints();
        this.selectedHero.Hit(this.getTargetMonster());
        if (abilityCooldown != 0) {
            abilityCooldown--;
            cooldownText.setText(String.valueOf(abilityCooldown));
        }
        if (abilityCooldown == 0) {
            cooldownText.setVisible(false);
            cooldownText.setDisable(true);
            blockAbility.setDisable(false);
        }
        healthMonster
                .setText(String.valueOf(this.targetMonster.geteHitPoints() + "/" + this.targetMonster.getHitpoints()));
        if (this.targetMonster.geteHitPoints() > 0) {
            currentHitpointsHero = this.selectedHero.geteHitPoints();
            this.targetMonster.Hit(this.selectedHero);
            bulwarkDuration--;
            if (bulwarkDuration == 0) {
                this.selectedHero.setProtection(this.selectedHero.getProtection() - percent);
            }
            if (burnDuration != 0) {
                this.targetMonster.seteHitPoints(this.targetMonster.geteHitPoints() - tickDamage);
                Text burnTick = new Text(
                        this.selectedHero.getName() + " burned " + this.targetMonster.getName() + " for "
                                + tickDamage + " hitpoints!\n");
                combatlog.getChildren().add(burnTick);
                nrOfLines++;
                burnDuration--;
            }
            /* Hero hit monster */
            if (currentHitpointsMonster != this.targetMonster.geteHitPoints()) {
                attackEffectOnMonster();
            }
            /* Hero mist */
            else {
                Text heroMiss = new Text(this.selectedHero.getName() + " missed!\n");
                combatlog.getChildren().add(heroMiss);
                nrOfLines++;
                attackEffectOnHero();
            }

            miniHp.setText(selectedHero.geteHitPoints() + "/" + selectedHero.getHitpoints());
            if (this.selectedHero.geteHitPoints() <= 0) {
                System.out.println("Hero, " + this.selectedHero.getName() + " died!\n");
                healthHero.setText(String.valueOf(0));
                reviveText.setText(String.valueOf(revives));
                if (revives == 0) {
                    butRevive.setDisable(true);
                    butRevive.setVisible(false);
                    butExit.setDisable(false);
                    butExit.setVisible(true);
                }
                fightScreen.setVisible(false);
                potionSlot.setVisible(false);
                potionCount.setVisible(false);
                deathScreen.setVisible(true);
                characterMenu.setVisible(false);
            }

        } else {
            killTarget();

        }

    }

    TranslateTransition translateBurn = new TranslateTransition();

    public void burnEffect() {
        translateBurn.setNode(burnEffect);
        burnEffect.setVisible(true);
        translateBurn.setDuration(Duration.millis(1000));
        translateBurn.setCycleCount(1);
        translateBurn.play();
        translateBurn.setOnFinished((e) -> {
            burnEffect.setVisible(false);
        });
    }

    public void burn() {
        if (abilityCooldown == 0) {
            burnEffect();
            if (nrOfLines >= 12) {
                combatlog.getChildren().clear();
                nrOfLines = 0;
            }
            abilityCooldown = 4;
            burnDuration = 2;
            cooldownText.setVisible(true);
            cooldownText.setText(String.valueOf(abilityCooldown));
            tickDamage = (int) (this.targetMonster.getHitpoints() * 0.10);
            targetMonster.seteHitPoints(this.targetMonster.geteHitPoints() - tickDamage);
            Text burnText = new Text(
                    this.selectedHero.getName() + " activated Burn and burned " + this.targetMonster.getName()
                            + " for 3 rounds!\n");
            combatlog.getChildren().add(burnText);
            nrOfLines++;
            burnAbility.setDisable(true);
        } else {
            burnAbility.setDisable(true);
        }
    }

    TranslateTransition translateBulwark = new TranslateTransition();

    public void bulwarkEffect() {
        translateBulwark.setNode(bulwarkEffect);
        bulwarkEffect.setVisible(true);
        translateBulwark.setDuration(Duration.millis(1000));
        translateBulwark.setCycleCount(1);
        translateBulwark.play();
        translateBulwark.setOnFinished((e) -> {
            bulwarkEffect.setVisible(false);
        });
    }

    public void bulwark() {
        if (abilityCooldown == 0) {
            bulwarkEffect();
            if (nrOfLines >= 12) {
                combatlog.getChildren().clear();
                nrOfLines = 0;
            }
            abilityCooldown = 4;
            cooldownText.setVisible(true);
            cooldownText.setText(String.valueOf(abilityCooldown));
            bulwarkDuration = 2;
            percent = (int) (this.selectedHero.getProtection() * 0.4D);
            this.selectedHero.setProtection(this.selectedHero.getProtection() + percent);
            Text bulwarkText = new Text(
                    this.selectedHero.getName() + " activated Bulwark and gained 40% extra protection for 2 turns!\n");
            combatlog.getChildren().add(bulwarkText);
            nrOfLines++;
            blockAbility.setDisable(true);
        } else {
            blockAbility.setDisable(true);
        }
    }

    TranslateTransition translateHeal = new TranslateTransition();

    public void healEffect() {
        translateHeal.setNode(healEffect);
        healEffect.setVisible(true);
        translateHeal.setDuration(Duration.millis(1000));
        translateHeal.setCycleCount(1);
        translateHeal.play();
        translateHeal.setOnFinished((e) -> {
            healEffect.setVisible(false);
        });
    }

    public void heal() {
        if (abilityCooldown == 0) {
            healEffect();
            if (nrOfLines >= 12) {
                combatlog.getChildren().clear();
                nrOfLines = 0;
            }
            abilityCooldown = 4;
            cooldownText.setVisible(true);
            cooldownText.setText(String.valueOf(abilityCooldown));
            double percentage = 0.4;
            increasedHp = (int) (percentage
                    * (this.selectedHero.getHitpoints()));
            this.selectedHero.seteHitPoints(this.selectedHero.geteHitPoints() + increasedHp);
            if (this.selectedHero.geteHitPoints() > this.selectedHero.getHitpoints()) {
                this.selectedHero.seteHitPoints(this.selectedHero.getHitpoints());
            }
            Text healText = new Text(
                    this.selectedHero.getName() + " activated Heal and gained " + increasedHp + " hitpoints!\n");
            combatlog.getChildren().add(healText);
            nrOfLines++;
            healthHero.setText(
                    String.valueOf(this.selectedHero.geteHitPoints() + "/" + this.selectedHero.getHitpoints()));
            miniHp.setText(String.valueOf(this.selectedHero.geteHitPoints() + "/" + this.selectedHero.getHitpoints()));
            healAbility.setDisable(true);
        } else {
            healAbility.setDisable(true);
        }

    }

    public void killTarget() {
        int getal = 0;
        int teller = 0;
        if (this.targetMonster.geteHitPoints() <= 0) {
            this.targetMonster.setDefeated(true);
            generateItems();
            Text monsterKillMessage = new Text("K.O.! " + this.selectedHero.getName() + " has bested "
                    + this.targetMonster.getName() + " in combat! Leaving combat..\n");
            combatlog.getChildren().add(monsterKillMessage);
            nrOfLines++;
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
            int chanceOfPotion = (int) (Math.random() * 3);
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
        for (int i = 0; i < backpack.getBackpackContentList().size(); i++) {
            inventoryList.get(i).setImage(null);
        }
        backpack.getBackpackContentList().clear();
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
        if (backpack.getBackpackContentList().get(0) instanceof Body) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(0));
                    deleteItem1();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(0));
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
        } else if (backpack.getBackpackContentList().get(0) instanceof Boots) {
            if (selectedHero.getHashmap().get(Anchor.BOOTS) == null) {
                selectedHero.equipBoots((Boots) backpack.getBackpackContentList().get(0));
                deleteItem1();
                equipmentBoots.setImage(new Image(selectedHero.getHashmap().get(Anchor.BOOTS).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(0) instanceof Gloves) {
            if (selectedHero.getHashmap().get(Anchor.GLOVES) == null) {
                selectedHero.equipGloves((Gloves) backpack.getBackpackContentList().get(0));
                deleteItem1();
                equipmentGloves.setImage(new Image(selectedHero.getHashmap().get(Anchor.GLOVES).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(0) instanceof Helmet) {
            if (selectedHero.getHashmap().get(Anchor.HELMET) == null) {
                selectedHero.equipHelmet((Helmet) backpack.getBackpackContentList().get(0));
                deleteItem1();
                equipmentHelmet.setImage(new Image(selectedHero.getHashmap().get(Anchor.HELMET).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(0) instanceof Leggings) {
            if (selectedHero.getHashmap().get(Anchor.LEGGINGS) == null) {
                selectedHero.equipLeggings((Leggings) backpack.getBackpackContentList().get(0));
                deleteItem1();
                equipmentLeggings.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEGGINGS).getImage()));
            }
        }
    }

    public void equipItem2() {
        if (backpack.getBackpackContentList().get(1) instanceof Body) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(1));
                    deleteItem2();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(1));
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
        } else if (backpack.getBackpackContentList().get(1) instanceof Boots) {
            if (selectedHero.getHashmap().get(Anchor.BOOTS) == null) {
                selectedHero.equipBoots((Boots) backpack.getBackpackContentList().get(1));
                deleteItem2();
                equipmentBoots.setImage(new Image(selectedHero.getHashmap().get(Anchor.BOOTS).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(1) instanceof Gloves) {
            if (selectedHero.getHashmap().get(Anchor.GLOVES) == null) {
                selectedHero.equipGloves((Gloves) backpack.getBackpackContentList().get(1));
                deleteItem2();
                equipmentGloves.setImage(new Image(selectedHero.getHashmap().get(Anchor.GLOVES).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(1) instanceof Helmet) {
            if (selectedHero.getHashmap().get(Anchor.HELMET) == null) {
                selectedHero.equipHelmet((Helmet) backpack.getBackpackContentList().get(1));
                deleteItem2();
                equipmentHelmet.setImage(new Image(selectedHero.getHashmap().get(Anchor.HELMET).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(1) instanceof Leggings) {
            if (selectedHero.getHashmap().get(Anchor.LEGGINGS) == null) {
                selectedHero.equipLeggings((Leggings) backpack.getBackpackContentList().get(1));
                deleteItem2();
                equipmentLeggings.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEGGINGS).getImage()));
            }
        }
    }

    public void equipItem3() {
        if (backpack.getBackpackContentList().get(2) instanceof Body) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(2));
                    deleteItem3();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(2));
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
        } else if (backpack.getBackpackContentList().get(2) instanceof Boots) {
            if (selectedHero.getHashmap().get(Anchor.BOOTS) == null) {
                selectedHero.equipBoots((Boots) backpack.getBackpackContentList().get(2));
                deleteItem3();
                equipmentBoots.setImage(new Image(selectedHero.getHashmap().get(Anchor.BOOTS).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(2) instanceof Gloves) {
            if (selectedHero.getHashmap().get(Anchor.GLOVES) == null) {
                selectedHero.equipGloves((Gloves) backpack.getBackpackContentList().get(2));
                deleteItem3();
                equipmentGloves.setImage(new Image(selectedHero.getHashmap().get(Anchor.GLOVES).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(2) instanceof Helmet) {
            if (selectedHero.getHashmap().get(Anchor.HELMET) == null) {
                selectedHero.equipHelmet((Helmet) backpack.getBackpackContentList().get(2));
                deleteItem3();
                equipmentHelmet.setImage(new Image(selectedHero.getHashmap().get(Anchor.HELMET).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(2) instanceof Leggings) {
            if (selectedHero.getHashmap().get(Anchor.LEGGINGS) == null) {
                selectedHero.equipLeggings((Leggings) backpack.getBackpackContentList().get(2));
                deleteItem3();
                equipmentLeggings.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEGGINGS).getImage()));
            }
        }
    }

    public void equipItem4() {
        if (backpack.getBackpackContentList().get(3) instanceof Body) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(3));
                    deleteItem4();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(3));
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
        } else if (backpack.getBackpackContentList().get(3) instanceof Boots) {
            if (selectedHero.getHashmap().get(Anchor.BOOTS) == null) {
                selectedHero.equipBoots((Boots) backpack.getBackpackContentList().get(3));
                deleteItem4();
                equipmentBoots.setImage(new Image(selectedHero.getHashmap().get(Anchor.BOOTS).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(3) instanceof Gloves) {
            if (selectedHero.getHashmap().get(Anchor.GLOVES) == null) {
                selectedHero.equipGloves((Gloves) backpack.getBackpackContentList().get(3));
                deleteItem4();
                equipmentGloves.setImage(new Image(selectedHero.getHashmap().get(Anchor.GLOVES).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(3) instanceof Helmet) {
            if (selectedHero.getHashmap().get(Anchor.HELMET) == null) {
                selectedHero.equipHelmet((Helmet) backpack.getBackpackContentList().get(3));
                deleteItem4();
                equipmentHelmet.setImage(new Image(selectedHero.getHashmap().get(Anchor.HELMET).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(3) instanceof Leggings) {
            if (selectedHero.getHashmap().get(Anchor.LEGGINGS) == null) {
                selectedHero.equipLeggings((Leggings) backpack.getBackpackContentList().get(3));
                deleteItem4();
                equipmentLeggings.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEGGINGS).getImage()));
            }
        }
    }

    public void equipItem5() {
        if (backpack.getBackpackContentList().get(4) instanceof Body) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(4));
                    deleteItem5();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(4));
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
        } else if (backpack.getBackpackContentList().get(4) instanceof Boots) {
            if (selectedHero.getHashmap().get(Anchor.BOOTS) == null) {
                selectedHero.equipBoots((Boots) backpack.getBackpackContentList().get(4));
                deleteItem5();
                equipmentBoots.setImage(new Image(selectedHero.getHashmap().get(Anchor.BOOTS).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(4) instanceof Gloves) {
            if (selectedHero.getHashmap().get(Anchor.GLOVES) == null) {
                selectedHero.equipGloves((Gloves) backpack.getBackpackContentList().get(4));
                deleteItem5();
                equipmentGloves.setImage(new Image(selectedHero.getHashmap().get(Anchor.GLOVES).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(4) instanceof Helmet) {
            if (selectedHero.getHashmap().get(Anchor.HELMET) == null) {
                selectedHero.equipHelmet((Helmet) backpack.getBackpackContentList().get(4));
                deleteItem5();
                equipmentHelmet.setImage(new Image(selectedHero.getHashmap().get(Anchor.HELMET).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(4) instanceof Leggings) {
            if (selectedHero.getHashmap().get(Anchor.LEGGINGS) == null) {
                selectedHero.equipLeggings((Leggings) backpack.getBackpackContentList().get(4));
                deleteItem5();
                equipmentLeggings.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEGGINGS).getImage()));
            }
        }
    }

    public void equipItem6() {
        if (backpack.getBackpackContentList().get(5) instanceof Body) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(5));
                    deleteItem6();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(5));
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
        } else if (backpack.getBackpackContentList().get(5) instanceof Boots) {
            if (selectedHero.getHashmap().get(Anchor.BOOTS) == null) {
                selectedHero.equipBoots((Boots) backpack.getBackpackContentList().get(5));
                deleteItem6();
                equipmentBoots.setImage(new Image(selectedHero.getHashmap().get(Anchor.BOOTS).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(5) instanceof Gloves) {
            if (selectedHero.getHashmap().get(Anchor.GLOVES) == null) {
                selectedHero.equipGloves((Gloves) backpack.getBackpackContentList().get(5));
                deleteItem6();
                equipmentGloves.setImage(new Image(selectedHero.getHashmap().get(Anchor.GLOVES).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(5) instanceof Helmet) {
            if (selectedHero.getHashmap().get(Anchor.HELMET) == null) {
                selectedHero.equipHelmet((Helmet) backpack.getBackpackContentList().get(5));
                deleteItem6();
                equipmentHelmet.setImage(new Image(selectedHero.getHashmap().get(Anchor.HELMET).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(5) instanceof Leggings) {
            if (selectedHero.getHashmap().get(Anchor.LEGGINGS) == null) {
                selectedHero.equipLeggings((Leggings) backpack.getBackpackContentList().get(5));
                deleteItem6();
                equipmentLeggings.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEGGINGS).getImage()));
            }
        }
    }

    public void equipItem7() {
        if (backpack.getBackpackContentList().get(6) instanceof Body) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(6));
                    deleteItem7();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(6));
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
        } else if (backpack.getBackpackContentList().get(6) instanceof Boots) {
            if (selectedHero.getHashmap().get(Anchor.BOOTS) == null) {
                selectedHero.equipBoots((Boots) backpack.getBackpackContentList().get(6));
                deleteItem7();
                equipmentBoots.setImage(new Image(selectedHero.getHashmap().get(Anchor.BOOTS).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(6) instanceof Gloves) {
            if (selectedHero.getHashmap().get(Anchor.GLOVES) == null) {
                selectedHero.equipGloves((Gloves) backpack.getBackpackContentList().get(6));
                deleteItem7();
                equipmentGloves.setImage(new Image(selectedHero.getHashmap().get(Anchor.GLOVES).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(6) instanceof Helmet) {
            if (selectedHero.getHashmap().get(Anchor.HELMET) == null) {
                selectedHero.equipHelmet((Helmet) backpack.getBackpackContentList().get(6));
                deleteItem7();
                equipmentHelmet.setImage(new Image(selectedHero.getHashmap().get(Anchor.HELMET).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(6) instanceof Leggings) {
            if (selectedHero.getHashmap().get(Anchor.LEGGINGS) == null) {
                selectedHero.equipLeggings((Leggings) backpack.getBackpackContentList().get(6));
                deleteItem7();
                equipmentLeggings.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEGGINGS).getImage()));
            }
        }
    }

    public void equipItem8() {
        if (backpack.getBackpackContentList().get(7) instanceof Body) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(7));
                    deleteItem8();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(7));
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
        } else if (backpack.getBackpackContentList().get(7) instanceof Boots) {
            if (selectedHero.getHashmap().get(Anchor.BOOTS) == null) {
                selectedHero.equipBoots((Boots) backpack.getBackpackContentList().get(7));
                deleteItem8();
                equipmentBoots.setImage(new Image(selectedHero.getHashmap().get(Anchor.BOOTS).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(7) instanceof Gloves) {
            if (selectedHero.getHashmap().get(Anchor.GLOVES) == null) {
                selectedHero.equipGloves((Gloves) backpack.getBackpackContentList().get(7));
                deleteItem8();
                equipmentGloves.setImage(new Image(selectedHero.getHashmap().get(Anchor.GLOVES).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(7) instanceof Helmet) {
            if (selectedHero.getHashmap().get(Anchor.HELMET) == null) {
                selectedHero.equipHelmet((Helmet) backpack.getBackpackContentList().get(7));
                deleteItem8();
                equipmentHelmet.setImage(new Image(selectedHero.getHashmap().get(Anchor.HELMET).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(7) instanceof Leggings) {
            if (selectedHero.getHashmap().get(Anchor.LEGGINGS) == null) {
                selectedHero.equipLeggings((Leggings) backpack.getBackpackContentList().get(7));
                deleteItem8();
                equipmentLeggings.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEGGINGS).getImage()));
            }
        }
    }

    public void equipItem9() {
        if (backpack.getBackpackContentList().get(8) instanceof Body) {
            if (selectedHero.getHashmap().get(Anchor.BODY) != null) {
                if (backpack.getBackpackContentList().size() != 9) {
                    backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BODY));
                    selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(8));
                    deleteItem9();
                    equipmentBody.setImage(new Image(selectedHero.getHashmap().get(Anchor.BODY).getImage()));
                    inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                            (backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                                    .getImage()));
                }
            } else {
                selectedHero.equipArmor((Body) backpack.getBackpackContentList().get(8));
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
        } else if (backpack.getBackpackContentList().get(8) instanceof Boots) {
            if (selectedHero.getHashmap().get(Anchor.BOOTS) == null) {
                selectedHero.equipBoots((Boots) backpack.getBackpackContentList().get(8));
                deleteItem9();
                equipmentBoots.setImage(new Image(selectedHero.getHashmap().get(Anchor.BOOTS).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(8) instanceof Gloves) {
            if (selectedHero.getHashmap().get(Anchor.GLOVES) == null) {
                selectedHero.equipGloves((Gloves) backpack.getBackpackContentList().get(8));
                deleteItem9();
                equipmentGloves.setImage(new Image(selectedHero.getHashmap().get(Anchor.GLOVES).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(8) instanceof Helmet) {
            if (selectedHero.getHashmap().get(Anchor.HELMET) == null) {
                selectedHero.equipHelmet((Helmet) backpack.getBackpackContentList().get(8));
                deleteItem9();
                equipmentHelmet.setImage(new Image(selectedHero.getHashmap().get(Anchor.HELMET).getImage()));
            }
        } else if (backpack.getBackpackContentList().get(8) instanceof Leggings) {
            if (selectedHero.getHashmap().get(Anchor.LEGGINGS) == null) {
                selectedHero.equipLeggings((Leggings) backpack.getBackpackContentList().get(8));
                deleteItem9();
                equipmentLeggings.setImage(new Image(selectedHero.getHashmap().get(Anchor.LEGGINGS).getImage()));
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
        selectedHero.unequipArmor((Body) selectedHero.getHashmap().get(Anchor.BODY));
        equipmentBody.setImage(null);
        armorText.setText(String.valueOf(selectedHero.getProtection()));
        inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                ((Body) backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                        .getImage()));
    }

    public void unequipBoots() {
        backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.BOOTS));
        selectedHero.unequipBoots((Boots) selectedHero.getHashmap().get(Anchor.BOOTS));
        equipmentBoots.setImage(null);
        armorText.setText(String.valueOf(selectedHero.getProtection()));
        inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                ((Boots) backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                        .getImage()));
    }

    public void unequipGloves() {
        backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.GLOVES));
        selectedHero.unequipGloves((Gloves) selectedHero.getHashmap().get(Anchor.GLOVES));
        equipmentGloves.setImage(null);
        armorText.setText(String.valueOf(selectedHero.getProtection()));
        inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                ((Gloves) backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                        .getImage()));
    }

    public void unequipLeggings() {
        backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.LEGGINGS));
        selectedHero.unequipLeggings((Leggings) selectedHero.getHashmap().get(Anchor.LEGGINGS));
        equipmentLeggings.setImage(null);
        armorText.setText(String.valueOf(selectedHero.getProtection()));
        inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                ((Leggings) backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
                        .getImage()));
    }

    public void unequipHelmet() {
        backpack.getBackpackContentList().add(selectedHero.getHashmap().get(Anchor.HELMET));
        selectedHero.unequipHelmet((Helmet) selectedHero.getHashmap().get(Anchor.HELMET));
        equipmentHelmet.setImage(null);
        armorText.setText(String.valueOf(selectedHero.getProtection()));
        inventoryList.get(backpack.getBackpackContentList().size() - 1).setImage(new Image(
                ((Helmet) backpack.getBackpackContentList().get(backpack.getBackpackContentList().size() - 1))
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
            abilityCooldown = 0;
            cooldownText.setVisible(false);
            cooldownText.setDisable(true);
            if (this.selectedHero.getName().equals("Bob")) {
                blockAbility.setDisable(false);
            } else if (this.selectedHero.getName().equals("Gandalf")) {
                healAbility.setDisable(false);
            } else {
                burnAbility.setDisable(false);
            }
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
            healthHero.setText(String.valueOf(selectedHero.geteHitPoints() + "/" + selectedHero.getHitpoints()));
            hpHero.setText(String.valueOf(selectedHero.geteHitPoints() + "/" + selectedHero.getHitpoints()));
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
            gearType.setText("Weapon");
            this.inspectStat.setText(
                    String.valueOf((((Weapon) backpack.getBackpackContentList().get(teller)).getDamage())));
        } else if (backpack.getBackpackContentList().get(teller) instanceof Body) {
            inspectStatType.setText("Armor");
            gearType.setText("Body Armor");
            this.inspectStat.setText(
                    String.valueOf((((Body) backpack.getBackpackContentList().get(teller)).getActualArmor())));
        } else if (backpack.getBackpackContentList().get(teller) instanceof Gloves) {
            inspectStatType.setText("Armor");
            gearType.setText("Gloves");
            this.inspectStat.setText(
                    String.valueOf((((Gloves) backpack.getBackpackContentList().get(teller)).getActualArmor())));
        } else if (backpack.getBackpackContentList().get(teller) instanceof Boots) {
            inspectStatType.setText("Armor");
            gearType.setText("Boots");
            this.inspectStat.setText(
                    String.valueOf((((Boots) backpack.getBackpackContentList().get(teller)).getActualArmor())));
        } else if (backpack.getBackpackContentList().get(teller) instanceof Helmet) {
            inspectStatType.setText("Armor");
            gearType.setText("Helmet");
            this.inspectStat.setText(
                    String.valueOf((((Helmet) backpack.getBackpackContentList().get(teller)).getActualArmor())));
        } else if (backpack.getBackpackContentList().get(teller) instanceof Leggings) {
            inspectStatType.setText("Armor");
            gearType.setText("Leggings");
            this.inspectStat.setText(
                    String.valueOf((((Leggings) backpack.getBackpackContentList().get(teller)).getActualArmor())));
        }
        this.inspectImg.setImage(new Image(
                (backpack.getBackpackContentList().get(teller))
                        .getImage()));
    }

    public void inspectAnchor() {
        if (equipmentLeft.isHover() == true && this.selectedHero.getHashmap().get(Anchor.LEFT) != null) {
            inspect.setVisible(true);
            inspectStatType.setText("Damage");
            gearType.setText("Weapon");
            this.inspectStat.setText(
                    String.valueOf((((Weapon) this.selectedHero.getHashmap().get(Anchor.LEFT)).getDamage())));
            inspectImg.setImage(new Image(this.selectedHero.getHashmap().get(Anchor.LEFT).getImage()));
        } else if (equipmentRight.isHover() == true && this.selectedHero.getHashmap().get(Anchor.RIGHT) != null) {
            inspect.setVisible(true);
            inspectStatType.setText("Damage");
            gearType.setText("Weapon");
            this.inspectStat.setText(
                    String.valueOf((((Weapon) this.selectedHero.getHashmap().get(Anchor.RIGHT)).getDamage())));
            inspectImg.setImage(new Image(this.selectedHero.getHashmap().get(Anchor.RIGHT).getImage()));
        } else if (equipmentBody.isHover() == true && this.selectedHero.getHashmap().get(Anchor.BODY) != null) {
            inspect.setVisible(true);
            inspectStatType.setText("Armor");
            gearType.setText("Body Armor");
            this.inspectStat.setText(
                    String.valueOf((((Body) this.selectedHero.getHashmap().get(Anchor.BODY)).getActualArmor())));
            inspectImg.setImage(new Image(this.selectedHero.getHashmap().get(Anchor.BODY).getImage()));
        } else if (equipmentGloves.isHover() == true && this.selectedHero.getHashmap().get(Anchor.GLOVES) != null) {
            inspect.setVisible(true);
            inspectStatType.setText("Armor");
            gearType.setText("Gloves");
            this.inspectStat.setText(
                    String.valueOf(((((Gloves) this.selectedHero.getHashmap().get(Anchor.GLOVES)).getActualArmor()))));
            inspectImg.setImage(new Image(this.selectedHero.getHashmap().get(Anchor.GLOVES).getImage()));
        } else if (equipmentLeggings.isHover() == true && this.selectedHero.getHashmap().get(Anchor.LEGGINGS) != null) {
            inspect.setVisible(true);
            inspectStatType.setText("Armor");
            gearType.setText("Leggings");
            this.inspectStat.setText(
                    String.valueOf(
                            (((Leggings) this.selectedHero.getHashmap().get(Anchor.LEGGINGS)).getActualArmor())));
            inspectImg.setImage(new Image(this.selectedHero.getHashmap().get(Anchor.LEGGINGS).getImage()));
        } else if (equipmentHelmet.isHover() == true && this.selectedHero.getHashmap().get(Anchor.HELMET) != null) {
            inspect.setVisible(true);
            inspectStatType.setText("Armor");
            gearType.setText("Helmet");
            this.inspectStat.setText(
                    String.valueOf((((Helmet) this.selectedHero.getHashmap().get(Anchor.HELMET)).getActualArmor())));
            inspectImg.setImage(new Image(this.selectedHero.getHashmap().get(Anchor.HELMET).getImage()));
        } else if (equipmentBoots.isHover() == true && this.selectedHero.getHashmap().get(Anchor.BOOTS) != null) {
            inspect.setVisible(true);
            inspectStatType.setText("Armor");
            gearType.setText("Boots");
            this.inspectStat.setText(
                    String.valueOf((((Boots) this.selectedHero.getHashmap().get(Anchor.BOOTS)).getActualArmor())));
            inspectImg.setImage(new Image(this.selectedHero.getHashmap().get(Anchor.BOOTS).getImage()));
        }
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
            gearType.setText("Weapon");
            this.inspectStat.setText(
                    String.valueOf((((Weapon) lootList.get(teller)).getDamage())));
        } else if (lootList.get(teller) instanceof Body) {
            inspectStatType.setText("Armor");
            gearType.setText("Body Armor");
            this.inspectStat.setText(
                    String.valueOf((((Body) lootList.get(teller)).getActualArmor())));
        } else if (lootList.get(teller) instanceof Boots) {
            inspectStatType.setText("Armor");
            gearType.setText("Boots");
            this.inspectStat.setText(
                    String.valueOf((((Boots) lootList.get(teller)).getActualArmor())));
        } else if (lootList.get(teller) instanceof Gloves) {
            inspectStatType.setText("Armor");
            gearType.setText("Gloves");
            this.inspectStat.setText(
                    String.valueOf((((Gloves) lootList.get(teller)).getActualArmor())));
        } else if (lootList.get(teller) instanceof Helmet) {
            inspectStatType.setText("Armor");
            gearType.setText("Helmet");
            this.inspectStat.setText(
                    String.valueOf((((Helmet) lootList.get(teller)).getActualArmor())));
        } else if (lootList.get(teller) instanceof Leggings) {
            inspectStatType.setText("Armor");
            gearType.setText("Leggings");
            this.inspectStat.setText(
                    String.valueOf((((Leggings) lootList.get(teller)).getActualArmor())));
        }
        this.inspectImg.setImage(new Image(
                (lootList.get(teller))
                        .getImage()));
    }

    public void inspectAbility() {
        if (autoAttack.isHover() == true) {
            hoverAbility.setVisible(true);
            hoverAbilityText.setText("Auto attacks an enemy based on strength.\nNo cooldown");
        }
        if (blockAbility.isHover() == true) {
            hoverAbility.setVisible(true);
            hoverAbilityText.setText("Increases " + this.selectedHero.getName()
                    + "'s protection by 40% for 2 rounds.\nCooldown: 4 rounds");
        }
        if (healAbility.isHover() == true) {
            hoverAbility.setVisible(true);
            hoverAbilityText.setText(
                    "Heals " + this.selectedHero.getName() + " for " + increasedHp + "hitpoints.\nCooldown: 4 rounds");
        }
        if (burnAbility.isHover() == true) {
            hoverAbility.setVisible(true);
            hoverAbilityText.setText(
                    "Burns an enemy for " + tickDamage + " hitpoints per round for 2 rounds.\nCooldown: 4 rounds");
        }
    }

    public void exitHoverAbility() {
        this.hoverAbility.setVisible(false);
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

    public void Exit() {
        Platform.exit();
    }
}
