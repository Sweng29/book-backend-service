package com.book.io.service.impl;

import com.book.io.dto.PageDTO;
import com.book.io.repository.PageRepository;
import com.book.io.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageServiceImpl implements PageService {

    @Autowired
    private PageRepository pageRepository;

    @Override
    public List<PageDTO> findAllPages() {
        return null;
    }

    @Override
    public PageDTO findPageById(Long pageId) {
        return null;
    }
}
