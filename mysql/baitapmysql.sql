CREATE TABLE baitapmysql.chitietsudungdv (
  MaDatPhong INT NOT NULL,
  MaDV INT NOT NULL,
  SoLuong INT NOT NULL,
  PRIMARY KEY (MaDatPhong, MaDV)
);

CREATE TABLE baitapmysql.phong (
  MaPhong INT NOT NULL,
  LoaiPhong NVARCHAR(255) NOT NULL,
  SoKhachToiDa INT NOT NULL,
  GiaPhong DOUBLE NOT NULL,
  MoTa NVARCHAR(500),
  PRIMARY KEY(MaPhong)
);

CREATE TABLE baitapmysql.khachhang (
  MaKH INT NOT NULL,
  TenKH NVARCHAR(255) NOT NULL,
  DiaChi NVARCHAR(500) NOT NULL,
  SoDT NVARCHAR(255) NOT NULL,
  PRIMARY KEY (MaKH)
);

CREATE TABLE baitapmysql.datphong (
  MaDatPhong INT NOT NULL,
  MaPhong INT NOT NULL,
  MaKH INT NOT NULL,
  NgayDat DATE NOT NULL,
  GioBatDau TIME NOT NULL,
  GioKetThuc TIME NOT NULL,
  TienDatCoc DOUBLE NOT NULL,
  GhiChu NVARCHAR(255) NOT NULL,
  TrangThaiDat NVARCHAR(255) NOT NULL,
  PRIMARY KEY (MaDatPhong),
  FOREIGN KEY (MaPhong) REFERENCES phong(MaPhong),
  FOREIGN KEY (MaKH) REFERENCES khachhang(MaKH)
);

CREATE TABLE baitapmysql.dichvudikem (
  MaDV INT NOT NULL,
  TenDV NVARCHAR(255) NOT NULL,
  DonViTinh NVARCHAR(50) NOT NULL,
  DonGia DOUBLE NOT NULL,
  PRIMARY KEY(MaDV)
);

CREATE TABLE baitapmysql.chitietsudungdv_dp (
  MaDatPhong INT NOT NULL,
  MaDV INT NOT NULL,
  SoLuong INT NOT NULL,
  PRIMARY KEY (MaDatPhong, MaDV),
  FOREIGN KEY (MaDatPhong) REFERENCES datphong(MaDatPhong),
  FOREIGN KEY (MaDV) REFERENCES dichvudikem(MaDV)
);

CREATE INDEX index_name ON baitapmysql.chitietsudungdv_dp (MaDV);

ALTER TABLE baitapmysql.dichvudikem ADD FOREIGN KEY (MaDV) REFERENCES baitapmysql.chitietsudungdv_dp(MaDV);

