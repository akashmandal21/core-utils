package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "BROKER_DOCUMENT")
public class BrokerDocument implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "IMG_URL", nullable = false)
    private String imgUrl;

    @Column(name = "TYPE", nullable = false)
    private String TYPE;

    @Column(name = "BROKER_ID")
    private Integer brokerId;

    @Column(name = "NAME_ON_DOCUMENT")
    private String nameOnDocument = "";

    @Column(name = "DOCUMENT_ID")
    private String documentId = "";

    
}