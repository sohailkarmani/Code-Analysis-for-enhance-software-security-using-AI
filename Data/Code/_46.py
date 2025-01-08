
# http_response_splitting
from flask import Flask, request, Response

app = Flask(__name__)

@app.route('/')
def index():
    user_input = request.args.get('input', 'default')
    # Vulnerability: User input directly included in the HTTP header (line 10)
    response = Response(f"Hello {user_input}")
    response.headers['Set-Cookie'] = f"user={user_input}; Path=/"
    return response

# Start server
app.run()

# Vulnerability: HTTP Response Splitting occurs when attackers include newline characters in 
# `user_input`, allowing them to manipulate HTTP headers.
