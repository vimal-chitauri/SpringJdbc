package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configNew.xml");
        JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate", JdbcTemplate.class);

        String query = "insert into student(id,name,city) values(?,?,?)";
        for (int i = 5; i < 10; i++) {
            int result = template.update(query, i, "vimal singh", "Delhi");
            System.out.println(result+i);
        }

    }
}
