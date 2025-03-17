package com.example.beemovie.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
public class TapPhim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tap", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_phim", nullable = false)
    private Phim idPhim;

    @NotNull
    @Column(name = "so_tap", nullable = false)
    private Integer soTap;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ten_tap")
    private String tenTap;

    @Size(max = 255)
    @NotNull
    @Nationalized
    @Column(name = "link_video", nullable = false)
    private String linkVideo;

}