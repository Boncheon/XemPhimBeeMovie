package com.example.beemovie.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
public class BinhLuan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_binh_luan", nullable = false)
    private Integer id;

    @NotNull
    @Lob
    @Column(name = "noi_dung", nullable = false)
    private String noiDung;

    @Column(name = "thoi_gian")
    private Instant thoiGian;

}