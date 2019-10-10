package bai4git;
import java.util.Date;
public class SV {
    private  String hoTen;
    private  Date ngaySinh;
    private  double dtb;
public SV(String hoTen, Date ngaySinh, double dtb) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
}
 public String layHoTen() {
        return hoTen;
    }
 public void ganHoTen(String hoTen) {
        this.hoTen = hoTen;
}
 public Date layNgaySinh() {
        return ngaySinh;
    }
 public void ganNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
 public double layDTB() {
        return dtb;
    }
 public void ganDTB(double dtb) {
        this.dtb = dtb;
    }
}
