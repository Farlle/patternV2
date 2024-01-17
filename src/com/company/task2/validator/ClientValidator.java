package com.company.task2.validator;

import com.company.task2.application.Application;
import com.company.task2.application.CreditApplication;

public class ClientValidator extends Application {

    @Override
    public void validation(CreditApplication creditApplication) throws Exception {
        var client = creditApplication.getClient();
        if (client.getName().isEmpty()||client.getPassportNum()<0) {
            throw new Exception("Данные о клиенте заполнены неправильно!");
        }
        System.out.println("Клиент корректен!");
        super.validation(creditApplication);

    }
}
