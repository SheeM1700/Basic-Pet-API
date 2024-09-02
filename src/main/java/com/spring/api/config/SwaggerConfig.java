package com.spring.api.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "API PETS",
                description = "App basic about pets",
                termsOfService = "www.cristobal1700.com/terms_of_services",
                version = "1.0.0",
                contact = @Contact(
                        name = "Cristóbal González",
                        url = "www.cristobal1700.com"
                ),
                license = @License(
                        name = "Standard software Used license for Cristobal1700",
                        url = "www.cristobal1700/license"
                )
        ),
        servers = @Server(
                description = "DEV Server",
                url = "http://localhost:8080"
        )
)
public class SwaggerConfig {
}
