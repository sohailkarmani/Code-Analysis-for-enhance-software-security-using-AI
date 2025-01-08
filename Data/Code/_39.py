# Open Redirect
#Open Redirect occurs when a web application redirects a user to a URL provided by the user, without validating the target URL.

import webbrowser

def open_redirect(url):
    try:
        #Redirect user to an unvalidated URL
        print("Redirecting to:", url)
        webbrowser.open(url)
    except Exception as e:
        print(f"Error during open redirect: {str(e)}")

# Example of open redirect vulnerability
open_redirect("http://evil.com")  #Open redirect to a malicious website
