package OOP.Lession5.Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        SanPham sp = new SanPham();
        sp.Input(s);
        sp.Display();

        SanPham sp2 = new BangDia();
        sp2.Input(s);
        sp2.Display();

        SanPham sp3 = new Sach();
        sp3.Input(s);
        sp3.Display();

        SanPham sp4 = new VanPhongPham();
        sp4.Input(s);
        sp4.Display();

        ManageProduct qlsp = new ManageProduct();
        qlsp.AddProduct(sp);
        qlsp.AddProduct(sp2);
        qlsp.AddProduct(sp3);
        qlsp.AddProduct(sp4);

        qlsp.sapXep();
        System.out.println("Sap xep san pham theo gia (giam dan): ");
        qlsp.Display();

        System.out.println("=====Tim kiem=====");
        String kw = s.nextLine();
        ArrayList<SanPham> kq = qlsp.timKiem(kw);
        kq.forEach(p -> p.Display());
    }
}
