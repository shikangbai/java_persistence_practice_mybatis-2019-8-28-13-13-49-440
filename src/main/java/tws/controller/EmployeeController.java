/**
 * 
 */
package tws.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.Employee;
import tws.repository.EmployeeMapper;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeMapper employeeMapper;
	@GetMapping
	public ResponseEntity<List<Employee>> queryEmployees(@RequestParam(required = false) Integer page,@RequestParam(required = false) Integer pageSize,@RequestParam(required = false) String gender) {
		List<Employee> employees = employeeMapper.queryEmployees();
		return ResponseEntity.ok(employees);
	}
}
