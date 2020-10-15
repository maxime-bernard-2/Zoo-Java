package main.animals.model;

public abstract class Animal {

    private String name;
    private boolean sex;
    private double weight;
    private double height;
    private int age;
    private int hungry;
    private boolean conciousness;
    private int health;

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

    public void eat() {
        if (this.conciousness) {
            this.hungry = 100;
        } else {
            System.out.println("Il faut reveiller " + this.name + " avant de le nourrir !");
        }

    }

    public void yell() {
        System.out.println(name + "fait du bruit");
    }

    public void recover() {
        this.health = 100;
    }

    public void toggleConciousness() {
        if(this.conciousness) {
            this.conciousness = false;
        } else {
            this.conciousness = true;
        }
    }

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

}
