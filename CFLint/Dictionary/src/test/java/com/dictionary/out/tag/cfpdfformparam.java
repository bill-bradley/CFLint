
package com.dictionary.out.tag;

import au.id.jericho.lib.html.EndTagType;
import au.id.jericho.lib.html.ParseText;
import au.id.jericho.lib.html.Source;
import au.id.jericho.lib.html.StartTag;
import au.id.jericho.lib.html.StartTagTypeGenericImplementation;
import au.id.jericho.lib.html.Tag;

final class cfpdfformparam extends StartTagTypeGenericImplementation {
	protected static final cfpdfformparam INSTANCE = new cfpdfformparam();

	private cfpdfformparam() {
		super("CFML if tag", "<cfpdfformparam", ">", EndTagType.NORMAL, true, true, false);
	}

}
					