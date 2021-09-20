package OOP.Lession5.Inheritance;

import java.util.Scanner;

public class Sach extends SanPham {
    private int soTrang;

    @Override
    public void Input(Scanner s) {
        super.Input(s);
        System.out.print("Nhap so trang sach: ");
        this.soTrang = Integer.parseInt(s.nextLine());
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("So trang: " + this.soTrang);
    }

    public int getSoTrang() {
        return this.soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

}
