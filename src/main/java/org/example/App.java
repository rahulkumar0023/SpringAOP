package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService myService = ctx.getBean(MyService.class);
        myService.doSomething();

    }
}
