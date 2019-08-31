/**
 *<p> Title: Log.java</br>
 *<p>Description: TODO(describe the file) </br>
 * @Copyright: Copyright (c) 2015
 * @author Administrator
 * @version 2019-8-30
 */
package utils;

import org.apache.log4j.*;;

/**
 * <p>Title: Log</br>
 * <p>Description: TODO(describe the types) </br>
 * @author Administrator
 * @version 2019-8-30
 */
public class Log {
	public static Logger Log=Logger.getLogger(Log.class.getName());
	public static void info(String message){		
		System.out.println(message);
		Log.info(message);
	}
	public static void warn(String message){		
		System.out.println(message);
		Log.warn(message);
	}
	public static void error(String message){		
		System.out.println(message);
		Log.error(message);
	}
	public static void debug(String message){		
		System.out.println(message);
		Log.debug(message);
	}

}
