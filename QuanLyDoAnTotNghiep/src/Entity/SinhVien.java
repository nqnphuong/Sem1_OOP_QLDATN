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
public class SinhVien {

    public String MaSV;
    public String HoDem;
    public String TenSV;
    public String GioiTinh;
    public String NgaySinh;
    public String Email;
    public String SDT;
    public String Khoa;
    public String Nganh;
    public String MaGV;
    public String MaDA;
    public float Diem;

    public SinhVien() {
    }

    public SinhVien(String MaSV, String HoDem, String TenSV, String GioiTinh, String NgaySinh, 
            String Email, String SDT, String Khoa, String Nganh, String MaGV, String MaDA, float Diem) {
        this.MaSV = MaSV;
        this.HoDem = HoDem;
        this.TenSV = TenSV;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.Email = Email;
        this.SDT = SDT;
        this.Khoa = Khoa;
        this.Nganh = Nganh;
        this.MaGV = MaGV;
        this.MaDA = MaDA;
        this.Diem = Diem;
    }

    

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoDem() {
        return HoDem;
    }

    public void setHoDem(String HoDem) {
        this.HoDem = HoDem;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
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

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getMaDA() {
        return MaDA;
    }

    public void setMaDA(String MaDA) {
        this.MaDA = MaDA;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float Diem) {
        this.Diem = Diem;
    }

        

    
    
}
