package com.company.ordermanagement.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "ORDERMANAGEMENT_DOCUMENT")
@Entity(name = "ordermanagement_Document")
@NamePattern("%s|name")
public class Document extends StandardEntity {
    private static final long serialVersionUID = 6181347287232765664L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FILE_ID")
    private FileDescriptor file;

    @Column(name = "TYPE_")
    private String type;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DocumentType getType() {
        return type == null ? null : DocumentType.fromId(type);
    }

    public void setType(DocumentType type) {
        this.type = type == null ? null : type.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileDescriptor getFile() {
        return file;
    }

    public void setFile(FileDescriptor file) {
        this.file = file;
    }
}