package com.egiants.app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.egiants.controller.ItemController;
import com.egiants.service.ItemService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoProjectApplicationTests {

	@InjectMocks
	ItemController controller;

	@Mock
	ItemService mockPersonService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

	}

/*	@Test

	public void testGetId() {
		//Hashtable<String, Person> expectedPersons= new Hashtable<String, Person>();
			Item expectedPerson=new Item();
			expectedPerson.setId("1");
			expectedPerson.setAge(25);
			expectedPerson.setFirstName("siri");
			expectedPerson.setLastName("acha");
		//	expectedPersons.put("1", p1);
			
			Person p2=new Person();
			p2.setId("2");
			p2.setAge(24);
			p2.setFirstName("bultu");
			p2.setLastName("nt");
			expectedPersons.put("2", p2);	
			Item receivedPerson=new Item();

			if(controller.getPerson("1")!=null)
			{
				receivedPerson=controller.getPerson("1");
			}
			assertEquals(expectedPerson, receivedPerson);

	}
*/
	@Test
	public void contextLoads() {
	}

}
