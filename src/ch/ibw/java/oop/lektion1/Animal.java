package ch.ibw.java.oop.lektion1;

public class Animal {
    private String name;
    private String color;
    private int weight;
    private int height;

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Animal setColor(String color) {
        this.color = color;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Animal setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Animal setHeight(int height) {
        this.height = height;
        return this;
    }

    public static String eat(){
        return "eat grass";
    }
}

