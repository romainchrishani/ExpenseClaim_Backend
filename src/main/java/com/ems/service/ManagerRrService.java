package com.ems.service;

import com.ems.dto.ManagerRrDTO;
import com.ems.entity.Rr;
import com.ems.repository.RrRepository;
import com.ems.util.CommonResponse;
import org.springframework.stereotype.Service;

@Service
public class ManagerRrService {


    private RrService rrService;
    private RrRepository rrRepository;

    public ManagerRrService(RrService rrService,RrRepository rrRepository) {
        this.rrService = rrService;
        this.rrRepository = rrRepository;
    }

    public CommonResponse editRr(ManagerRrDTO managerRrDTO) {

        CommonResponse commonResponse = new CommonResponse();

        try {

            Rr rr = rrService.findById(managerRrDTO.getRrId());

            rr.setSta_tus(managerRrDTO.getSta_tus());
            rrRepository.save(rr);
            commonResponse.setStatus(true);

        }catch (Exception e){
            System.out.println(e);
        }

        return commonResponse;

    }
}
