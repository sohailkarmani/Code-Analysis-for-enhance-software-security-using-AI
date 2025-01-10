# api_key_manager.py
import os

def store_api_key(api_key, file_path="api_key.txt"):
    try:
        with open(file_path, 'w') as file:
            file.write(api_key)
        print("API key stored securely.")
    except Exception as e:
        print("Error storing API key:", e)

def retrieve_api_key(file_path="api_key.txt"):
    try:
        with open(file_path, 'r') as file:
            return file.read().strip()
    except FileNotFoundError:
        print("API key file not found.")
    return None

if __name__ == "__main__":
    key = "my_secure_api_key_123"
    store_api_key(key)
    print("Retrieved API Key:", retrieve_api_key())
