package Librery.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isnb;
    private String title;
    private Integer publishYear;
    private Integer samples;
    private Integer samplesGived;
    private Integer samplesLeft;
    private Boolean status;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Editorial editorial;

    public Book(String title, Integer year, Integer samples, Integer samplesGived, Author autor, Editorial editorial) {
        this.title = title;
        this.publishYear = year;
        this.samples = samples;
        this.samplesGived = samplesGived;
        this.samplesLeft = samples - samplesGived;
        this.status = true;
        this.author = autor;
        this.editorial = editorial;
    }

    public Book() {
    }

    public Long getIsnb() {
        return isnb;
    }

    public void setIsnb(Long isnb) {
        this.isnb = isnb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public Integer getSamples() {
        return samples;
    }

    public void setSamples(Integer samples) {
        this.samples = samples;
    }

    public Integer getSamplesGived() {
        return samplesGived;
    }

    public void setSamplesGived(Integer samplesGived) {
        this.samplesGived = samplesGived;
    }

    public Integer getSamplesLeft() {
        return samplesLeft;
    }

    public void setSamplesLeft(Integer samplesLeft) {
        this.samplesLeft = samplesLeft;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

}
