package handlers;
public class HamsterHandlerCommand implements ICommandHandler {

    private String commandName;

    public HamsterHandlerCommand(String command) {
        commandName = command;
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public void handleCommand() {
        System.out.println(String.format("Хомяк выполняет команду: %", commandName));
    }
}
