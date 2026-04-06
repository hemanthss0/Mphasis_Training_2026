package com.test;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SpringBootRestJpa1Application}.
 */
@Generated
public class SpringBootRestJpa1Application__BeanDefinitions {
  /**
   * Get the bean definition for 'springBootRestJpa1Application'.
   */
  public static BeanDefinition getSpringBootRestJpaApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringBootRestJpa1Application.class);
    beanDefinition.setInstanceSupplier(SpringBootRestJpa1Application::new);
    return beanDefinition;
  }
}
