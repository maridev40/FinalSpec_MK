package handlers;

public class CamelHandlerCommand implements ICommandHandler {
    
    private String commandName;

    public CamelHandlerCommand(String command) {
        commandName = command;
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public void handleCommand() {
        System.out.println(String.format("Верблюд выполняет команду: %", commandName));
    }

}
