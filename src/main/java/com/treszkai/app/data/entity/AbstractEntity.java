package com.treszkai.app.data.entity;

//import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
//@Audited
public class AbstractEntity {

    @CreatedDate
    @Column(name = "CREATE_TIME")
    private LocalDateTime createTime;

    @Column(name = "LAST_TIME")
    private LocalDateTime lastTime = LocalDateTime.now();

    @CreatedBy
    @Column(name = "CREATE_USER")
    private String createBy;

    @Column(name = "PUBLIC_ID", length = 36)
    private String punlicId = UUID.randomUUID().toString();

    @Version
    private Long version=1L;

    @PrePersist
    private void onPersist(){lastTime = LocalDateTime.now();}

    @PreUpdate
    private void onUpdate(){lastTime = LocalDateTime.now();}

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public AbstractEntity setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    public LocalDateTime getLastTime() {
        return lastTime;
    }

    public AbstractEntity setLastTime(LocalDateTime lastTime) {
        this.lastTime = lastTime;
        return this;
    }

    public String getCreateBy() {
        return createBy;
    }

    public AbstractEntity setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public String getPunlicId() {
        return punlicId;
    }

    public AbstractEntity setPunlicId(String punlicId) {
        this.punlicId = punlicId;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public AbstractEntity setVersion(Long version) {
        this.version = version;
        return this;
    }
}
