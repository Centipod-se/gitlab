package se.centipod.gitlab.model;

public class Rooster implements Animal {
    private String name;
    private String color;

    public Rooster(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }

    @Override
    public void setName(String Name) {
        this.name = name;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
