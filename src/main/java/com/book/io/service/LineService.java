package com.book.io.service;

import com.book.io.dto.LineDTO;

import java.util.List;

public interface LineService {

    List<LineDTO> findAllLines();
    LineDTO findLineById(Long lineId);

}
