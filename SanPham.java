package OOP.Lession5.Inheritance;

import java.util.Scanner;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private double giaBan;

    public void Input(Scanner s) {
        System.out.print("Nhap ma san pham: ");
        this.maSanPham = s.nextLine();
        System.out.print("Nhap ten san pham: ");
        this.tenSanPham = s.nextLine();
        System.out.print("Nhap gia san pham: ");
        this.giaBan = Double.parseDouble(s.nextLine());

    }

    public void Display() {
        System.out.println("Ma san pham: " + this.maSanPham);
        System.out.println("Ten san pham: " + this.tenSanPham);
        System.out.println("Gia san pham: " + this.giaBan);
    }

    public String getMaSanPham() {
        return this.maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return this.tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return this.giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

}
