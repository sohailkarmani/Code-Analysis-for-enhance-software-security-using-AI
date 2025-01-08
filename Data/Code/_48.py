#  Insecure Cryptographic Storage
from cryptography.fernet import Fernet

# Vulnerability: Hardcoding the encryption key (insecure storage)
key = b'my_secret_key_1234'  # Hardcoded key (insecure)
cipher = Fernet(key)

# Encrypting the data
data = "Sensitive data"
encrypted_data = cipher.encrypt(data.encode())

print(encrypted_data)

# Decrypting the data
decrypted_data = cipher.decrypt(encrypted_data)
print(decrypted_data.decode())
