
# Filename: sensitive_data_exposure_example.py
import json

# Simulated sensitive data
user_data = {
    "username": "john_doe",
    "password": "supersecretpassword123",  # Sensitive data
    "email": "john.doe@example.com",
}

# Expose sensitive data to the client
def api_response():
    # Vulnerability occurs here (line 13) where sensitive data is included in the response
    return json.dumps(user_data)  # Entire user data exposed in API response

# Simulate API call
print(api_response())

# Vulnerability: Sensitive data exposure at line 13. Password is returned in the API response.
