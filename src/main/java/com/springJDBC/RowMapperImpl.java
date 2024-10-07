package com.springJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

public class RowMapperImpl implements RowMapper<Employee>{

	@Override
	@Nullable
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setE_id(rs.getInt(1));
		emp.setE_name(rs.getString(2));
		emp.setE_contact(rs.getString(3));
		return emp;
	}
}
