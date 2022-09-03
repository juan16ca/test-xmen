package org.test.xmen;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.test.xmen.controller.ReportController;
import org.test.xmen.models.dto.ReportDTO;

@SpringBootTest
class ReportControllerTests {

	@Autowired
	private ReportController reportController;

	@Test
	void validateController() throws Exception {
		assertThat(reportController).isNotNull();
	}

	@Test
	void validateResult() throws Exception {
		ReportDTO result = reportController.getReport();
		assertThat(result.getTotalHumans()).isEqualTo(47);
	}

}
