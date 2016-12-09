import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLog {
	private static final Logger LOGGER = Logger.getLogger(TestLog.class.getName());

	public static void main(String[] args) {
		ArrayList<String> list = methodA();
		LOGGER.log(Level.FINE, "processing {0} entries in loop", list.size());
		displayList(list);
		methodB();
	}

	private static ArrayList<String> methodA() {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("AAA");
		stringList.add("BBB");
		stringList.add("CCC");
		stringList.add("DDD");
		stringList.add("EEE");
		stringList.add("FFF");
		LOGGER.log(Level.FINEST, "processing[{0}]: {1}");
		return stringList;
	}

	private static void displayList(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			LOGGER.log(Level.FINER, "processing[{0}]: {1}", new Object[] { i, list.get(i) });
			System.out.println(list.get(i));
		}
	}
	
	private static void methodB(){
		try {
		   int z = 5 / 0;
		} catch( Exception ex ) {
		    LOGGER.log( Level.SEVERE, ex.toString(), ex );
		}
	}
}
