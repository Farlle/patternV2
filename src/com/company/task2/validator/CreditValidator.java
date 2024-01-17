package com.company.task2.validator;

import com.company.task2.application.Application;
import com.company.task2.application.CreditApplication;

public class CreditValidator extends Application {
    @Override
    public void validation(CreditApplication creditApplication) throws Exception {
        var credit = creditApplication.getCredit();
        if (credit.getMountPayment() < 1
                || credit.getMountTime() < 1
                || credit.getPercent() < 1){
            throw new Exception("Данные о кредите некорректны!");
        }
        System.out.println("Данные о кредите корректны ");
        super.validation(creditApplication);
    }
}
