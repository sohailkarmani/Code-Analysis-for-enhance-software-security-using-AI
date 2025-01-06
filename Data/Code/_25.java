
// CSRF

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class _25 {
    @PostMapping("/transfer")
    public String transferMoney(@RequestParam String account, @RequestParam double amount) {
        // No CSRF protection, attacker can forge requests
        return "Transferred $" + amount + " to account " + account;
    }
}
