package main;

import service.PhoneService;
import model.Phonebook;
import io.ReadAndWrite;
import view.ViewPhone;

public class Controller {
    ViewPhone viewPhone = new ViewPhone();
    PhoneService phoneService = new PhoneService();
    ReadAndWrite readAndWrite = new ReadAndWrite();
    public Controller() {
        while (true) {
            int choice = viewPhone.menu();
            switch (choice) {
                case 1:
                    viewPhone.show(phoneService.findAll());
                    break;
                case 2:
                    phoneService.save(viewPhone.create(true));
                    break;
                case 3:
                    int index = phoneService.findIndexByName(viewPhone.inputName());
                    if (index != -1) {
                        if (phoneService.findAll().get(index) instanceof Phonebook) {
                            phoneService.edit(index, viewPhone.create(true));
                        } else {
                            phoneService.edit(index, viewPhone.create(false));
                        }
                    }
                case 4:
                    index = phoneService.findIndexByName(viewPhone.inputName());
                    phoneService.delete(index);
                    break;
                case 5:
                    phoneService.search(viewPhone.inputName());
                    break;
                case 6:
                    readAndWrite.readFile();
                    break;
                case 7:
                    readAndWrite.writeToFile();
                    break;
                case 8:
                    break;
            }
        }
    }

}

