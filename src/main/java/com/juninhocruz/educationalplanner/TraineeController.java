package com.juninhocruz.educationalplanner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraineeController {
	private List<Trainee> trainees = new ArrayList<Trainee>();
	
	@GetMapping("/trainees")
	public ResponseEntity<List<Trainee>> getAll() {
		return new ResponseEntity<List<Trainee>>(this.trainees, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/trainees/search")
	public ResponseEntity<List<Trainee>> find(@RequestParam(name="q") String query) {
		List<Trainee> results = new ArrayList<>();
		for (int i = 0; i < this.trainees.size(); i++) {
			if (this.trainees.get(i).getFullName().toLowerCase().contains(query.toLowerCase())) {
				results.add(this.trainees.get(i));
			}
		}
		
		return new ResponseEntity<List<Trainee>>(results, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/trainees")
	public ResponseEntity<Trainee> create(@RequestBody Trainee data) {
		Trainee newTrainee = new Trainee(data.getFirstName(), data.getLastName());
		this.trainees.add(newTrainee);
		return new ResponseEntity<Trainee>(newTrainee, HttpStatus.CREATED);
	}
	
	@GetMapping("/trainees/{traineeId}")
	public ResponseEntity<?> getOne(@PathVariable("traineeId") String id) {
		for (int i = 0; i < this.trainees.size(); i++) {
			if (this.trainees.get(i).getId().compareTo(UUID.fromString(id)) == 0) {
				return new ResponseEntity<Trainee>(this.trainees.get(i), HttpStatus.ACCEPTED);
			}
		}
		
		return new ResponseEntity<String>("Trainee was not found.", HttpStatus.NOT_FOUND);
	}
}
