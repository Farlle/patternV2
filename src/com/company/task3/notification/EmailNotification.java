package com.company.task3.notification;

import com.company.task2.client.Client;

public class EmailNotification implements Notification {
    private Client client;

    public EmailNotification(Client client){
        this.client = client;
        notifyy();
    }

    @Override
    public void notification() {
        System.out.println("Клиенту " + client.getName() + " отправлена анкета по почте");
    }
}
