package {{cookiecutter.service_pipes_package}};

import com.fintechos.servicepipes.core.throttling.ThrottlingFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = ThrottlingFilter.class))
@SpringBootApplication
public class ServicePipesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicePipesApplication.class, args);
    }

}
