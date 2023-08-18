package com.project.project;

import com.project.project.domain.repository.MemberRepository;
import org.hibernate.metamodel.model.domain.internal.MapMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;


@SpringBootTest
class ProjectApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void 회원가입() {

    }
}

