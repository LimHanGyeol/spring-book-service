package me.hangyeol.springbookservice.container.resourceloader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * Section1. IoC 컨테이너와 빈
 * 9부 : ResourceLoader
 */
@Component
public class ResourceLoaderRunner implements ApplicationRunner {

    private final ResourceLoader resourceLoader;

    public ResourceLoaderRunner(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=========== ResourceLoader");

        System.out.println(resourceLoader.getClass());

        Resource resource = resourceLoader.getResource("test.txt");

        System.out.println(resource.getClass());
        System.out.println(resource.exists());
        System.out.println(resource.getDescription());
    }
}
