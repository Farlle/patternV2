package com.company.task3.notification;

import com.company.task2.client.Client;

public class SmsAndEmailNotification implements Notification {

    private Client client;

    public SmsAndEmailNotification(Client client) {
        this.client = client;
        notifyy();
    }

    @Override
    public void notification() {
        new SmsNotification(client);
        new EmailNotification(client);
    }
}
