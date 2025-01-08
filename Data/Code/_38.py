# Server-Side Request Forgery (SSRF)
#SSRF occurs when an attacker makes arbitrary HTTP requests from the server-side to internal services.

import requests

def ssrf_vulnerability(url):
    try:
        # Make an HTTP request to an attacker-controlled URL
        response = requests.get(url)
        print("Response from SSRF target:", response.text)
    except requests.exceptions.RequestException as e:
        print(f"Error during SSRF attack: {str(e)}")

# Example of SSRF vulnerability where an attacker can make requests to internal services
ssrf_vulnerability("http://localhost:8080/admin")  # Attacker-controlled URL
