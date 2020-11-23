package com.example.githubci;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {
        Greeting.class
})
class GreetingTest {

    @Test
    void Should_Greet_When_GiveName(){
        assertThat(Greeting.greet("zak"))
                .isEqualTo("Hello Zak");

    }
}
