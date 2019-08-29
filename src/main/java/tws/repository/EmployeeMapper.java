/**
 * 
 */
package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import tws.entity.Employee;


@Mapper
public interface EmployeeMapper {
	@Select("select * from employee")
	List<Employee> queryEmployees();
}
