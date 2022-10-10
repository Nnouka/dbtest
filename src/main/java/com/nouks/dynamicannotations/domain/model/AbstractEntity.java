package com.nouks.dynamicannotations.domain.model;

import javax.persistence.*;

@Entity
public class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Version
    protected Long version;
}
