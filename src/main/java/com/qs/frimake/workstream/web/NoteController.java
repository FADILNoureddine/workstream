package com.qs.frimake.workstream.web;

import com.qs.frimake.workstream.entity.Note;
import com.qs.frimake.workstream.service.NoteService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor @AllArgsConstructor
@RequestMapping("/api/v1/notes")
public class NoteController {

    private final NoteService noteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Note create(@RequestBody Note note) {
        return noteService.create(note);
    }
}
