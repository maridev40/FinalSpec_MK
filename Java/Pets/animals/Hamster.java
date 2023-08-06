package animals;

import handlers.HamsterHandlerCommand;

public class Hamster extends Pet {

    @Override
    public void AddCommand(String command) {
         AddCommandHandler(new HamsterHandlerCommand(command));
     }

    public Hamster(String name, String birthday) {
        super(name, birthday);
    }
    
    @Override
    public void PrintCommands() {
        System.out.print("Хомяк " + getName() + " выполняет команды: ");
        super.PrintCommands();
    }

    @Override
    public void Print() {
        System.out.println(String.format("Хомяк: {id=%1$d; name=%2$s; birthday=%3$s}", getId(), getName(), getBirthday()));
    }
}
