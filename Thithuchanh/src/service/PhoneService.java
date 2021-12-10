package service;

import model.Phonebook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PhoneService implements Serializable {
    static List<Phonebook> phonebooks = new ArrayList<>();

    public PhoneService() {
    }

    public void save(Phonebook phonebook) {
        phonebooks.add(phonebook);
    }

    public List<Phonebook> findAll() {
        return phonebooks;
    }

    public void delete(int index) {
        phonebooks.remove(index);
        findAll();
    }


    public List<Phonebook> edit(int index, Phonebook phonebook) {
        phonebooks.set(index, phonebook);
        return phonebooks;
    }

    public int findIndexByName(String name) {
        for (int i = 0; i < phonebooks.size(); i++) {
            if (phonebooks.get(i).getName().equals(name)) {
                return i;
            } else {
                System.out.println("Không tìm thấy số");
            }
        }
        return -1;
    }

    public void search(String sđt) {
        for (int i = 0; i < phonebooks.size(); i++) {
            if (sđt.equals(phonebooks.get(i).getPhoneNumber())) {
                System.out.println(phonebooks.get(i));
            }
        }
    }


}
