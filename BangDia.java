package OOP.Lession5.Inheritance;

import java.util.Scanner;

public class BangDia extends SanPham {
    private double doDai;

    @Override
    public void Input(Scanner s) {
        super.Input(s);
        System.out.print("Nhap do dai dia: ");
        this.doDai = Double.parseDouble(s.nextLine());
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Do dai dia: " + this.doDai);
    }

    public double getDoDai() {
        return this.doDai;
    }

    public void setDoDai(double doDai) {
        this.doDai = doDai;
    }

}
