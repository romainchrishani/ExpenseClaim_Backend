package com.ems.controller;


import com.ems.service.OpdAmountByEmpIdService;
import com.ems.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/getopd")
public class OpdAmountByEmpIdController {

    private OpdAmountByEmpIdService opdAmountByEmpIdService;

    @Autowired
    public OpdAmountByEmpIdController(OpdAmountByEmpIdService opdAmountByEmpIdService) {
        this.opdAmountByEmpIdService = opdAmountByEmpIdService;
    }

    @GetMapping("/{id}")
    public CommonResponse OpdAmountByEmpId(@PathVariable String id){
        return opdAmountByEmpIdService.OpdAmountByEmpId(id);
    }


}
