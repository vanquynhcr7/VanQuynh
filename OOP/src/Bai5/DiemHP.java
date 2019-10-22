package Bai5;

public abstract class DiemHP {

    protected String tenHP;
    protected int soTinChi;

    public DiemHP(String tenHP, int soTinChi) {
        this.tenHP = tenHP;
        this.soTinChi = soTinChi;
    }

    public String layTenHP() {
        return tenHP;
    }

    public int laySoTinChi() {
        return soTinChi;
    }

    abstract double tinhDiem();

}
