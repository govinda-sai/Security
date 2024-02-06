package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class SecurityController {
	@Autowired 
	CategoryRepo categoryRepo; 
	
	@GetMapping("/all") 
	public String getAll() { 
		return "all method";
	}
	
	@GetMapping("/getcategory/{catcode}")
	public void getCategory (@PathVariable("catcode") String catcode) {
		try {
			getCategories(catcode);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public Category getCategories(String catcode) {
		var optionalCategory = categoryRepo.findById(catcode);
		if(!optionalCategory.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "category not found");
		} 
		return optionalCategory.get();
	}
	
	@GetMapping("/admin/hello")
	public String adminHello() {
		return "hello admin";
//		return "hello " + SecurityContextHolder.getContext().getAuthentication().getName();
	}
	
	@PostMapping("/createuser")
//	@PreAuthorize("hasRole('ADMIN')")
	public String createUser() {
		return "user created";
	}
}