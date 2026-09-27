package ru.florizzz.courttime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import ru.florizzz.courttime.config.TestContainersConfiguration;

@SpringBootTest
@Import(TestContainersConfiguration.class)
class CourttimeApplicationTests {

	@Test
	void contextLoads() {
	}

}
