package com.example.demo;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VechileService {

	private VechileRepository vechileRepo;
	
	@Autowired
	public VechileService(VechileRepository repo) {
		vechileRepo=repo;
	}
	
	public Vechile addVechile(Vechile vechile)
	{
		return vechileRepo.save(vechile);
	}
	
	public List<Vechile> getVechiles()
	{
		return vechileRepo.findAll();
	}
	
	
}
