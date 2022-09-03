package org.test.xmen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.xmen.component.MutantProcess;
import org.test.xmen.models.dto.SequenceAdnDTO;
import org.test.xmen.models.entity.SequenceAdn;
import org.test.xmen.models.mapper.IMapperSequenceAdn;
import org.test.xmen.repository.ISequenceAdnRepository;

@Service
public class SequenceAdnServiceImpl implements ISequenceAdnService {

	@Autowired
	private ISequenceAdnRepository iSequenceAdnRepository;

	@Autowired
	private MutantProcess mutanProcess;

	@Autowired
	private IMapperSequenceAdn mapper;

	@Transactional
	@Override
	public boolean save(SequenceAdnDTO sequenceAdnDTO) {

		boolean isMutant = mutanProcess.isMutant(sequenceAdnDTO.getAdn());

		SequenceAdn sequenceAdn = mapper.sequenceAdnDTOToSequenceAdn(sequenceAdnDTO);

		sequenceAdn.setHumantype(isMutant ? "MUTANT" : "HUMAN");

		iSequenceAdnRepository.save(sequenceAdn);

		return isMutant;
	}

}
