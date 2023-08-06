package animals;

import handlers.CamelHandlerCommand;

public class Camel extends Pack {

    @Override
     public void AddCommand(String command) {
         AddCommandHandler(new CamelHandlerCommand(command));
     }

    public Camel(String name, String birthday) {
        super(name, birthday);
    }

    @Override
    public void PrintCommands() {
        System.out.print("Верблюд " + getName() + " выполняет команды: ");
        super.PrintCommands();
    }

    @Override
    public void Print() {
        System.out.println(String.format("Верблюд: {id=%1$d; name=%2$s; birthday=%3$s}", getId(), getName(), getBirthday()));
    }
}
