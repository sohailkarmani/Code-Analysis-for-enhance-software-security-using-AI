# Missing Authentication for Critical Functionality

class User:
    def __init__(self, name):
        self.name = name

# Vulnerability: Critical functionality (deleting user) accessible without authentication
def delete_user(user):
    # No authentication check here
    print(f"Deleting user {user.name}")

user = User("admin")
delete_user(user)  # This should be restricted to authenticated users only
