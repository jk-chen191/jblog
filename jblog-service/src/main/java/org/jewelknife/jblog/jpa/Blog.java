package org.jewelknife.jblog.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by chen_yingbo on 11/19/14.
 */
@Entity(name="post")
public class Blog extends AbstractEntity {

    private String title;
    private String content;
    @Column(name="created_by")
    private Long createdBy;
    @Column(name="created_at")
    private Date createdAt;

    public Blog() {
    }

    public Blog(String title, String content, Long createdBy, Date createdAt) {
        this.title = title;
        this.content = content;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
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
//
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
