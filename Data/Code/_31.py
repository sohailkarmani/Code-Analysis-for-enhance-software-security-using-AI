#  Insecure Deserialization
#Insecure deserialization occurs when untrusted data is deserialized, which can lead to arbitrary code execution or other security issues.
import pickle
import os

# Insecure deserialization vulnerability
def insecure_deserialization(serialized_data):
    try:
        data = pickle.loads(serialized_data)
        print("Deserialized Data:", data)
        
        # Perform some actions on the data (insecure)
        if 'command' in data:
            os.system(data['command'])   
    except Exception as e:
        print("Error:", str(e))

# Example of serialized malicious data
malicious_data = pickle.dumps({'command': 'rm -rf /'})  # Malicious payload
insecure_deserialization(malicious_data)
