package com.company.task3;

import com.company.task2.client.Client;
import com.company.task3.notification.EmailNotification;
import com.company.task3.notification.SmsAndEmailNotification;
import com.company.task3.notification.SmsNotification;

public class Main {
    public static void main(String[] args) {
        var client = new Client("Oleg",2222_4444,50_000,5 );

        var emailNotification = new EmailNotification(client);
        var smsNotification = new SmsNotification(client);
        var smsAndEmailNotification = new SmsAndEmailNotification(client);
    }
}
