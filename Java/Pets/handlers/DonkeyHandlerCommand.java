package handlers;
public class DonkeyHandlerCommand implements ICommandHandler {

    private String commandName;

    public DonkeyHandlerCommand(String command) {
        commandName = command;
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public void handleCommand() {
        System.out.println(String.format("Осел выполняет команду: %", commandName));
    }

}