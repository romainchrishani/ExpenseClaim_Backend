package com.ems.controller;


import com.ems.dto.ManagerRrDTO;
import com.ems.service.ManagerRrService;
import com.ems.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/managerrr")
public class ManagerRrController {

    private ManagerRrService managerRrService;

    public ManagerRrController(ManagerRrService managerRrService) {
        this.managerRrService = managerRrService;
    }

    @PostMapping("/")
    public CommonResponse editRr(@RequestBody ManagerRrDTO managerRrDTO){

        return managerRrService.editRr(managerRrDTO);
    }


}
