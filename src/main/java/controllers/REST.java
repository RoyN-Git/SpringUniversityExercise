package controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}


public class REST {
    @RestController
    @RequestMapping("school")  //http://localhost:8080/school
    @RequiredArgsConstructor
    public class SchoolController {
        private final School school;
    }
    @PutMapping("lecturer/update")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void updateLecturer(@RequestBody Lecturer lecturer) throws SchoolException {
        try {
            school.updateLecturer(lecturer);
        } catch (SchoolException e) {
            throw new SchoolException(lecturer.getName()+" is not in the system");
        }
    }
}
