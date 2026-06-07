package com.juro.otakustream.controller;

import com.juro.otakustream.entity.Anime;
import com.juro.otakustream.repository.AnimeRepository;
import com.juro.otakustream.service.AnimeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anime")
public class AnimeController {

    private final AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping
    public List<Anime> getAllAnime() {
        return animeService.getAllAnime ();
    }

   @GetMapping("/{id}")
    public Anime getAnimeById(@PathVariable Long id) {
        return animeService.getAnimeById(id);
   }

   @PostMapping
    public Anime createAnime(@RequestBody Anime anime) {
        return animeService.createAnime(anime);
   }

   @PutMapping("/{id}")
    public Anime updateAnime(@PathVariable Long id, @RequestBody Anime anime) {
        return animeService.updateAnime(id, anime);
   }

   @DeleteMapping("/{id}")
    public void deleteAnime(@PathVariable Long id) {
        animeService.deleteAnime(id);
    }

}
