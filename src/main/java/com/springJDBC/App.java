package com.springJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Spring-JDBC!" );
        
        ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate = ap.getBean("jdbcTemplate",JdbcTemplate.class);
        
        // inserting data:
        String insert_query = "insert into employee(e_id,e_name,e_contact) values(?,?,?)";
        //firing the query
        int rows = jdbcTemplate.update(insert_query,20,"ABC","1234567890");
        System.out.println("Inserted: " + rows);
        
        // updating data
        String update_query = "update employee set e_contact=? where e_contact='7558570489'";
        int updated_rows = jdbcTemplate.update(update_query,"9876543211");
        System.out.println("Updated Rows: " + updated_rows);
        
        // deleting data
        String delete_query = "delete from employee where e_name=?";
        int deleted_rows = jdbcTemplate.update(delete_query,"ABC");
        System.out.println("Deleted Rows: " + deleted_rows);
        
        // fetching data(select query)
        String select_query = "select * from employee where e_id=?";
        RowMapper<Employee> rm = new RowMapperImpl();
        Employee emp = jdbcTemplate.queryForObject(select_query, rm,1);
        System.out.println(emp);
    }
}
