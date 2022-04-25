package com.apirest.webflux.repository;

import com.apirest.webflux.models.Playlist;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {
    
}
