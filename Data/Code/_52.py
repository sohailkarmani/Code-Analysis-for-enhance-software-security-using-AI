# Insecure Transport Layer Security Configuration

import socket
import ssl

# Vulnerability: Using insecure SSL/TLS configuration (TLS 1.0)
context = ssl.create_default_context()
context.set_ciphers('ALL')  # Insecure ciphers allowed

# Vulnerable SSL socket
connection = context.wrap_socket(socket.socket(socket.AF_INET), server_hostname="example.com")
connection.connect(("example.com", 443))  # Connect using insecure ciphers
