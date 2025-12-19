package spring_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.val;
import spring_annotation.dto.CompanyDto;
@Data
@Scope(value = "prototype")
@Component
public class Employee {
//	It is variable level annotation used to inject a value into object
	@Value("radha")
	private String name;
	@Value("r@gmail.com")
	private String email;
	@Value("3456789")
	private long mobile;
//	It is variable level annotation used to inject an object into reference,
//	the process is called autowiring/autowidening
    @Autowired
	private CompanyDto dto;

}
