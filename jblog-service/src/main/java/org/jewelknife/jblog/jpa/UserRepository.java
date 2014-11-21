package org.jewelknife.jblog.jpa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chen_yingbo on 11/14/14.
 */
@Transactional(readOnly = true)
public interface UserRepository extends Repository<User, Long> {

    User findByUsername(String username);

//    @Query("select c from user c where c.username = :username and c.password = MD5(:password)")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Transactional
    User save(User user);

    User findOne(Long id);

}
