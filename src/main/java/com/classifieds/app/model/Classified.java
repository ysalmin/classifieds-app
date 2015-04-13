package com.classifieds.app.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
@Component
@XmlRootElement(name="classified")
@Entity
@Table(name="classified")
public class Classified {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Size(min=4, max=100)
    private String title;

    @NotEmpty
    @Size(min=10, max=500)
    private String description;

    @NotNull
    @Past
    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date created;

    @OneToMany(fetch = FetchType.EAGER)//(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Category> categories = new HashSet<Category>();

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }


}
