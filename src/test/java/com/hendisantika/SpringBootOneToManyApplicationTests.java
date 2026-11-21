package com.hendisantika;

import com.hendisantika.repository.CommentRepository;
import com.hendisantika.repository.PostRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@Testcontainers
@SpringBootTest(
        properties = {
                "management.endpoint.health.show-details=always",
                "spring.datasource.url=jdbc:tc:mysql:9.1.0:///one2Many"
        },
        webEnvironment = RANDOM_PORT
)
class SpringBootOneToManyApplicationTests {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CommentRepository commentRepository;

    @BeforeEach
    void deleteAll() {
        postRepository.deleteAll();
        commentRepository.deleteAll();
    }

    @Test
    void contextLoads() {
        assertThat(postRepository).isNotNull();
        assertThat(commentRepository).isNotNull();
        assertThat(postRepository.count()).isZero();
    }

}
