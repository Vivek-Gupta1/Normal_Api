package Vivek.Demo.RestController;

import java.net.http.HttpClient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {
	@PostMapping("/msg")
	public String getMsg() {
		String str = "How are you";
		return str;
	}
	@PostMapping("/save")
	// for change status code 200 to 201
	public ResponseEntity<String>SaveMsg(){
		String str = "Bye Bye";
		return new ResponseEntity<String>(str,HttpStatus.CREATED);
		
	}

	@GetMapping("/welcome")
	public String getWelcome() {
		String str = "Welcome to RestApi.....!";
		return str;
		
	}
}
