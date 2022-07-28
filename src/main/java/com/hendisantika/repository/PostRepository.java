package com.hendisantika.repository;

import com.hendisantika.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-many
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 7/28/22
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */
public interface PostRepository extends JpaRepository<Post, Long> {
}
