package  com.pro.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pro.restapi.entity.Devop;
import com.pro.restapi.repository.DevopRepository;

@RestController
@CrossOrigin("http://localhost:3001")
public class DevopControler {
	
	@Autowired
	DevopRepository repo;
 //get all the data about the enquiry for study
	//localhost:8080/Devops
	@GetMapping("/Devops")
	public List<Devop> getAllDevops(){
		List<Devop> devops = repo.findAll();
		return devops;
	}
	//localhost:8080/Devops/1
	@GetMapping("/Devops/{id}")
	public Devop getDevop(@PathVariable int id) {
		Devop devop = repo.findById(id).get();
		return devop;
	}
	@PostMapping("/Devops/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody Devop devops) {
		repo.save(devops);
		
	}
	@PutMapping("/Devops/update/{id}")
	public Devop updateDevops(@PathVariable int id){
		Devop devop = repo.findById(id).get();
		devop.setName("poonum");
		devop.setMail("dev_dam@gmail.com");
		repo.save(devop);
		return devop;
		
	}
	@DeleteMapping("/Devops/delete/{id}")
	public void removeDevop(@PathVariable int id) {
		Devop devop = repo.findById(id).get();
		repo.delete(devop);
	}
}
