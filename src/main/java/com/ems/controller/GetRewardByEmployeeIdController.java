package com.ems.controller;

import com.ems.service.GetRewardByEmployeeIdService;
import com.ems.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/getreward")
public class GetRewardByEmployeeIdController {

    private GetRewardByEmployeeIdService getRewardByEmployeeIdService;

    @Autowired
    public GetRewardByEmployeeIdController(GetRewardByEmployeeIdService getRewardByEmployeeIdService) {
        this.getRewardByEmployeeIdService = getRewardByEmployeeIdService;
    }

    @GetMapping("/{id}")
    public CommonResponse GetRewardByEmployeeId(@PathVariable String id){
        return  getRewardByEmployeeIdService.GetRewardByEmployeeId(id);

    }


}
