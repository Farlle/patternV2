package com.company.task2;

import com.company.task2.application.ClientStatusApplication;
import com.company.task2.application.CreditApplication;
import com.company.task2.client.Client;
import com.company.task2.credit.Credit;
import com.company.task2.validator.ClientValidator;
import com.company.task2.validator.CreditValidator;

public class Main {
    public static void main(String[] args) throws Exception {
        var client = new Client("Dima",2222_1564,60_000,6);
        var credit = new Credit(5_000_000,20,50,10_000);
        var application = new CreditApplication(client, credit);

        var clientValidator = new ClientValidator();
        var creditValidator = new CreditValidator();
        var clientStatusApplication = new ClientStatusApplication();


        clientValidator.nextValidation(creditValidator);
        creditValidator.nextValidation(clientStatusApplication);
        clientValidator.validation(application);

    }
}
