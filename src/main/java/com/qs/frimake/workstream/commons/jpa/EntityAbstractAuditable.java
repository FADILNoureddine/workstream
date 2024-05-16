package com.qs.frimake.workstream.commons.jpa;

import jakarta.persistence.Column;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.time.LocalDateTime;

public class EntityAbstractAuditable<PK extends Serializable> extends CustomAbstractPersistable<PK>{

    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime createdDate;

    @Column(updatable = false, length = 100)
    @CreatedBy
    private String createdBy;
}
