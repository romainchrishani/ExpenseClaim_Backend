package com.ems.service;

import com.ems.dto.ManagerExpenseDTO;
import com.ems.entity.Expense;
import com.ems.entity.Rr;
import com.ems.repository.ExpenseRepository;
import com.ems.util.CommonResponse;
import org.springframework.stereotype.Service;

@Service
public class ManagerExpenseService  {

    private ExpenseService expenseService;
    private ExpenseRepository expenseRepository;

    public ManagerExpenseService(ExpenseService expenseService, ExpenseRepository expenseRepository) {
        this.expenseService = expenseService;
        this.expenseRepository = expenseRepository;
    }


    public CommonResponse editExpense(ManagerExpenseDTO managerExpenseDTO) {

        CommonResponse commonResponse = new CommonResponse();

        try {

            Expense expense = expenseService.findById(managerExpenseDTO.getExpenseId());

            expense.setSta_tus(managerExpenseDTO.getSta_tus());
            expenseRepository.save(expense);
            commonResponse.setStatus(true);

        }catch (Exception e){
            System.out.println(e);
        }

        return commonResponse;

    }
}
