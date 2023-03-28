package com.dj.demos.photoz.clone;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PhotozController {

    private final Map<String, Photo> db = new HashMap<>() {{
        put("1", new Photo("1", "name.png"));
    }};

    @GetMapping("/")
    public String get() {
        return "Hello World";
    }

    @GetMapping("/photoz")
    public Collection<Photo> getPhotos() {
        return db.values();
    }

    @GetMapping("/photoz/{id}")
    public Photo getPhoto(@PathVariable String id) {
        Photo photo = db.get(id);
        if (photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return photo;
    }
}
