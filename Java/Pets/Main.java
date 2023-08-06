import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Controller control = new Controller();

        String step = "main";
        Scanner sc = new Scanner(System.in);
        boolean next = true;

        String new_animal = "null";
        String animal_num = "null";
        int animal_id = 0;

        while (next) {
            try {
                if (step.equals("main")) {
                    System.out.println(
                            "1 - Список животных; 2 - Новое животное; 3 - Список команд животного; 4 - Обучить новой команде");
                } else if (step.equals("new_animal")) {
                    System.out.println("Выберите вид животного: 1 - Вьючное; 2 - Домашнее");
                } else if (step.equals("new_pack")) {
                    System.out.println("Выберите животное: 1 - Лошадь; 2 - Верблюд; 3 - Осел");
                } else if (step.equals("new_pet")) {
                    System.out.println("Выберите животное: 1 - Кошка; 2 - Собака; 3 - Хомяк");
                } else if (step.equals("new_animal_info")) {
                    System.out.println("Введите через пробел: Имя Дата_рождения_dd.mm.yyyy");
                } else if (step.equals("list_command") || step.equals("new_command")) {
                    System.out.println("Введите ID животного");
                } else if (step.equals("new_command_info")) {
                    System.out.println("Введите новую команду");
                }
            } catch (Exception e) {
                System.out.println("Не удалось обработать команду: " + e);
            }

            String command = sc.nextLine();
            if (command.equals("exit")) {
                next = false;
            } else if (step.equals("main")) {
                if (command.equals("1")) {
                    control.PrintAnimals();
                    step = "main";
                } else if (command.equals("2")) {
                    step = "new_animal";
                } else if (command.equals("3")) {
                    step = "list_command";
                } else if (command.equals("4")) {
                    step = "new_command";
                }
            } else if (step.equals("new_animal")) {
                if (command.equals("1")) {
                    step = "new_pack";
                    new_animal = "new_pack";
                } else if (command.equals("2")) {
                    step = "new_pet";
                    new_animal = "new_pet";
                }
            } else if (step.equals("new_pack")
                    || step.equals("new_pet")) {
                if ((command.equals("1"))
                        || (command.equals("2"))
                        || (command.equals("3"))) {
                    step = "new_animal_info";
                    animal_num = command;
                }
            } else if (step.equals("new_animal_info")) {
                String[] info = command.split(" ");
                int id = 0;
                if (info.length == 2) {

                    try (Counter counter = new Counter()) {

                        if (new_animal.equals("new_pack")) {
                            if (animal_num.equals("1")) {
                                id = control.AddHorse(info[0], info[1]);
                            } else if (animal_num.equals("2")) {
                                id = control.AddCamel(info[0], info[1]);
                            } else if (animal_num.equals("3")) {
                                id = control.AddDonkey(info[0], info[1]);
                            } else {
                                System.out.println("Неверный выбор животного");
                            }
                        } else if (new_animal.equals("new_pet")) {
                            if (animal_num.equals("1")) {
                                id = control.AddCat(info[0], info[1]);
                            } else if (animal_num.equals("2")) {
                                id = control.AddDog(info[0], info[1]);
                            } else if (animal_num.equals("3")) {
                                id = control.AddHamster(info[0], info[1]);
                            } else {
                                System.out.println("Неверный выбор животного");
                            }
                        }

                        if (id != 0) {
                            
                            counter.Add();
                        }

                        step = "main";
                        control.PrintCommands(animal_id);
                        control.PrintAnimal(id);

                    } catch (Exception e) {
                        System.out.println("Не удалось добавить животное: " + e);
                    }

                } else {
                    System.out.println("Неверный выбор животного");
                }
            } else if (step.equals("list_command")
                    || step.equals("new_command")) {

                int id = Integer.parseInt(command);
                if (step.equals("list_command")) {
                    step = "main";
                    control.PrintCommands(id);
                } else if (step.equals("new_command")) {
                    animal_id = id;
                    step = "new_command_info";
                }

            } else if (step.equals("new_command_info")) {
                step = "main";
                if (control.AddCommand(animal_id, command)) {
                    control.PrintCommands(animal_id);
                }
            }
        }

        sc.close();

    }

}
