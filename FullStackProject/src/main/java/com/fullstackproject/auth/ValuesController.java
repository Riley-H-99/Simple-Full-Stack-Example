package com.fullstackproject.auth;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/values")
public class ValuesController {
	List<String> names = new ArrayList<String>();
	
	@GetMapping()
	public ResponseEntity<List<String>> getNames() {
	    return ResponseEntity.ok(names);
	}
  
	@PostMapping()
	public ResponseEntity<String> addNames(@RequestBody String name) {
		names.add(name);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping()
	public ResponseEntity<String> deleteName(@RequestBody String name) {
		if (names.contains(name)) {
			names.remove(name);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}