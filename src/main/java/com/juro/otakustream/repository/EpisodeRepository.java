package com.juro.otakustream.repository;

import com.juro.otakustream.entity.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeRepository
    extends JpaRepository<Episode, Long> {

    List<Episode> findByAnimeId(Long animeId);

    Long id(Long id);
}
