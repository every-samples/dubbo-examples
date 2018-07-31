package com.ydonglai.dubbo.sample01.consumer;

import com.ydonglai.dubbo.sample01.provider.PService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerApp {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
            new String[]{"sample01/consumer/applicationContext.xml"}
        );
        ctx.start();

        PService pService = ctx.getBean(PService.class);

        System.out.println("===== pService.ping() 调用返回: " + pService.ping());

        System.in.read();
        ctx.stop();
    }

}
