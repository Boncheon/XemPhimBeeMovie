package com.example.beemovie.Repository;

import com.example.beemovie.Model.Phim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhimRepository extends JpaRepository<Phim,Integer> {
}
