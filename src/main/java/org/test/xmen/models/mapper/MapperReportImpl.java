package org.test.xmen.models.mapper;

import org.springframework.stereotype.Component;
import org.test.xmen.models.dto.ReportDTO;
import org.test.xmen.models.entity.Report;

@Component
public class MapperReportImpl implements IMapperReport {

	@Override
	public ReportDTO reportToReportDTO(Report report) {

		ReportDTO reportDTO = new ReportDTO();
		reportDTO.setTotalMutants(report.getTotalMutants());
		reportDTO.setTotalHumans(report.getTotalHumans());
		reportDTO.setRatio(report.getRatio());

		return reportDTO;
	}

}
