package com.book.io.specification;

import com.book.io.dto.filter.LineFilter;
import com.book.io.dto.filter.PageFilter;
import com.book.io.entity.Line;
import com.book.io.entity.Page;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Collection;

public class PageSpecification {

    public static Specification<Page> findAll(PageFilter pageFilter) {
        return (root, cq, cb) -> {
            final Collection<Predicate> predicates = new ArrayList<>();

            return cb.and(predicates.toArray(new Predicate[predicates.size()]));
        };
    }

}
