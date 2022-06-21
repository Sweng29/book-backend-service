package com.book.io.service.impl;

import com.book.io.dto.LineDTO;
import com.book.io.repository.LineRepository;
import com.book.io.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineServiceImpl implements LineService {

    @Autowired
    private LineRepository lineRepository;

    @Override
    public List<LineDTO> findAllLines() {
        return null;
    }

    @Override
    public LineDTO findLineById(Long lineId) {
        return null;
    }
}
