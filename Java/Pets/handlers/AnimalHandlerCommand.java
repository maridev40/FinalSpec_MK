package handlers;
public class AnimalHandlerCommand implements ICommandHandler {

    private String commandName;

    public AnimalHandlerCommand(String command) {
        commandName = command;
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public void handleCommand() {
        System.out.println(String.format("Животное выполняет команду: %", commandName));
    }

}
