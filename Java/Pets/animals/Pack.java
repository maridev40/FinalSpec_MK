package animals;

import handlers.PackHandlerCommand;

public abstract class Pack extends Animal {
    
    @Override
    public void AddCommand(String command) {
         AddCommandHandler(new PackHandlerCommand(command));
     }

    Pack(String name, String birthday) {
        super(name, birthday);
        AddCommandHandler(new PackHandlerCommand("Нести"));
    }

    @Override
    public void Print() {
        System.out.println(String.format("Вьючное животное: {id=%1$d; name=%2$s; birthday=%3$s}", getId(), getName(), getBirthday()));
    }
}
