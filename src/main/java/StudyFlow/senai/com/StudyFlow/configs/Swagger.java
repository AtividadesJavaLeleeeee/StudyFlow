package StudyFlow.senai.com.StudyFlow.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "StudyFlow - aplicativo de estudos",
        version = "1.0",
        description = "Letícia Teixeira Lemos - 2 info B"
    )
)
public class Swagger {

}