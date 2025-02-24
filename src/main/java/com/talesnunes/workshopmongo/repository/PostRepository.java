package com.talesnunes.workshopmongo.repository;

import com.talesnunes.workshopmongo.domain.Post;
import com.talesnunes.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByTitleContainingIgnoreCase(String text);
}
