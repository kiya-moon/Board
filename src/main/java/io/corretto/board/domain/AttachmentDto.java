package io.corretto.board.domain;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class AttachmentDto {
    private Integer id;
    private Integer article_id;
    private String location;
    private LocalDateTime created_datetime;

    public AttachmentDto() {
    }

    public AttachmentDto(Integer article_id, String location) {
        this.article_id = article_id;
        this.location = location;
    }

    public AttachmentDto(Integer article_id, String location, LocalDateTime created_datetime) {
        this.article_id = article_id;
        this.location = location;
        this.created_datetime = created_datetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getCreated_datetime() {
        return created_datetime;
    }

    public void setCreated_datetime(LocalDateTime created_datetime) {
        this.created_datetime = created_datetime;
    }

    @Override
    public String toString() {
        return "AttachmentDto{" +
                "id=" + id +
                ", article_id=" + article_id +
                ", location='" + location + '\'' +
                ", created_datetime=" + created_datetime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttachmentDto that = (AttachmentDto) o;
        return id.equals(that.id) && article_id.equals(that.article_id) && location.equals(that.location) && Objects.equals(created_datetime, that.created_datetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, article_id, location, created_datetime);
    }
}
