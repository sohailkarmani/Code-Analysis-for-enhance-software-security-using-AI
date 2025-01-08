# Improper Shutdown or Cleanup
# Vulnerability: Not closing resources such as files properly can lead to resource leaks.
# This code does not close the file after writing, which could cause file locks or memory issues.

def write_to_file():
    file = open("example.txt", "w")
    file.write("Hello, World!")
    # No file.close() here, causing improper shutdown of the resource
    print("Data written to file.")

write_to_file()
