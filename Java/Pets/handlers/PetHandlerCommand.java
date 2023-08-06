package handlers;
public class PetHandlerCommand implements ICommandHandler{
    private String commandName;

    public PetHandlerCommand(String command) {
        commandName = command;
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public void handleCommand() {
        System.out.println(String.format("Домашнее животное выполняет команду: %", commandName));
    } 
}