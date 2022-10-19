package io.corretto.board.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class ArticleDto {
    private Integer id;
    private Integer board_id;
    private String title;
    private String content;
    private Integer vew_count;
    private LocalDateTime created_datetime;

    public ArticleDto() {
    }

    public ArticleDto(Integer board_id, String title, String content) {
        this.board_id = board_id;
        this.title = title;
        this.content = content;
    }

    public ArticleDto(Integer board_id, String title, String content, LocalDateTime date) {
        this.board_id = board_id;
        this.title = title;
        this.content = content;
        this.created_datetime = created_datetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBoard_id() {
        return board_id;
    }

    public void setBoard_id(Integer board_id) {
        this.board_id = board_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getVew_count() {
        return vew_count;
    }

    public void setVew_count(Integer vew_count) {
        this.vew_count = vew_count;
    }

    public LocalDateTime getCreated_datetime() {
        return created_datetime;
    }

    public void setCreated_datetime(LocalDateTime created_datetime) {
        this.created_datetime = created_datetime;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "id=" + id +
                ", board_id=" + board_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", vew_count=" + vew_count +
                ", created_datetime=" + created_datetime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleDto that = (ArticleDto) o;
        return id.equals(that.id) && board_id.equals(that.board_id) && title.equals(that.title) && content.equals(that.content) && Objects.equals(vew_count, that.vew_count) && Objects.equals(created_datetime, that.created_datetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, board_id, title, content, vew_count, created_datetime);
    }

}
