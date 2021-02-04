CREATE DATABASE QuanLyDoAn
USE QuanLyDoAn
CREATE TABLE DangNhap (
	MaDN varchar(30) NOT NULL,
	MatKhau varchar(30) NOT NULL,
	CONSTRAINT pk_DangNhap_MaDN PRIMARY KEY (MaDN)
)
--alter table DangNhap
--	add QuyenTruyCap nvarchar(40) not null
--alter table DangNhap
--	add constraint ck_DangNhap_QuyenTruyCap check (QuyenTruyCap in (N'Quản trị viên',N'Giảng viên',N'Sinh viên'))
----------------------------------------------------------------------
CREATE TABLE DoAn(
	MaDA varchar(10),
	TenDA nvarchar(400) NOT NULL,
	CONSTRAINT pk_DoAn_MaDA PRIMARY KEY (MaDA),
	CONSTRAINT CK_MaDA CHECK (MaDA LIKE 'DA[0-9][0-9][0-9]')
)
----------------------------------------------------------------------
create table GiangVien(
	MaGV varchar(30), 
	Hodem nvarchar(40) not null,
	TenGV nvarchar(40) not null,
	Email varchar(30),
	SDT varchar(30),
	constraint pk_GiangVien_MaGV primary key(MaGV),
	CONSTRAINT CK_MaGV CHECK (MaGV LIKE 'GV[0-9][0-9][0-9]')
)
----------------------------------------------------------------------
create table SinhVien(
	MaSV varchar(30),
	Hodem nvarchar(40) not null,
    TenSV nvarchar(40) not null,
    GioiTinh nvarchar(10) not null,
    NgaySinh date not null,
	Email varchar(30) not null,
    SDT varchar(30) not null,
    Khoa nvarchar(100) not null,
    Nganh nvarchar(100) not null,
    MaGV varchar(30),
	MaDA varchar(10),
    Diem float,
	constraint pk_SinhVien_MaSV primary key(MaSV)	
)
go
alter table SinhVien
	add constraint fk_SinhVien_MaDA foreign key(MaDA)
	references DoAn 
	on DELETE set NULL
go
alter table SinhVien
	add constraint fk_SinhVien_MaGV foreign key(MaGV)
	references GiangVien 
	on DELETE set null
----------------------------------------------------------------------
select da.MaDA,da.TenDA, COUNT(sv.MaSV) as 'Soluong'
from DoAn da
left join SinhVien sv
on da.MaDA=sv.MaDA
group by da.MaDA, da.TenDA
----------------------------------------------------------------------
select gv.*, COUNT(sv.MaSV) as 'Soluong'
from GiangVien gv
left join SinhVien sv
on gv.MaGV=sv.MaGV
group by gv.MaGV, gv.Hodem, gv.TenGV, gv.Email, gv.SDT