#  Improper Session Management

import time

# Vulnerability: Session does not expire after a set time
session = {"user": "john_doe", "last_access": time.time()}  # Session stored in memory

def check_session():
    # Vulnerability: No expiration check, session remains valid indefinitely
    if time.time() - session["last_access"] < 3600:  # 1-hour session timeout
        print("Session is valid")
    else:
        print("Session expired")

check_session()
