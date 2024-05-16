package com.qs.frimake.workstream.service;

import com.qs.frimake.workstream.dao.NoteRepository;
import com.qs.frimake.workstream.entity.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;

    public Note create(Note note) {
        return noteRepository.save(note);
    }
}
