# Null Byte Injection can occur when a null byte (\x00) is inserted into a string, truncating the string unexpectedly.
import os
def null_byte_injection(user_input):
    #  Build a file path with user input (vulnerable to null byte injection)
    file_path = "/home/user/" + user_input + ".txt"
    print("Generated file path:", file_path)
    
    # Simulating file existence check
    if os.path.exists(file_path):
        print("File exists:", file_path)
    else:
        print("File not found")

# Example of null byte injection (truncates filename)
null_byte_injection("malicious\x00command")  # This will truncate the file path unexpectedly
