# secure_log_rotation.py
import logging
from logging.handlers import RotatingFileHandler

def setup_logger():
    logger = logging.getLogger("SecureLogger")
    logger.setLevel(logging.INFO)
    
    handler = RotatingFileHandler("secure.log", maxBytes=5000, backupCount=5)
    handler.setFormatter(logging.Formatter("%(asctime)s - %(levelname)s - %(message)s"))
    logger.addHandler(handler)
    return logger

if __name__ == "__main__":
    logger = setup_logger()
    logger.info("This is a secure logging message.")
    logger.error("An error occurred!")
