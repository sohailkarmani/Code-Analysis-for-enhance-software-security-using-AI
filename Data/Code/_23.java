
// CORS Misconfiguration
java
Copy code

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class  _23 implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Wildcard allows all paths
                .allowedOrigins("*") // Allows any origin (unsafe)
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true); // Sensitive cookies are shared
    }
}
