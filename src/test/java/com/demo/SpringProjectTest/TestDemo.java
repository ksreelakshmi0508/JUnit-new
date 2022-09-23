package com.demo.SpringProjectTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(classes=SpringProjectTestApplication.class,webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestDemo {
	
	@Autowired
	private TestRestTemplate template;
	
	@Test
	public void demoTest_ok() throws Exception{
		ResponseEntity<String> response = template.getForEntity("/hello", String.class);
        assertThat(response.getBody()).isEqualTo("This is my first SpringBoot Application for JUnit Testing");
	}

}
