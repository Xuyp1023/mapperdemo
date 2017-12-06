package com.better.mapper.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.better.mapper.entity.CasTestEntity;
import com.better.mapper.service.CasTestService;

public class Provider {

    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "spring-context-provider.xml" });
        context.start();
        System.out.println(" service  starting......");
        testCasFind(context);
        System.in.read();
        context.close();
        System.exit(0);
    }

    public static void testCasFind(ClassPathXmlApplicationContext context) {

        CasTestService service = context.getBean(CasTestService.class);

        CasTestEntity entity = service.findCas(1l);
        /*CasTestEntity entity = new CasTestEntity();
        entity.setDynamicTableName("castest");
        entity.setId(2l);
        entity.setDataData(123);
        entity.setVersionVersion(2);
        service.saveAdd(entity);*/
        System.out.println(entity);

    }

    public static void testCasInsert(ClassPathXmlApplicationContext context) {

        CasTestService service = context.getBean(CasTestService.class);

        CasTestEntity entity = new CasTestEntity();
        // entity.setDynamicTableName("castest");
        entity.setId(2l);
        entity.setDataData(123);
        entity.setVersionVersion(2);
        service.saveAdd(entity);
        System.out.println(entity);

    }

}
