package mx.com.examen.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextResolver implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public SpringContextResolver() {

    }

    public void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static Object getBean(String name) {
        return applicationContext.getBean(name);
    }
}
