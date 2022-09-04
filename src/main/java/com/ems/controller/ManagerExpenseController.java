package com.ems.controller;

import com.ems.dto.ManagerExpenseDTO;
import com.ems.dto.ManagerRrDTO;
import com.ems.service.ManagerExpenseService;
import com.ems.util.CommonResponse;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/managerexpense")
public class ManagerExpenseController {

 private ManagerExpenseService managerExpenseService;

    public ManagerExpenseController(ManagerExpenseService managerExpenseService) {
        this.managerExpenseService = managerExpenseService;
    }

    @PostMapping("/")
    public CommonResponse editExpense(@RequestBody ManagerExpenseDTO managerExpenseDTO){

        return managerExpenseService.editExpense(managerExpenseDTO);
    }

}
