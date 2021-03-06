package xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.appservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.notificationcontext.domain.NotificationService;
import xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.handler.OrderPlacedEventHandler;
import xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.pl.OrderPlaced;

@Service
public class NotificationAppService implements OrderPlacedEventHandler {
    @Autowired
    private NotificationService notificationService;

    @Override
    public void handle(OrderPlaced event) {
        notificationService.notify(event.to());
    }
}
