package handlers;

public class CatHandlerCommand implements ICommandHandler{

    private String commandName;

    public CatHandlerCommand(String command) {
        commandName = command;
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public void handleCommand() {
        System.out.println(String.format("Кошка выполняет команду: %", commandName));
    }

}
