package org.jewelknife.jblog.jpa;

import org.springframework.data.repository.Repository;

/**
 * Created by chen_yingbo on 11/14/14.
 */
public interface UserRepository extends Repository<User, Long> {

    User findByUsername(String username);

    User save(User user);

    User findOne(Long id);

}
