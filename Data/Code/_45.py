
from http.server import BaseHTTPRequestHandler, HTTPServer

class SmugglingServer(BaseHTTPRequestHandler):
    def do_POST(self):
        # Vulnerability: Handling raw HTTP headers without validating the body length
        content_length = int(self.headers['Content-Length'])
        raw_body = self.rfile.read(content_length).decode()
        self.send_response(200)
        self.end_headers()
        self.wfile.write(b"Request processed\n")
        print(f"Body: {raw_body}")

# Simulate server with request smuggling vulnerability
server = HTTPServer(('localhost', 8080), SmugglingServer)
server.serve_forever()

# Vulnerability: HTTP Request Smuggling occurs when Content-Length conflicts 
# with Transfer-Encoding headers and allows injecting requests into the HTTP pipeline.
