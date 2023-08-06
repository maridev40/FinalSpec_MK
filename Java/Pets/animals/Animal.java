package animals;

import java.util.ArrayList;
import java.util.List;

import handlers.AnimalHandlerCommand;
import handlers.ICommandHandler;

public abstract class Animal {

    private static int COUNT = 0;

    private int id;

    private String name;

    private String birthday;

    private List<ICommandHandler> handlers = new ArrayList<>();

    protected void AddCommandHandler(ICommandHandler handler) {
        handlers.add(handler);
    }

    public abstract void AddCommand(String command);

    Animal(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        COUNT = COUNT + 1;
        this.id = COUNT;
        AddCommandHandler(new AnimalHandlerCommand("Кушать"));
        AddCommandHandler(new AnimalHandlerCommand("Спать"));
    }

    public void PrintCommands() {
        for (ICommandHandler handler : handlers) {
            System.out.print(handler.getCommandName() + ", ");
        }
        System.out.println("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public List<ICommandHandler> getHandlers() {
        return handlers;
    }

    public void Print() {
        System.out.println(String.format("Животное: {id=%1$d; name=%2$s; birthday=%3$s}", id, name, birthday));
    }

}