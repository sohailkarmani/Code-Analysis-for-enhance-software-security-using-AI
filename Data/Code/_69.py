# encrypt_message.py
from cryptography.fernet import Fernet

def generate_key():
    return Fernet.generate_key()

def encrypt_message(message, key):
    cipher = Fernet(key)
    return cipher.encrypt(message.encode())

if __name__ == "__main__":
    key = generate_key()
    print("Encryption Key:", key.decode())
    message = "Secure message for encryption."
    encrypted_message = encrypt_message(message, key)
    print("Encrypted Message:", encrypted_message.decode())
