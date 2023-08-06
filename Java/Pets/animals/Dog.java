package animals;

import handlers.DogHandlerCommand;

public class Dog extends Pet {

    @Override
    public void AddCommand(String command) {
         AddCommandHandler(new DogHandlerCommand(command));
     }

    public Dog(String name, String birthday) {
        super(name, birthday);
        AddCommandHandler(new DogHandlerCommand("Охранять"));
        AddCommandHandler(new DogHandlerCommand("Лаять"));
    }
    
    @Override
    public void PrintCommands() {
        System.out.print("Собака " + getName() + " выполняет команды: ");
        super.PrintCommands();
    }

    @Override
    public void Print() {
        System.out.println(String.format("Собака: {id=%1$d; name=%2$s; birthday=%3$s}", getId(), getName(), getBirthday()));
    }
}
