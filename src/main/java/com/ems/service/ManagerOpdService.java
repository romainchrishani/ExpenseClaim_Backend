package com.ems.service;


import com.ems.dto.ManagerOpdDTO;
import com.ems.entity.Opd;
import com.ems.repository.OpdRepository;
import com.ems.util.CommonResponse;
import org.springframework.stereotype.Service;

@Service
public class ManagerOpdService {


 private OpdService opdService;
 private OpdRepository opdRepository;

    public ManagerOpdService(OpdService opdService, OpdRepository opdRepository) {
        this.opdService = opdService;
        this.opdRepository = opdRepository;
    }


    public CommonResponse editOpd(ManagerOpdDTO managerOpdDTO) {

        CommonResponse commonResponse = new CommonResponse();

        try {

            Opd opd = opdService.findById(managerOpdDTO.getOpdId());

            opd.setSta_tus(managerOpdDTO.getSta_tus());
            opdRepository.save(opd);
            commonResponse.setStatus(true);

        }catch (Exception e){
            System.out.println(e);
        }

        return commonResponse;
    }
}
