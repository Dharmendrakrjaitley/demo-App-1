package com.example.demo;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VechileController {

	
	private VechileService vechileService;
	
	@Autowired
	public VechileController(VechileService service)
	{
		vechileService=service;
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<Vechile> addVechile(@RequestBody Vechile vechile)
	{
		Vechile result=vechileService.addVechile(vechile);
		return new ResponseEntity<Vechile>(result,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Vechile>> getVechile()
	{
		List<Vechile> result=vechileService.getVechiles();
		return new ResponseEntity<List<Vechile>>(result,HttpStatus.OK);
	}
	
	
}
