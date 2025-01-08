# Privilege Escalation
#Privilege escalation happens when an attacker exploits a vulnerability to gain higher privileges, often executing system-level commands.
import os

def privilege_escalation():
    try:
        #Run a command that requires higher privileges
        print("Attempting privilege escalation...")
        os.system("sudo ls /root")  # Privilege escalation through `sudo`
    except Exception as e:
        print(f"Error: {str(e)}")

privilege_escalation()  #Run the command with escalated privileges
