package com.book.io.specification;

import com.book.io.dto.filter.BookFilter;
import com.book.io.entity.Book;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Collection;

public class BookSpecification {

    public static Specification<Book> findAll(BookFilter bookFilter) {
        return (root, cq, cb) -> {
            final Collection<Predicate> predicates = new ArrayList<>();

            return cb.and(predicates.toArray(new Predicate[predicates.size()]));
        };
    }

}
