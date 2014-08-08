
package com.dictionary.out.tag;

import au.id.jericho.lib.html.EndTagType;
import au.id.jericho.lib.html.ParseText;
import au.id.jericho.lib.html.Source;
import au.id.jericho.lib.html.StartTag;
import au.id.jericho.lib.html.StartTagTypeGenericImplementation;
import au.id.jericho.lib.html.Tag;

final class cfprocparam extends StartTagTypeGenericImplementation {
	protected static final cfprocparam INSTANCE = new cfprocparam();

	private cfprocparam() {
		super("CFML if tag", "<cfprocparam", ">", EndTagType.NORMAL, true, true, false);
	}

}
					