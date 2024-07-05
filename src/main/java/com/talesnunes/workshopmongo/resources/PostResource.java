package com.talesnunes.workshopmongo.resources;

import com.talesnunes.workshopmongo.domain.Post;
import com.talesnunes.workshopmongo.domain.User;
import com.talesnunes.workshopmongo.dto.UserDTO;
import com.talesnunes.workshopmongo.services.PostService;
import com.talesnunes.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value= "{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
