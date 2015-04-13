package com.classifieds.app.model;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
@Component
@XmlRootElement(name="category")
@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Size(min=4, max=100)
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @XmlInverseReference(mappedBy="category")
    private Classified classified;

    public Category() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classified getClassified() {
        return classified;
    }

    public void setClassified(Classified classified) {
        this.classified = classified;
    }
}
