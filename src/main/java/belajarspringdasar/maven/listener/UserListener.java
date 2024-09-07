package belajarspringdasar.maven.listener;

import belajarspringdasar.maven.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginListener(LoginSuccessEvent event) {
        log.info("Login again for annotaion success {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginListener2(LoginSuccessEvent event) {
        log.info("Login again for annotaion 2 success {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginListener3(LoginSuccessEvent event) {
        log.info("Login again for annotaion 3 success {}", event.getUser());
    }

}
