package OOP.Lession5.Inheritance;

import java.util.ArrayList;

public class ManageProduct {
    private ArrayList<SanPham> listProduct;

    ManageProduct() {
        listProduct = new ArrayList<>();
    }

    public void AddProduct(SanPham sp) {
        this.listProduct.add(sp);
    }

    public ArrayList<SanPham> timKiem(String kw) {
        ArrayList<SanPham> kq = new ArrayList<>();
        // for (SanPham sanPham : listProduct) {
        // if (sanPham.getTenSanPham().contains(kw)) {
        // kq.add(sanPham);
        // }
        // }
        this.listProduct.forEach(p -> {
            if (p.getTenSanPham().contains(kw) == true || p.getMaSanPham().equals(kw) == true) {
                kq.add(p);
            }
        });
        return kq;
    }

    public void sapXep() {
        this.listProduct.sort((p1, p2) -> {
            double g1 = p1.getGiaBan();
            double g2 = p2.getGiaBan();
            return g1 > g2 ? -1 : (g1 < g2 ? 1 : 0);
        });
    }

    public void Display() {
        this.listProduct.forEach(p -> p.Display());
    }

    public ArrayList<SanPham> getManageProduct() {
        return this.listProduct;
    }

    public void setManageProduct(ArrayList<SanPham> listProduct) {
        this.listProduct = listProduct;
    }

}
