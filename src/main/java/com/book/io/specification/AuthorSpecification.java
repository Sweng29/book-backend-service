package com.book.io.specification;

import com.book.io.dto.filter.AuthorFilter;
import com.book.io.entity.Author;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Collection;

public class AuthorSpecification {

    public static Specification<Author> findAll(AuthorFilter authorFilter) {
        return (root, cq, cb) -> {
            final Collection<Predicate> predicates = new ArrayList<>();

            return cb.and(predicates.toArray(new Predicate[predicates.size()]));
        };
    }

}
