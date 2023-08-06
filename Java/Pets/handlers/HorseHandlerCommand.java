package handlers;

public class HorseHandlerCommand  implements ICommandHandler {
    
    private String commandName;

    public HorseHandlerCommand(String command) {
        commandName = command;
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public void handleCommand() {
        System.out.println(String.format("Конь выполняет команду: %", commandName));
    }

}
