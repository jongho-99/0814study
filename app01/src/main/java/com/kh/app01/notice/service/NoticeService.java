package com.kh.app01.notice.service;

import com.kh.app01.notice.entity.NoticeEntity;
import com.kh.app01.notice.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public void insert(NoticeEntity entity) {
        noticeRepository.insert(entity);
    }

    public List<NoticeEntity> list() {
        return noticeRepository.list();
    }

    public NoticeEntity listOne(long no) {
        return noticeRepository.listOne(no);
    }

    public void deleteOne(long no) {
        NoticeEntity entity = noticeRepository.listOne(no);
        noticeRepository.deleteOne(entity);
    }
}
