# Send email via SMTP with authentication. Use a secure method for password storage.
import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

def send_email(subject, body, to_email, from_email, smtp_server, smtp_port):
    msg = MIMEMultipart()
    msg["From"] = from_email
    msg["To"] = to_email
    msg["Subject"] = subject
    msg.attach(MIMEText(body, "plain"))
    
    try:
        with smtplib.SMTP(smtp_server, smtp_port) as server:
            server.starttls()
            server.login(from_email, "password")  # use secure method for storing password
            server.sendmail(from_email, to_email, msg.as_string())
        print("Email sent successfully.")
    except Exception as e:
        print("Error sending email:", e)

if __name__ == "__main__":
    send_email("Test Subject", "Test Body", "recipient@example.com", "sender@example.com", "smtp.example.com", 587)
