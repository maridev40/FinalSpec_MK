package handlers;
public class PackHandlerCommand implements ICommandHandler{
    private String commandName;

    public PackHandlerCommand(String command) {
        commandName = command;
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public void handleCommand() {
        System.out.println(String.format("Вьючное животное выполняет команду: %", commandName));
    } 
}
