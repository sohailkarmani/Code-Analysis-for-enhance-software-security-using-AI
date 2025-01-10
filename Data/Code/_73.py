# basic_authentication.py
import hashlib

users = {}

def register_user(username, password):
    salt = "secure_salt"  # Example salt
    hashed_password = hashlib.sha256((salt + password).encode()).hexdigest()
    users[username] = hashed_password
    print(f"User {username} registered successfully.")

def authenticate_user(username, password):
    salt = "secure_salt"
    hashed_password = hashlib.sha256((salt + password).encode()).hexdigest()
    if users.get(username) == hashed_password:
        print("Authentication successful.")
    else:
        print("Invalid credentials.")

if __name__ == "__main__":
    register_user("admin", "SecurePass123")
    authenticate_user("admin", "SecurePass123")
