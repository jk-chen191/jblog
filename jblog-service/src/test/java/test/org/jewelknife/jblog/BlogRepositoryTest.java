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

import org.jewelknife.jblog.jpa.Blog;
import org.jewelknife.jblog.jpa.BlogRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;

/**
 * Integration test for the manual implementation ({@link org.jewelknife.jblog.jpa.UserRepository}) of the {@link org.jewelknife.jblog.jpa.UserRepository}
 * interface.
 * 
 * @author Oliver Gierke
 */
@ContextConfiguration(value = "classpath:application-jpa-context.xml")
public class BlogRepositoryTest extends AbstractIntegrationTest {

	@Autowired
    BlogRepository blogRepository;


    @Test
    public void findByCreatedByTest() {
        blogRepository.save(new Blog("test 1", "content 1", (long) 1, new Date()));
        blogRepository.save(new Blog("test 2", "content 2", (long) 1, new Date()));
//        Page<Blog> page = blogRepository.findByCreatedBy(new Long(1), new PageRequest(1, 10));
        Page<Blog> page = blogRepository.findAll(new PageRequest(0, 10));
        System.out.println(page.getContent().size());
    }

}
