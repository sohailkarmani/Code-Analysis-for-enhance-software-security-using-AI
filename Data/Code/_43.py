#Side-Channel Attack
import time
stored_password = "securepassword"  # Simulated stored password

def check_password(input_password):
    # Vulnerability: Timing-based side-channel attack occurs here (line 12)
    for i in range(len(stored_password)):
        if i >= len(input_password) or input_password[i] != stored_password[i]:
            return False
        time.sleep(0.1)  # Simulated time delay for comparison
    return len(input_password) == len(stored_password)

# Attacker can measure response time to guess password character by character
print(check_password("secure"))
print(check_password("securepassword"))

# Vulnerability: Time delay at line 12 leaks information about password length 
# and correctness based on response time.
