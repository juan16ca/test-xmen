package org.test.xmen;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.test.xmen.controller.SequenceAdnController;
import org.test.xmen.models.dto.SequenceAdnDTO;
import org.test.xmen.service.ISequenceAdnService;

@SpringBootTest
class SequenceAdnControllerTests {

	@InjectMocks
	private SequenceAdnController sequenceAdnController;

	@Mock
	ISequenceAdnService sequenceAdnService;

	@Test
	void validate() throws Exception {
		assertThat(sequenceAdnController).isNotNull();
	}

	@Test
	void testAddXmen() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		when(sequenceAdnService.save(any(SequenceAdnDTO.class))).thenReturn(true);

		SequenceAdnDTO sequenceAdnDTO = new SequenceAdnDTO();
		String adn[] = new String[] { "ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };
		sequenceAdnDTO.setAdn(adn);
		
		ResponseEntity<Object> responseEntity = sequenceAdnController.save(sequenceAdnDTO);
		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
	}

}
