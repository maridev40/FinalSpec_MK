package animals;

import handlers.HorseHandlerCommand;

public class Horse extends Pack {

    @Override
    public void AddCommand(String command) {
         AddCommandHandler(new HorseHandlerCommand(command));
     }

    public Horse(String name, String birthday) {
        super(name, birthday);
    }

    @Override
    public void PrintCommands() {
        System.out.print("Лошадь " + getName() + " выполняет команды: ");
        super.PrintCommands();
    }

    @Override
    public void Print() {
        System.out.println(String.format("Лошадь: {id=%1$d; name=%2$s; birthday=%3$s}", getId(), getName(), getBirthday()));
    }
}
