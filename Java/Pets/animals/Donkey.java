package animals;

import handlers.DonkeyHandlerCommand;


public class Donkey extends Pack {

    @Override
    public void AddCommand(String command) {
         AddCommandHandler(new DonkeyHandlerCommand(command));
     }

    public Donkey(String name, String birthday) {
        super(name, birthday);
    }
    
    @Override
    public void PrintCommands() {
        System.out.print("Осел " + getName() + " выполняет команды: ");
        super.PrintCommands();
    }

    @Override
    public void Print() {
        System.out.println(String.format("Осел: {id=%1$d; name=%2$s; birthday=%3$s}", getId(), getName(), getBirthday()));
    }
}
