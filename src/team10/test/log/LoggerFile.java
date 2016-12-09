package team10.test.log;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerFile {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("MyLog");
		
		// To remove the console handler, use
		// logger.setUseParentHandlers(false);
		
		FileHandler fh;
		try {

			// This block configure the logger with handler and formatter

			fh = new FileHandler("C:/Users/e0046479/workspace/LogTesting/Log/MyLogFile.log");
			
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);

			// the following statement is used to log any messages
			logger.info("My first log");

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		logger.info("Hi How r u?");
	}
}
