package org.test.xmen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.xmen.models.dto.ReportDTO;
import org.test.xmen.models.mapper.IMapperReport;
import org.test.xmen.repository.IReportRepository;

@Service
public class ReportServiceImpl implements IReportService {

	@Autowired
	private IReportRepository repository;

	@Autowired
	private IMapperReport mapper;

	@Transactional(readOnly = true)
	@Override
	public ReportDTO getReport() {
		return mapper.reportToReportDTO(repository.getReport());
	}

}
