package spring_annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_annotation.controller.CompanyController;
import spring_annotation.dao.CompanyDao;
import spring_annotation.dto.CompanyDto;
import spring_annotation.service.CompanyService;
import spring_annotation_dto.CompanyDto2;

public class Program2 {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(EmployeeConfig.class);
//		dto--data transfer object/encapsulated class --@Component
		System.out.println(ac.getBean(CompanyDto.class));
//		dao--data access object ---database logic --@Repository
		System.out.println(ac.getBean(CompanyDao.class));
//		service ---bussiness logics ---@Service
		System.out.println(ac.getBean(CompanyService.class));
//		controller---ui logic ---@Controller @RestController
		System.out.println(ac.getBean(CompanyController.class));
		System.out.println(ac.getBean(CompanyDto2.class));



	}
}
