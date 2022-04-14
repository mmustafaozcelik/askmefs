package com.mmustafa.askme.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmustafa.askme.dto.UpdateUserRequest;
import com.mmustafa.askme.dto.UserDto;
import com.mmustafa.askme.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class userController {
	
	private UserService userService;
	
	@GetMapping("/getall")
	public ResponseEntity<List<UserDto>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getBeyId(@PathVariable("id") Long id){
		return ResponseEntity.ok(userService.getUserById(id));
	}
	
	@PostMapping("/create")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		return ResponseEntity.ok(userService.createUser(userDto));	
	}
	
	@PutMapping("/update/{id}")
	 public ResponseEntity<UserDto> updateUser(
	            @PathVariable Long id,
	            @RequestBody UpdateUserRequest updateUserRequest){
	        return ResponseEntity.ok(userService.updateUser(id , updateUserRequest));
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
		
	}
	
	
	
}
