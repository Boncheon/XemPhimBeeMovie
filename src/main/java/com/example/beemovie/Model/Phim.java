package com.example.beemovie.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Getter
@Setter
@Entity
public class Phim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_phim", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Nationalized
    @Column(name = "ten_phim", nullable = false)
    private String tenPhim;

    @Lob
    @Column(name = "mo_ta")
    private String moTa;

    @NotNull
    @Column(name = "nam_san_xuat", nullable = false)
    private Integer namSanXuat;

    @NotNull
    @Column(name = "thoi_luong", nullable = false)
    private Integer thoiLuong;

    @Size(max = 255)
    @Nationalized
    @Column(name = "hinh_anh")
    private String hinhAnh;

    @Size(max = 255)
    @Nationalized
    @Column(name = "trailer")
    private String trailer;

    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @Column(name = "trang_thai", columnDefinition = "tinyint")
    private Short trangThai;

}