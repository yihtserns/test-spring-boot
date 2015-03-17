/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.yihtserns.test.spring.boot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 *
 * @author yihtserns
 */
public class ApplicationTest {

    private ConfigurableApplicationContext appContext;

    @Before
    public void initAppContext() {
        appContext = SpringApplication.run(Application.class);

        for (String beanName : appContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }

    @After
    public void closeAppContext() {
        appContext.close();
    }

    @Test
    public void canGetBean() {
        assertThat(appContext.getBean("nameBean"), is((Object) "Test Spring Boot"));
    }

    @Test
    public void shouldResolvePropertyPlaceholderInDependency() {
        Dependency dep = appContext.getBean("dependency", Dependency.class);

        assertThat(dep.getLimit(), is(3));
    }
}
