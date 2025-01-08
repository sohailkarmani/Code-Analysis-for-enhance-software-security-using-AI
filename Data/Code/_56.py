# Improper Input Sanitization
import os

# Vulnerability: Unsanitized user input used in file path
def get_file_content(filename):
    # Vulnerability: File path not sanitized
    with open(f"/path/to/{filename}", "r") as f:
        return f.read()

get_file_content("../../etc/passwd")  # Path traversal vulnerability
