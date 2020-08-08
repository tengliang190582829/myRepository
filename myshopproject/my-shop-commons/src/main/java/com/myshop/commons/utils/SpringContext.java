package com.myshop.commons.utils;

import org.apache.commons.lang3.Validate;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component(value = "springContext")
public final class SpringContext implements ApplicationContextAware, DisposableBean
{

    private static final Logger LOG = Logger.getLogger(SpringContext.class);

    public static ApplicationContext applicationContext;

    public static <T> T getBean (String beanId)
    {
        assertContextInjected();
        return (T) applicationContext.getBean(beanId);
    }

    public static <T> T getBean (Class<T> clazz)
    {
        assertContextInjected();
        return (T) applicationContext.getBean(clazz);
    }

    /**
     * 实现 DisposableBean 接口，在 Context 关闭时清理静态变量
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception
    {
        LOG.debug("清除 SpringContext 中的 ApplicationContext: {}", (Throwable) applicationContext);
        applicationContext = null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.applicationContext = applicationContext;
    }

    /**
     * 断言 Context 已经注入
     */
    private static void assertContextInjected()
    {
        Validate.validState(applicationContext != null,
                "applicationContext 属性未注入，请在 spring-context.xml 配置中定义 SpringContext");
    }
}
