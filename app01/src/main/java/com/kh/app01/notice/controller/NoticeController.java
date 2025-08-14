package com.kh.app01.notice.controller;

import com.kh.app01.notice.entity.NoticeEntity;
import com.kh.app01.notice.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/notice")
public class NoticeController {

    private final NoticeService noticeService;

    @PostMapping
    public void insert(@RequestBody NoticeEntity entity) {
        noticeService.insert(entity);
    }

    @GetMapping
    private List<NoticeEntity> list() {
        return noticeService.list();
    }

    @GetMapping("{no}")
    private NoticeEntity listOne(@PathVariable long no) {
        return noticeService.listOne(no);
    }

    @DeleteMapping("delete/{no}")
    private void deleteOne(@PathVariable long no) {
        noticeService.deleteOne(no);
    }

//    @PutMapping
//    private void updateBoard(@RequestBody )
}
