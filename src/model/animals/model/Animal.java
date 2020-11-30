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
    public String eat() throws Exception {
        if (this.conciousness) {
            this.hungry = 100;
            return this.name + " a bien mangé !";
        } else {
            return this.name + " n'a pas pu manger car il dort.";
        }
    }

    /**
     * Methode <strong>yell()</strong> permet aux animaux de produire un son
     */
    public void yell() {
        System.out.println(name + "fait du bruit");
    }

    /**
     * Methode <strong>recover()</strong> permet aux animaux d'�tre soign�
     */
    public void recover() {
        this.health = 100;
    }

    /**
     * Methode <strong>toggleConciousness()</strong> permet aux animaux de se r�veiller ou s'endormir 
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

    @Override
    public String toString() {

        return "Nom: " + name + "\n" +
                "    Sexe: " + sex + "\n" +
                "    Poid: " + weight + "\n" +
                "    Age: " + age + "\n" +
                "    Faim: " + hungry + "%\n" +
                "    Etat: " + (conciousness ? "Conscient": "Endormi") + "\n" +
                "    Sante: " + health + "%\n";
    }
}
