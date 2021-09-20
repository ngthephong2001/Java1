package OOP.Lession5.Inheritance;

import java.util.Scanner;

public class VanPhongPham extends SanPham {
    private String congDung;

    @Override
    public void Input(Scanner s) {
        super.Input(s);
        System.out.print("Nhap cong dung: ");
        this.congDung = s.nextLine();
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Cong dung: " + this.congDung);
    }

    public String getCongDung() {
        return this.congDung;
    }

    public void setCongDung(String congDung) {
        this.congDung = congDung;
    }

}