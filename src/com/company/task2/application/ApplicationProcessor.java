package com.company.task2.application;

public interface ApplicationProcessor {

    void nextValidation(ApplicationProcessor applicationProcessor);
    void validation(CreditApplication creditApplication) throws Exception;

}
