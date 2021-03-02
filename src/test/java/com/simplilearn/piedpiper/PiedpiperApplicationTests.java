package com.simplilearn.piedpiper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

@SpringBootTest
class PiedpiperApplicationTests {

	private Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }

	@Test
	void contextLoads() {
	}

}
