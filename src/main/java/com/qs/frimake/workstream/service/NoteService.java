package com.qs.frimake.workstream.service;

import com.qs.frimake.workstream.dao.NoteRepository;
import com.qs.frimake.workstream.entity.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note create(Note note) {
        return noteRepository.save(note);
    }

    public Note update(Note note) {
        return noteRepository.save(note);
    }

    public Note delete(Note note) {
        return noteRepository.save(note);
    }

    public Note find(Note note) {
        return noteRepository.save(note);
    }
}
