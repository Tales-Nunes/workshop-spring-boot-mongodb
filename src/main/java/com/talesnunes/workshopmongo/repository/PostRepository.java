package com.talesnunes.workshopmongo.repository;

import com.talesnunes.workshopmongo.domain.Post;
import com.talesnunes.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
