package main;

import baimot_singleton.DatabaseConnection;
import baihai_factory.Notification;
import baihai_factory.NotificationFactory;
import baiba_facade.*;
import baibon_strategy.*;
import bainam_message.*;

public class main {
    public static void main(String[] args) {

        // ===== Bài 1: Singleton =====
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db1.connect();
        System.out.println("db1 == db2 ? " + (db1 == db2));

        System.out.println();

        // ===== Bài 2: Factory =====
        Notification sms = NotificationFactory.createNotification("SMS");
        Notification email = NotificationFactory.createNotification("EMAIL");
        Notification push = NotificationFactory.createNotification("PUSH");
        sms.notifyUser();
        email.notifyUser();
        push.notifyUser();

        System.out.println();

        // ===== Bài 3: Facade =====
        TV tv = new TV();
        SoundSystem sound = new SoundSystem();
        DVDPlayer dvd = new DVDPlayer();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, sound, dvd);
        homeTheater.watchMovie("Avengers");

        System.out.println();

        // ===== Bài 4: Strategy =====
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("1234567812345678"));
        cart.checkout(500);

        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(900);

        System.out.println();

        // ===== Bài 5: MessageService =====
        MessageService service = new SimpleMessageService();
        service.sendMessage("Hello NetBeans!");
    }
}
