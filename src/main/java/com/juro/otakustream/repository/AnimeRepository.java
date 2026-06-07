package com.juro.otakustream.repository;

import com.juro.otakustream.entity.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository
    extends JpaRepository<Anime, Long> {
}
