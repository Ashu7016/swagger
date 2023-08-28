/**
package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	

	@Bean
	public OpenAPI postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Xadmin").apiInfo(apiInfo())
       .paths(regex("/course.*")).build();
	}

/**
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.api"))
                .paths(PathSelectors.any())
                .build();
    }
}
**/

/**
	private ApiInfo apiInfo() {
		
		return new ApiInfoBuilder().title("Course API")
		.description("xadmin Course ApI Documentation Generated Using Swagger2 for our course API")
		.termsOfServiceUrl("https://www.youtube.com/watch?v=NOY-LjNHSpU")
		.license("xadmin Rest API License")
		.licenseUrl("https://www.youtube.com/watch?v=NOY-LjNHSpU").version("1.0").build();
	}

}

**/



