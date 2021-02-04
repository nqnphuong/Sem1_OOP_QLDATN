package Entity;

public class DoAn {

    public String MaDA;
    public String TenDA;
    public int SoLuong;

    public DoAn(String MaDA, String TenDA, int SoLuong) {
        this.MaDA = MaDA;
        this.TenDA = TenDA;
        this.SoLuong = SoLuong;
    }

    public DoAn(String MaDA, String TenDA) {
        this.MaDA = MaDA;
        this.TenDA = TenDA;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMaDA() {
        return MaDA;
    }

    public void setMaDA(String MaDA) {
        this.MaDA = MaDA;
    }

    public String getTenDA() {
        return TenDA;
    }

    public void setTenDA(String TenDA) {
        this.TenDA = TenDA;
    }

}
