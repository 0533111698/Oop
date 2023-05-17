package oop.horasha2;

public class Animals {
    private String name;
    private String animalSize;

    public Animals(String name, String animalSize) {
        this.name = name;
        this.animalSize = animalSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalSize() {
        return animalSize;
    }

    public void setAnimalSize(String animalSize) {
        this.animalSize = animalSize;
    }

    @Override
    public String toString() {
        return "name="+this.name+"  animal size="+this.getAnimalSize();
    }
    public void printAnimals(){
        System.out.println(super.toString());
    }
}
