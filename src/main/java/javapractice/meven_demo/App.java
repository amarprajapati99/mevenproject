package javapractice.meven_demo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message="Hello maven ";
//    	Log.debug(message + "will be printed on Debug");
//    	Log.info(message + "will be printed on info ");
//    	Log.warn(message + "will be printed on warn");
    	Log.error(message + "will be printed on error");
    	Log.fatal(message + "will be printed on fetal");
    	Log.info("Apppending string {}",message);
        System.out.println( message );
    }
}
