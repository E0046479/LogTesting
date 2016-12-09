package team10.log.customLog;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LogCustomFormatter {
	static Logger logger = Logger.getLogger(LogCustomFormatter.class.getName());
	static final DateFormat df = new SimpleDateFormat("dd-MM-yyyy_hh-mm");
	static final String fileLocation = "C:/Users/e0046479/workspace/LogTesting/Log/MyLogFile";

	public static void main(String[] args) {
		logger.setUseParentHandlers(false);
		FileHandler fh;

		try {
			fh = new FileHandler(fileLocation + df.format(new Date()) + ".log");

			MyFormatter formatter = new MyFormatter();
			ConsoleHandler handler = new ConsoleHandler();
			handler.setFormatter(formatter);
			logger.addHandler(handler);
			fh.setFormatter(formatter);
			logger.addHandler(fh);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		logger.info("Example of creating custom formatter.");
		logger.warning("A warning message.");
		logger.severe("A severe message.");
	}
}
