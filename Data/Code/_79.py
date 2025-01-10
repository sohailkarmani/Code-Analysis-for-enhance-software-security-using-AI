# Check if a specific file exists in the filesystem.
import os

def check_file_existence(file_path):
    if os.path.exists(file_path):
        print(f"{file_path} exists.")
    else:
        print(f"{file_path} does not exist.")

if __name__ == "__main__":
    check_file_existence("test_file.txt")
