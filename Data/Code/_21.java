// Actuators to RCE

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class _21 {

    public static void main(String[] args) {
        SpringApplication.run(_21.class, args);
    }

    @Bean
    public String insecureActuatorEndpoint() {
        return "Exposed Actuator Endpoint!";
    }
}

@RestController
class ActuatorController {
    @GetMapping("/run")
    public String executeCommand(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd); // Vulnerable to RCE
            return "Command Executed: " + cmd;
        } catch (Exception e) {
            return "Execution failed: " + e.getMessage();
        }
    }
}
