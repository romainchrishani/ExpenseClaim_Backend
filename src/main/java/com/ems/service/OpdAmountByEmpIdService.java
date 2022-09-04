package com.ems.service;


import com.ems.dto.OpdAmountByEmpIdDTO;
import com.ems.repository.OpdAmountRepository;
import com.ems.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class OpdAmountByEmpIdService {

    private OpdAmountRepository opdAmountRepository;

    @Autowired
    public OpdAmountByEmpIdService(OpdAmountRepository opdAmountRepository) {
        this.opdAmountRepository = opdAmountRepository;
    }

    public CommonResponse OpdAmountByEmpId(String id) {

        CommonResponse commonResponse = new CommonResponse();

        OpdAmountByEmpIdDTO opdamount = new OpdAmountByEmpIdDTO();

        opdamount.setAmount(String.valueOf(opdAmountRepository.GetAmountByEmployeeId(Long.valueOf(id))));
        opdamount.setExpireDate(String.valueOf(opdAmountRepository.GetExpireDateByEmployeeId(Long.valueOf(id))));

        commonResponse.setPayload(Collections.singletonList(opdamount));
        commonResponse.setStatus(true);
        return commonResponse;
    }
}
