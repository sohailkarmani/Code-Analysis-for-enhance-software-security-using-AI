# DLL injection occurs when an attacker injects a malicious DLL into a process to alter its behavior.
import ctypes
# Vulnerable to DLL injection
def inject_dll(dll_path):
    try:
        ctypes.windll.kernel32.LoadLibraryW(dll_path)
        print(f"DLL {dll_path} injected successfully")
    except Exception as e:
        print(f"Error injecting DLL: {str(e)}")

# Example of DLL injection (assuming DLL path provided by attacker)
dll_path = "C:\\path\\to\\malicious.dll"  # Malicious DLL file
inject_dll(dll_path)
