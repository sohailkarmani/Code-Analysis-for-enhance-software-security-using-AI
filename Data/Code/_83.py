# og_writer.py
import logging

def configure_logger():
    logging.basicConfig(filename="app.log", level=logging.DEBUG, format="%(asctime)s - %(levelname)s - %(message)s")

def write_log(message):
    logging.info(message)

if __name__ == "__main__":
    configure_logger()
    write_log("Application started.")
