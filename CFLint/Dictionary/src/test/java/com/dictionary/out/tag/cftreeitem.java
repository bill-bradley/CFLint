
package com.dictionary.out.tag;

import au.id.jericho.lib.html.EndTagType;
import au.id.jericho.lib.html.ParseText;
import au.id.jericho.lib.html.Source;
import au.id.jericho.lib.html.StartTag;
import au.id.jericho.lib.html.StartTagTypeGenericImplementation;
import au.id.jericho.lib.html.Tag;

final class cftreeitem extends StartTagTypeGenericImplementation {
	protected static final cftreeitem INSTANCE = new cftreeitem();

	private cftreeitem() {
		super("CFML if tag", "<cftreeitem", ">", EndTagType.NORMAL, true, true, false);
	}

}
					