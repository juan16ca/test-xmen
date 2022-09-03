package org.test.xmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.xmen.models.dto.ReportDTO;
import org.test.xmen.service.IReportService;

@RestController
public class ReportController {

	@Autowired
	private IReportService reportService;

	@GetMapping("/stats")
	public ReportDTO getReport() {
		return reportService.getReport();
	}
}
