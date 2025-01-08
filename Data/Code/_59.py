# Exposed Sensitive Endpoints
from flask import Flask

app = Flask(__name__)

@app.route('/sensitive-data')
def sensitive_data():
    # Vulnerability: The endpoint is exposed without proper authentication or authorization.
    # Anyone can access sensitive data.
    return "This is sensitive information."

if __name__ == "__main__":
    app.run(debug=True)
