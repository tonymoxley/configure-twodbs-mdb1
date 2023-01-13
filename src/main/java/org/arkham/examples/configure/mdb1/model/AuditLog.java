package org.arkham.examples.configure.mdb1.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Ing. Jose Antonio Hernandez
 * @version 1.0
 */
@Data
@Entity
@Table(name = "TB01_AUDIT")
public class AuditLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "audit_seq")
    @SequenceGenerator( name = "audit_seq", sequenceName = "TB_AUDIT_SEQ", allocationSize = 1)
    private Integer id;

    @Column(name = "OPERATION")
    private String operation;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "DATE_OPERATION")
    private LocalDateTime dateOperation;

}
