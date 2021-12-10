package io;

import model.Phonebook;
import service.PhoneService;

import java.io.*;
import java.util.List;

public class ReadAndWrite {
    PhoneService phoneService = new PhoneService();

    public void readFile() {
        try {
            FileReader fileReader = new FileReader("phonebook.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                String realdfile[] = line.split(" , ");
                String phoneNumber = realdfile[0];
                String group = realdfile[1];
                String name = realdfile[2];
                String gender = realdfile[3];
                String address = realdfile[4];


                Phonebook phonebook = new Phonebook(phoneNumber, group, name, gender, address);
                phoneService.save(phonebook);

            }
            System.out.println("đã  đọc file ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile() {
        List<Phonebook> list = phoneService.findAll();
        try {
            FileWriter fileWriter = new FileWriter("phonebook.txt");
            for (Phonebook st : list) {
                fileWriter.write(st.toString() + " \n");
            }
            System.out.println("ghi file thành công");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
