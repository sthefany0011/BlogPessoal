package org.generation.BlogPs.Controller;

import java.util.List;

import org.generation.BlogPs.model.PostagemModel;
import org.generation.BlogPs.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("postagem")
@CrossOrigin ("*")
public class PostagemController {

	@Autowired
	private PostagemRepository repositoty;
	
	
	public ResponseEntity<List<PostagemModel>>getAll(){
		return ResponseEntity.ok(repositoty.findAll());

	}
}
