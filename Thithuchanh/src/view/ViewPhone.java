package view;

import model.Phonebook;

import java.util.List;
import java.util.Scanner;

public class ViewPhone {
    Scanner scanner = new Scanner(System.in);

    public int menu() {
        System.out.println("----Chương Trình Quản Lý Danh Bạ");
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm Kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng");
        return scanner.nextInt();
    }

    public String inputName() {
        System.out.println("Nhập tên");
        return scanner.nextLine();
    }

    public String inputPhone() {
        System.out.println("Nhập số điện thoại");
        return scanner.nextLine();
    }

    public Phonebook create(boolean isPhone) {
        System.out.println("Nhập số điện thoại");
        scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập Nhóm danh bạ");
        String group = scanner.nextLine();
        System.out.println("Nhập Họ tên");
        String name = scanner.nextLine();
        System.out.println("Giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        return new Phonebook(phoneNumber, group, name, gender, address);
    }

    public void show(List<Phonebook> phonebooks) {
        for (Phonebook p : phonebooks) {
            System.out.println(p);
        }
    }



}
