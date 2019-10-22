package bai4;

import java.util.Date;
import java.util.StringTokenizer;

public class SV {

    private String hoTen;
    private Date ngaySinh;
    private double dtb;

    public SV(String hoTen, Date ngaySinh, double dtb) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public void hienThi() {
        System.out.println("\ntensinhvien: " + hoTen + "\nngaysinh: " + ngaySinh + "\ndiem trung binh: " + dtb);
    }

    public String getHo() {
        String a = this.getHoTen();
        return a.split(" ")[0];
    }

    public String getTen() {
        StringTokenizer a = new StringTokenizer(this.getHoTen());
        return this.getHoTen().split(" ")[a.countTokens() - 1];
    }

    public String getDem(String dem) {
        this.hoTen = dem;
        dem = dem.substring(dem.indexOf(" "), dem.lastIndexOf(" "));
        return dem;
    }

    public int getTuoi() {
        Date ngayht = new Date();
        return (ngayht.getYear()) - this.ngaySinh.getYear();
    }

    public String getXepLoai() {
        if (dtb >= 8) {
            return "gioi";
        }
        if (dtb < 8) {
            return "kha";
        }
        if (dtb < 7) {
            return "trung binh";
        } else {
            return "yeu";
        }
    }

    public static void main(String args[]) {
        SV sv1 = new SV("Ngo Van Quynh", new Date("23/07/1999"), 7);
        sv1.hienThi();

    }

    String getDem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
