package com.ems.controller;

import com.ems.dto.ManagerOpdDTO;
import com.ems.service.ManagerOpdService;
import com.ems.util.CommonResponse;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/manageropd")
public class ManagerOpdController {

    private ManagerOpdService managerOpdService;

    public ManagerOpdController(ManagerOpdService managerOpdService) {
        this.managerOpdService = managerOpdService;
    }

    @PostMapping("/")
    public CommonResponse editRr(@RequestBody ManagerOpdDTO managerOpdDTO){

        return managerOpdService.editOpd(managerOpdDTO);
    }

}
