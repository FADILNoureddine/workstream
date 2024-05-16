package com.qs.frimake.workstream.dao;

import com.qs.frimake.workstream.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NoteRepository extends JpaRepository<Note, Long> { }
