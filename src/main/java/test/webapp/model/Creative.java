package test.webapp.model;


import javax.persistence.*;

/**
 * @author auryadkina
 * 4/14/2015
 */
@Entity
@Table
public class Creative {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false, length = 255)
    String description;

    @Column(nullable = false, length = 255)
    String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
