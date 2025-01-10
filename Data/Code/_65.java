// EnvironmentVariableReader
public class _65{
    public static void main(String[] args) {
        String envVar = System.getenv("PATH");
        if (envVar != null) {
            System.out.println("PATH Environment Variable: " + envVar);
        } else {
            System.out.println("Environment variable not found.");
        }
    }
}
