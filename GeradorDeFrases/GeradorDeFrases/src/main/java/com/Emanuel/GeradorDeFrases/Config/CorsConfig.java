package com.Emanuel.GeradorDeFrases.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // -> Sempre lembrar de colocar a anotação "Configuration" quando for configurar o cors
public class CorsConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("http://127.0.0.1:5501") //Diz qual url pode acessar a aplicação
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
            //Diz quais os tipos de métodos que podem ser utilizados no back end
        }
}
