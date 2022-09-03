package org.test.xmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.xmen.models.dto.SequenceAdnDTO;
import org.test.xmen.models.entity.SequenceAdn;
import org.test.xmen.service.ISequenceAdnService;

@RestController
@RequestMapping("/mutant")
public class SequenceAdnController {
	
	@Autowired
	private ISequenceAdnService sequenceAdnService;
	
	@RequestMapping("/get")
	public SequenceAdn consultar() {
		return new SequenceAdn();
	}
	
	@PostMapping
	public ResponseEntity<Object> save(@RequestBody SequenceAdnDTO sequenceAdnDTO) {
		boolean isMutant= sequenceAdnService.save(sequenceAdnDTO);
		
		if(isMutant) {
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
	}

}
