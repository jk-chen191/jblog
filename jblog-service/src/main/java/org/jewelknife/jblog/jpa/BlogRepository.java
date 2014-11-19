package org.jewelknife.jblog.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by chen_yingbo on 11/19/14.
 */
@Transactional(readOnly = true)
public interface BlogRepository extends Repository<Blog, Long> {

    List<Blog> findAll();

    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findByCreatedBy(Long createdBy, Pageable pageable);

    Blog findOne(Long id);

    @Transactional
    Blog save(Blog blog);

    @Transactional
    int delete(Blog blog);

}
