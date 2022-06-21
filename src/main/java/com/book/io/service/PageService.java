package com.book.io.service;

import com.book.io.dto.PageDTO;

import java.util.List;

public interface PageService {

    List<PageDTO> findAllPages();
    PageDTO findPageById(Long pageId);

}
