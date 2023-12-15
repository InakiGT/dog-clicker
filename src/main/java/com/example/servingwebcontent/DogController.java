package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DogController {

	@GetMapping("/dog")
	public String greeting(
        @RequestParam(name="id", required=false, defaultValue="0") String id, Model model
    ) {
		Dogs dogs = Dogs.getInstance();
        dogs.SetDog(Integer.parseInt(id));
        model.addAttribute("dogs", dogs);
		return "dog";
	}

    @PutMapping("/dog")
    public String update(
        @RequestParam(name="id", required=false, defaultValue="0") String id, Model model
    ) {
        Dogs dogs = Dogs.getInstance();
        dogs.dogs[Integer.parseInt(id)].IncCount();
        
        return "dog";
    }
}