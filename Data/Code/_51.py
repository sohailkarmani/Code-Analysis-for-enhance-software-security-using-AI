# Broken Access Control

class Admin:
    def __init__(self, username):
        self.username = username

# Vulnerability: Admin actions exposed to regular users
def admin_action(user):
    if user.username == "admin":
        print("Admin action performed")
    else:
        print("User action performed")

user = Admin("regular_user")
admin_action(user)  # Regular user can perform admin action
