package com.company.task2.application;

import com.company.task2.credit.Credit;
import com.company.task2.client.Client;

public class CreditApplication {
    Client client;
    Credit credit;

    CreditApplication(Client client, Credit credit){
        this.client = client;
        this.credit = credit;
    }

    public Client getClient() {
        return client;
    }

    public Credit getCredit() {
        return credit;
    }
}
