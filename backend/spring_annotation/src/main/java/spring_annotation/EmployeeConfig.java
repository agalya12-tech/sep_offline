package spring_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"spring_annotation_dto","spring_annotation"})
@Configuration
public class EmployeeConfig {

}
