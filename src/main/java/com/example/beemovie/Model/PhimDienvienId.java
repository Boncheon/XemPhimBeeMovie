package com.example.beemovie.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PhimDienvienId implements Serializable {
    private static final long serialVersionUID = -5683047008366583320L;
    @NotNull
    @Column(name = "id_phim", nullable = false)
    private Integer idPhim;

    @NotNull
    @Column(name = "id_dien_vien", nullable = false)
    private Integer idDienVien;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PhimDienvienId entity = (PhimDienvienId) o;
        return Objects.equals(this.idPhim, entity.idPhim) &&
                Objects.equals(this.idDienVien, entity.idDienVien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPhim, idDienVien);
    }

}