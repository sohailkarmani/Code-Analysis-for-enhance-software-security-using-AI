# strong_password_checker.py

def is_strong_password(password):
    if len(password) < 8:
        return False
    if not any(char.isupper() for char in password):
        return False
    if not any(char.islower() for char in password):
        return False
    if not any(char.isdigit() for char in password):
        return False
    if not any(char in "!@#$%^&*()-_=+" for char in password):
        return False
    return True

if __name__ == "__main__":
    password = "P@ssw0rd123"
    if is_strong_password(password):
        print("Password is strong.")
    else:
        print("Password is weak.")
