package com.egiants.app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.egiants.model.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoProjectApplicationTests {

	/*@Before
	public void setUp() {
	    Person person=new Person();
	    person.setId("3");
	    person.setAge(21);
	    person.setFirstName("sirisha");
	    person.setLastName("acha");

	 
	    Mockito.when(PersonController.findByName(alex.getName()))
	      .thenReturn(alex);
	}*/
	@Test
	public void contextLoads() {
	}

}
