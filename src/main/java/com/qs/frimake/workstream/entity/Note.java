package com.qs.frimake.workstream.entity;

import com.qs.frimake.workstream.commons.jpa.EntityAbstractAuditable;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Getter @Setter
@RequiredArgsConstructor @AllArgsConstructor
public class Note extends EntityAbstractAuditable<Long> {


    /**
     * The content of the note.
     */
    @Column(nullable = false, length = 500)
    private String content;

    /**
     * Specifies if the note is visible only to moderators. If true, only moderators can view this note.
     * If false, it is visible to the user who created it.
     */
    @Column(nullable = false)
    private boolean restrictedToModerators;
    /**
     * The generic foreign key to associate this note with any object like User, Ticket, Activity, etc.
     * Storing the class name of the target entity.
     */
    @Column(nullable = false)
    private String targetEntity;
    /**
     * The identifier of the target entity this note is associated with.
     */
    @Column(nullable = false)
    private String targetEntityId;
}