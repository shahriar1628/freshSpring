package com.spring.config;

import com.spring.bin.Vehicle;
import com.spring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.spring"})
@EnableJpaRepositories(basePackages="com.spring", entityManagerFactoryRef="entityManagerFactory", transactionManagerRef ="jpaTransactionManager" )
public class DispatcherConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/start").setViewName("start");
    }
    @Bean
    public InternalResourceViewResolver  internalResourceViewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setViewClass(JstlView.class);
        internalResourceViewResolver.setPrefix("/WEB-INF/");
        internalResourceViewResolver.setSuffix(".jsp");
        return  internalResourceViewResolver;
    }
    @Bean
    public Vehicle vehicle(){
        return new Vehicle("car");
    }
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/djangotutorial");
        dataSource.setUsername("root");
        dataSource.setPassword("1628");
        return dataSource ;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPackagesToScan(new String[]{"com.spring"});
        JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter() ;
        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        entityManagerFactoryBean.setJpaProperties(additionalProperties());
        return entityManagerFactoryBean;

    }

    @Bean
    public EntityManagerFactory entityManagerFactory(){
        return entityManagerFactoryBean().getObject();
    }


    Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty(
                "hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");

        return properties;
    }

    @Bean
    public PlatformTransactionManager   jpaTransactionManager(){
        JpaTransactionManager jpaTransactionManager =  new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(  entityManagerFactory());
        return jpaTransactionManager;
    }


}
