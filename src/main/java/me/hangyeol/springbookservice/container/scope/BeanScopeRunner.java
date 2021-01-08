package me.hangyeol.springbookservice.container.scope;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Section1. IoC 컨테이너와 빈
 * 5부 : Bean 의 Scope
 */
@Component
public class BeanScopeRunner implements ApplicationRunner {

    private final Single single;
    private final Proto proto;
    private final ApplicationContext ctx;

    public BeanScopeRunner(Single single, Proto proto, ApplicationContext ctx) {
        this.single = single;
        this.proto = proto;
        this.ctx = ctx;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Singleton type instance references check."); // 같은 주소값이 출력된다.
        System.out.println(proto);
        System.out.println(single.getProto());
        System.out.println(proto);

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
