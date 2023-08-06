package animals;

import handlers.CatHandlerCommand;

public class Cat extends Pet {

    @Override
    public void AddCommand(String command) {
         AddCommandHandler(new CatHandlerCommand(command));
     }

    public Cat(String name, String birthday) {
        super(name, birthday);
    }

    @Override
    public void PrintCommands() {
        System.out.print("Кошка " + getName() + " выполняет команды: ");
        super.PrintCommands();
    }

    @Override
    public void Print() {
        System.out.println(String.format("Кошка: {id=%1$d; name=%2$s; birthday=%3$s}", getId(), getName(), getBirthday()));
    }

}
