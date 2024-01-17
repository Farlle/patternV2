package com.company.task3.notification;

import com.company.task2.client.Client;

public class SmsNotification implements Notification {

    private Client client;

    public SmsNotification(Client client) {
        this.client = client;
        notification();
    }

    @Override
    public void notification() {
        System.out.println("Клиенту " + client.getName() + " отправлена анкета по смс ");
    }
}
