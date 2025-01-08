
#cache_poisoning
from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    # Vulnerability: Unsanitized user input in cache key (line 10)
    user_agent = request.headers.get('User-Agent')
    return f"Welcome, {user_agent}"

# Start server
app.run()

# Vulnerability: Cache Poisoning occurs if attackers manipulate 
# `User-Agent` headers to poison cache entries.
