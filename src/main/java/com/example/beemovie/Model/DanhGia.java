package com.example.beemovie.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
public class DanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_danh_gia", nullable = false)
    private Integer id;

    @Column(name = "so_sao", columnDefinition = "tinyint")
    private Short soSao;

    @Column(name = "ngay_danh_gia")
    private Instant ngayDanhGia;

}