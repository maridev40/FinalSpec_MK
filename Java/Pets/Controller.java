import java.util.ArrayList;
import java.util.List;

import animals.Animal;
import animals.Camel;
import animals.Cat;
import animals.Dog;
import animals.Donkey;
import animals.Hamster;
import animals.Horse;
import handlers.ICommandHandler;

public class Controller {

    private List<Animal> animals = new ArrayList<>();

    private void AddAnimal(Animal animal) {
        animals.add(animal);
    }

    public int AddCamel(String name, String birthday) {
        Camel camel = new Camel(name, birthday);
        AddAnimal(camel);
        return camel.getId();
    }

    public int AddHorse(String name, String birthday) {
        Horse horse = new Horse(name, birthday);
        AddAnimal(horse);
        return horse.getId();
    }

    public int AddDonkey(String name, String birthday) {
        Donkey donkey = new Donkey(name, birthday);
        AddAnimal(donkey);
        return donkey.getId();
    }

    public int AddCat(String name, String birthday) {
        Cat cat = new Cat(name, birthday);
        AddAnimal(cat);
        return cat.getId();
    }

    public int AddDog(String name, String birthday) {
        Dog dog = new Dog(name, birthday);
        AddAnimal(dog);
        return dog.getId();
    }

    public int AddHamster(String name, String birthday) {
        Hamster hamster = new Hamster(name, birthday);
        AddAnimal(hamster);
        return hamster.getId();
    }

    public void PrintCommands(int animalID) {
        Animal animalFind = null;
        for (Animal animal : animals) {
            if (animalID == animal.getId()) {
                animalFind = animal;
                break;
            }
        }
        if (animalFind != null) {
            animalFind.PrintCommands();
        } else {
            System.out.println("Животное не найдено!");
        }
    }

    public void PrintAnimals() {

        if (animals == null || animals.size() == 0) {
            System.out.println("Животные не найдены!");
        }
        for (Animal animal : animals) {
            animal.Print();
        }

    }

    public void PrintAnimal(int animalID) {

        Animal animalFind = null;
        for (Animal animal : animals) {
            if (animalID == animal.getId()) {
                animalFind = animal;
                break;
            }
        }
        if (animalFind != null) {
            animalFind.Print();
        } else {
            System.out.println("Животное не найдено!");
            return;
        }

    }

    public boolean AddCommand(int animalID, String command) {
        Animal animalFind = null;
        for (Animal animal : animals) {
            if (animalID == animal.getId()) {
                animalFind = animal;
                break;
            }
        }
        if (animalFind == null) {
            System.out.println("Животное не найдено!");
            return false;
        }
        for (ICommandHandler handler : animalFind.getHandlers()) {
            if (command == handler.getCommandName()) {
                System.out.println("Такая команда уже существует!");
                return false;
            }
        }

        animalFind.AddCommand(command);
        return true;
    }

}
