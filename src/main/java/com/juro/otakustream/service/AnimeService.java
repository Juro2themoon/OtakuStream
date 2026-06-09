package com.juro.otakustream.service;

import com.juro.otakustream.entity.Anime;
import com.juro.otakustream.exception.AnimeNotFoundException;
import com.juro.otakustream.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    public List<Anime> getAllAnime() {
        return animeRepository.findAll();
    }

    public Anime getAnimeById(Long id) {
        return animeRepository.findById(id)
                .orElseThrow(() ->
                        new AnimeNotFoundException("Anime with id " + id + " not found"));
    }

    public Anime createAnime(Anime anime) {
        return animeRepository.save(anime);
    }

    public Anime updateAnime (Long id, Anime updatedAnime) {
        Anime anime = animeRepository.findById(id)
                .orElseThrow();

        anime.setTitle(updatedAnime.getTitle());
        anime.setDescription(updatedAnime.getDescription());

        return animeRepository.save(anime);
    }

    public void deleteAnime (Long id) {
        Anime anime = animeRepository.findById(id)
                .orElseThrow();
        animeRepository.delete(anime);
    }

    public List<Anime> searchAnimeByTitle(String title) {
        return animeRepository.findByTitleContainingIgnoreCase(title);
    }
}
