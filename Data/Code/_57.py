# Directory Listing Enabled
import os

# Vulnerability: Directory listing enabled (exposing sensitive files)
def list_files():
    directory = "/path/to/directory"
    files = os.listdir(directory)
    print(files)

list_files()  # Listing all files in a directory, including sensitive ones
