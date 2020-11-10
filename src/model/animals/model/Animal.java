package model.animals.model;

/**
 * Classe abstraite Animal
 *
 */
public abstract class Animal {

	//Attributes
    private String name;
    private final boolean sex;
    private double weight;
    private double height;
    private int age;
    private int hungry;
    private boolean conciousness;
    private int health;

    //Constructor
    public Animal(String name, boolean sex, double weight, double height, int age) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.hungry = 100;
        this.conciousness = true;
        this.health = 100;
    }

    /**
     * Methode <strong>eat()</strong> permet aux animaux de manger (lorsqu'ils ne dorment pas)
     */
    public void eat() {
        if (this.conciousness) {
            this.hungry = 100;
            System.out.println(this.name + " a bien mangé !");
        } else {
            System.out.println("Il faut reveiller " + this.name + " avant de le nourrir !");
        }
    }

    /**
     * Methode <strong>yell()</strong> permet aux animaux de produire un son
     */
    public void yell() {
        System.out.println(name + "fait du bruit");
    }

    /**
     * Methode <strong>recover()</strong> permet aux animaux d'être soigné
     */
    public void recover() {
        this.health = 100;
    }

    /**
     * Methode <strong>toggleConciousness()</strong> permet aux animaux de se réveiller ou s'endormir 
     */
    public void toggleConciousness() {
        if(this.conciousness) {
            this.conciousness = false;
        } else {
            this.conciousness = true;
        }
    }

    
    //Getters and Setters
    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getHungry() {
        return hungry;
    }

    public boolean isConciousness() {
        return conciousness;
    }

    public int getHealth() {
        return health;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public void setConciousness(boolean conciousness) {
        this.conciousness = conciousness;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
