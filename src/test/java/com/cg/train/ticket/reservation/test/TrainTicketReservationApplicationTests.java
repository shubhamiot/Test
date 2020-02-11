package com.cg.train.ticket.reservation.test;

import static org.junit.Assert.assertEquals; 
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.train.ticket.reservation.model.User;
import com.cg.train.ticket.reservation.repository.UserRepository;
import com.cg.train.ticket.reservation.service.UserService;
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class TrainTicketReservationApplicationTests {
//	
//	@Mock
//	UserRepository userRepository;
//
//	@InjectMocks
//	private UserService userService;
//
//	@Test
//	public void showUsersTest() {
//		when(userRepository.findAll()).thenReturn(Stream.of(new User("shubham1", "shubham", "gupta", 22, "123456"),
//				new User("s1", "shubham", "gupta", 22, "123456")).collect(Collectors.toList()));
//		assertEquals(2, userService.showAllUsers().size());
//	}
	
// @SuppressWarnings("unchecked")
//	 
//	 @Test public void getbyunameandpwd() 
//	 {
//		 String username="shubham1";
//		 String password="123456"; 
//		 when(userRepository.findByUsernameAndPassword(username,password)).thenReturn((User) Stream.of(new User("shubham1","shubham","gupta",22,"123456")).collect(Collectors.toList()));
//	 assertEquals(1, ((List<User>) userService.findByUsernameAndPassword(username,password)).size()); 
//	 }
	 
	
}
