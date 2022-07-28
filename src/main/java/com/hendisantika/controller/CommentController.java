package com.hendisantika.controller;

import com.hendisantika.repository.CommentRepository;
import com.hendisantika.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-many
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 7/28/22
 * Time: 10:12
 * To change this template use File | Settings | File Templates.
 */
@RestController
@Slf4j
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository commentRepository;

    private final PostRepository postRepository;
}
