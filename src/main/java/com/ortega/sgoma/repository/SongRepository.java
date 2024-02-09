package com.ortega.sgoma.repository;


import com.ortega.sgoma.models.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SongRepository extends MongoRepository<Song, UUID> {

}
