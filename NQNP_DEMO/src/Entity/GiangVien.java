/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ngnha
 */
public class GiangVien {

    public String MaGV;
    public String HoDem;
    public String TenGV;
    public String Email;
    public String SDT;
    public int SoLuong;

    public GiangVien(String MaGV, String HoDem, String TenGV, String Email, String SDT) {
        this.MaGV = MaGV;
        this.HoDem = HoDem;
        this.TenGV = TenGV;
        this.Email = Email;
        this.SDT = SDT;
    }

    public GiangVien(String MaGV, String HoDem, String TenGV, String Email, String SDT, int SoLuong) {
        this.MaGV = MaGV;
        this.HoDem = HoDem;
        this.TenGV = TenGV;
        this.Email = Email;
        this.SDT = SDT;
        this.SoLuong = SoLuong;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getHoDem() {
        return HoDem;
    }

    public void setHoDem(String HoDem) {
        this.HoDem = HoDem;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String TenGV) {
        this.TenGV = TenGV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

}
