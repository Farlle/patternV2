package com.company.task2.application;

public class ClientStatusApplication extends Application{
    @Override
    public void nextValidation(ApplicationProcessor applicationProcessor) {
        super.nextValidation(applicationProcessor);
    }

    @Override
    public void validation(CreditApplication creditApplication) throws Exception {
        var client = creditApplication.getClient();
        if(client.getCreditRating()<5){
            throw new Exception("Низкий рейтинг!");
        }
        if(client.getIncome()<50_000){
            throw new Exception("Низкая платежеспособность!");
        }
        System.out.println("Проверка пройдена!");
        super.validation(creditApplication);
    }
}
