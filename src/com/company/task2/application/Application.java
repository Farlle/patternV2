package com.company.task2.application;

public abstract class Application implements ApplicationProcessor {

    ApplicationProcessor applicationProcessor;

    @Override
    public void nextValidation(ApplicationProcessor applicationProcessor) {
        this.applicationProcessor = applicationProcessor;
    }

    @Override
    public void validation(CreditApplication creditApplication) throws Exception {
        if (applicationProcessor!=null){
            applicationProcessor.validation(creditApplication);
        }
    }
}
