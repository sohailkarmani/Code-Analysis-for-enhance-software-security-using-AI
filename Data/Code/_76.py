# Generate a QR code from provided data and save as an image file.
import qrcode

def generate_qr_code(data, file_name="qr_code.png"):
    qr = qrcode.QRCode(version=1, error_correction=qrcode.constants.ERROR_CORRECT_L)
    qr.add_data(data)
    qr.make(fit=True)
    img = qr.make_image(fill="black", back_color="white")
    img.save(file_name)
    print(f"QR Code saved as {file_name}")

if __name__ == "__main__":
    generate_qr_code("https://example.com")
