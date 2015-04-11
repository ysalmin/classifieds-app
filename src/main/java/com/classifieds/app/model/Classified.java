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

    @OneToMany//(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Category> categories = new HashSet<Category>();

    @NotNull
    @Past
    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date created;
}
