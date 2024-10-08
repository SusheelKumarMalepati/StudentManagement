package com.in.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerController {
	@Bean
	public Docket libraryApi()  
	{
		return new Docket(DocumentationType.SWAGGER_2)  
				.apiInfo(apiInfo())  
				.groupName("Susheel-API")
				.select().apis(RequestHandlerSelectors.basePackage("com.in.controller"))
				.build();
	}
	private ApiInfo apiInfo()
	{
		return new ApiInfoBuilder().title("Student-Management API")
				.description("Management API for Colleges")
				.termsOfServiceUrl("http://www.google.co.in")
				.contact(new Contact("Student Management API","http://www.data.com","data@mail.com"))
				.license("Company License")
				.licenseUrl("http://www.data.com")
				.version("1.0")
				.build();
	}
}

