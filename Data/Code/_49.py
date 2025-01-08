# Improper Certificate Validation
import ssl
import urllib.request

# Vulnerability: Not validating the server certificate
url = "https://example.com"
response = urllib.request.urlopen(url)  # Certificate validation not performed

# Print the response
print(response.read())
