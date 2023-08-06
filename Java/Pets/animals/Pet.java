package animals;

import handlers.PetHandlerCommand;

public abstract class Pet extends Animal {

    @Override
    public void AddCommand(String command) {
         AddCommandHandler(new PetHandlerCommand(command));
     }

    Pet(String name, String birthday) {
        super(name, birthday);
        AddCommandHandler(new PetHandlerCommand("Играть"));
    }    

    @Override
    public void Print() {
        System.out.println(String.format("Домашнее животное: {id=%1$d; name=%2$s; birthday=%3$s}", getId(), getName(), getBirthday()));
    }

}
