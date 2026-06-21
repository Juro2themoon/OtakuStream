package com.juro.otakustream.controller;

import com.juro.otakustream.entity.Episode;
import com.juro.otakustream.service.EpisodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/episodes")
public class EpisodeController {

    private final EpisodeService episodeService;

    public  EpisodeController(EpisodeService episodeService) {
        this.episodeService = episodeService;
    }

    @GetMapping
    public List<Episode> getAllEpisodes() {
        return episodeService.getAllEpisodes();
    }

}
