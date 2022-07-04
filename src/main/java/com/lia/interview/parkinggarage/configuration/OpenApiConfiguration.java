package com.lia.interview.parkinggarage.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

import static com.lia.interview.parkinggarage.configuration.OpenApiConfiguration.*;

@Configuration
@OpenAPIDefinition(info = @Info(title = HOME_TITLE, version = "1.0", description = HOME_DESCRIPTION, license = @License(name = LICENSE), contact = @Contact(url = CONTACT_URL, email = CONTACT_EMAIL, name = CONTACT_NAME)))
public class OpenApiConfiguration {

    public static final String LICENSE = "Lombard International Assurance";
    public static final String CONTACT_NAME = "IT Application Development";
    public static final String CONTACT_URL = "http://www.lombardinternational.com";
    public static final String CONTACT_EMAIL = "IT_Application_Development@lombardinternational.com";
    public static final String HOME_TITLE = "Default HOME API";
    public static final String HOME_DESCRIPTION = "This API allows to check that the application is available";

}