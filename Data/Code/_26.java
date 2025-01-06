// CVE-2022-22978  -- SpringSecurityExploit
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vulnerable")
public class _26{
    @GetMapping("/escalate")
    public String escalatePrivileges(Authentication auth) {
        if ("admin".equals(auth.getName())) {
            return "Privileged access granted!";
        }
        return "Insufficient privileges!";
    }
}
