package com.ctm.selenium.framework.strings.maps;

import com.ctm.selenium.framework.strings.ApplicationStrings;
import com.ctm.selenium.framework.strings.StringLoader;

/**
* This enumeration is intended to provide a mapping to each of the Strings in the respective
* properties file. For a Typical .properties file, we might have a handler that we create using
* a ResourceBundle, then use that handler through the entire application to grab Strings when
* we need them. This approach is fine, except it tightly couples the KVP mapping of the file to
* the application. The alternative to this, is what we do here. Create an enumeration which represents
* the strings, but without requiring the key to be written throughout the framework when a String is
* desired. This also provides us a convenient way to use dot notation and the auto complete functions
* of the IDE to quickly locate what we want. Now that we have a decoupling of application to KVP, we still
* need to map this class to the keys in the .properties class. This is undesirable. The alternative is to
* not require keys at all, but instead to autoload them. The caveat is that we still need to reference the
* enums to an exact string in the file. This is done by the <b>ordering<b>. The order of these enums must
* reflect the order of the strings in the .properties file. So, element 0 in this file must have its String
* located as the first element in the .properties file.
* <br><br>
* The disadvantage here is that now when one is updated, the other must be updated with the exact ordering. This
* is not that big of an issue, since when you add a String to one you must add it to the other anyways.
* <br><br>
* The advantage here is that we have now implemented two fold decoupling. The application is decoupled from the
* .properties files entirely and the map itself is decoupled from the keys. Simply add a new String to the end
* of the .properties file, and add a new enum to the end of this list, and it will immediately be available
* to the rest of the application with zero effort. The .properties files are numbered, with a prefix and follow
* the convention PREFIX.00, PREFIX.01, ..., PREFIX.nn
* <br><br>
* The FrameworkStrings file contains special Strings essential to the function of the framework. STR_MARKER for
* example indicates to the ErrorManager which markers in the other string files to replace with form fill text.
* STACK_MARKER for example, flags the ErrorManager in which part of the message to drop in the filtered stack
* trace (if at all). etc.
* 
* @author Sean Seltzer
*
*/
public enum FrameworkStrings {
	STR_MARKER,
	STACK_MARKER,
	FILTERPACKAGE,
	STACKLINE,
	LINE_HYPERLINK;
	
	private String message = null;
	
	private static int loadIndex = 0;
	private static ApplicationStrings appStrings = null;
	
	private FrameworkStrings() {
		this.message = retrieveStr();
	}
	private String retrieveStr() {
		if (appStrings == null) appStrings = StringLoader.getApplicationStrings();
		return appStrings.getFrameworkStrings().get(loadIndex++);
	}
	@Override
	public String toString() {
		return message;
	}
}