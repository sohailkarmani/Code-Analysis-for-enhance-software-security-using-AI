# Hardcoded Secrets in Source Code
# Vulnerability: Hardcoding the API key in the source code
API_KEY = "mysecretapikey12345"  # Hardcoded secret key

def fetch_data():
    # Make API call with hardcoded API key
    print(f"Fetching data using API key: {API_KEY}")

fetch_data()  # API key is exposed in the code
