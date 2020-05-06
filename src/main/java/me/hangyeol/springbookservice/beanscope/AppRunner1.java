package me.hangyeol.springbookservice.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner1 implements ApplicationRunner {

    /*
    @Autowired
    Single single;
    @Autowired
    Proto proto;
     */

    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Singleton type instacne references check
//        System.out.println(proto);
//        System.out.println(single.getProto());

        System.out.println("proto");
        System.out.println(ctx.getBean(Proto.class));
        System.out.println(ctx.getBean(Proto.class));
        System.out.println(ctx.getBean(Proto.class));

        System.out.println("single");
        System.out.println(ctx.getBean(Single.class));
        System.out.println(ctx.getBean(Single.class));
        System.out.println(ctx.getBean(Single.class));

        System.out.println("proto by slingle");
        System.out.println(ctx.getBean(Single.class).getProto());
        System.out.println(ctx.getBean(Single.class).getProto());
        System.out.println(ctx.getBean(Single.class).getProto());


    }
}
