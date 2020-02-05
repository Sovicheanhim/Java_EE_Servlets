import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class MySessionListener implements HttpSessionListener {
    int count = 0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        count++;
        System.out.println("A new session created...");
        System.out.println("Active session : "+ count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        count--;
        System.out.println("Session destroyed");
    }
}
