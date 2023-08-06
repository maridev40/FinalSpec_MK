package handlers;
public class DogHandlerCommand implements ICommandHandler {

    private String commandName;

    public DogHandlerCommand(String command) {
        commandName = command;
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public void handleCommand() {
        System.out.println(String.format("Собака выполняет команду: %", commandName));
    }

}