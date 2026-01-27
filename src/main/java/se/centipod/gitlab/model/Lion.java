package se.centipod.gitlab.model;

public class Lion implements Animal{
    private String name;
    private String color;

    public Lion(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("ROOAAR!!");
    }

    @Override
    public void setName(String Name) {
        this.name = Name;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
