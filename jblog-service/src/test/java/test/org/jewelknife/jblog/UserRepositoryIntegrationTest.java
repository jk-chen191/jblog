/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.org.jewelknife.jblog;

import org.jewelknife.jblog.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Integration test for the manual implementation ({@link org.jewelknife.jblog.jpa.UserRepository}) of the {@link org.jewelknife.jblog.jpa.UserRepository}
 * interface.
 * 
 * @author Oliver Gierke
 */
@ContextConfiguration
public class UserRepositoryIntegrationTest extends AbstractIntegrationTest {

	@Autowired
    UserRepository userRepository;



//	@Test
//	public void insertsNewCustomerCorrectly() {
//
//		User user = new User("Alicia", "Keys", "jewelnife@qq.com");
//        user = userRepository.save(user);
//
//		assertThat(user.getId(), is(notNullValue()));
//	}
//
//	@Test
//	public void updatesCustomerCorrectly() {
//
//        User dave = userRepository.findByUsername("Alicia");
//		assertThat(dave, is(notNullValue()));
//
//		dave.setUsername("Miller");
//		dave = userRepository.save(dave);
//
//        User reference = userRepository.findByUsername(dave.getUsername());
//		assertThat(reference.getUsername(), is(dave.getUsername()));
//	}
}
