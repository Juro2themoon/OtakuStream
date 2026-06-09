package com.juro.otakustream.repository;

import com.juro.otakustream.entity.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository
    extends JpaRepository<Anime, Long> {

    List<Anime> findByTitleContainingIgnoreCase(String title);
}
