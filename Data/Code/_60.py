#  Improper Dependency Management
# Vulnerability: Using an outdated or vulnerable version of a package can expose the system to security risks.
# Here, `requests` library might be outdated, exposing known vulnerabilities.

import requests

def fetch_data():
    response = requests.get('https://api.example.com/data')
    print(response.text)

fetch_data()
