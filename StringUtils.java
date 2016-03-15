package MR_Ullenboom_Teil_06;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

/**
 * Dokumentation für die Klasse "StringUtils".
 * 
 * @author Matthias Röthlin
 * @version 1.0
 * @since 1.0
 */
	public class StringUtils {
		/**
		 * Gibt den String umgekehrt wieder aus, wie er eingegeben wurde
		 * 
		 * @param string beliebige Zeichenkette
		 * @return den umgekehrten String
		 */

	 public static String reverse( String string ){
		 
		 String reverse = new String();
		    for ( int j = string.length()-1; j >= 0; j-- )
		      reverse += string.charAt(j);
		    return reverse;
	 }
	 
	 /**
	  * entfernt Elemente aus einer ArrayList
	  */
	 
	 public static void(){
		 ArrayList<String> list = new ArrayList<String>();
		 Collections.addAll( list, "a", "b", "c", "d", "e" );
		 list.removeAll( Arrays.asList( "b", "d" ) );
	 }
	 
}
