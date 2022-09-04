package com.ems.service;

import com.ems.dto.RewardByEmpIdDTO;
import com.ems.repository.EmployeeRepository;
import com.ems.repository.RewardRepository;
import com.ems.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class GetRewardByEmployeeIdService {

    private RewardRepository rewardRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public GetRewardByEmployeeIdService(RewardRepository rewardRepository,EmployeeRepository employeeRepository) {
        this.rewardRepository = rewardRepository;
        this.employeeRepository = employeeRepository;
    }


    public CommonResponse GetRewardByEmployeeId(String id) {

        CommonResponse commonResponse = new CommonResponse();

      //  commonResponse.setPayload(Collections.singletonList(rewardRepository.GetRewardByEmployeeId(Long.valueOf(id))));

        RewardByEmpIdDTO reward = new RewardByEmpIdDTO();

        reward.setAmount(String.valueOf(rewardRepository.GetRewardByEmployeeId(Long.valueOf(id))));
        reward.setAddedDate(String.valueOf(rewardRepository.GetAddedDateByEmployeeId(Long.valueOf(id))));
        reward.setExpireDate(String.valueOf(rewardRepository.GetExpireDateByEmployeeId(Long.valueOf(id))));
        commonResponse.setPayload(Collections.singletonList(reward));

        commonResponse.setStatus(true);

        return commonResponse;
    }
}
