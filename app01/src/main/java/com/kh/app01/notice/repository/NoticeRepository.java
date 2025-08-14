package com.kh.app01.notice.repository;

import com.kh.app01.notice.entity.NoticeEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor

public class NoticeRepository {

    private final EntityManager em;

    public void insert(NoticeEntity entity) {
        em.persist(entity);
    }

    public List<NoticeEntity> list() {
        return em.createQuery("SELECT n FROM NoticeEntity n", NoticeEntity.class).getResultList();
    }

    public NoticeEntity listOne(long no) {
        return em.find(NoticeEntity.class, no);
    }

    public void deleteOne(NoticeEntity entity) {
        em.remove(entity);
    }
}
