
import os
import time

file_path = "example.txt"

# Simulate a file operation
def check_and_delete():
    if os.path.exists(file_path):  # Check if file exists
        time.sleep(1)  # Simulate delay (vulnerability occurs here)
        os.remove(file_path)  # Delete the file

# Simulate an attacker replacing the file during the delay
with open(file_path, "w") as f:
    f.write("Sensitive Data")

os.system(f"ln -s /etc/passwd {file_path}")  # Attacker replaces file with symlink
check_and_delete()

# Vulnerability: TOCTOU race condition at line 8 where the file existence
# check and deletion are not atomic, allowing attackers to replace the file.
