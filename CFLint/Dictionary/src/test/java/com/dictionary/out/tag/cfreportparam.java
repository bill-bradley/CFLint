
package com.dictionary.out.tag;

import au.id.jericho.lib.html.EndTagType;
import au.id.jericho.lib.html.ParseText;
import au.id.jericho.lib.html.Source;
import au.id.jericho.lib.html.StartTag;
import au.id.jericho.lib.html.StartTagTypeGenericImplementation;
import au.id.jericho.lib.html.Tag;

final class cfreportparam extends StartTagTypeGenericImplementation {
	protected static final cfreportparam INSTANCE = new cfreportparam();

	private cfreportparam() {
		super("CFML if tag", "<cfreportparam", ">", EndTagType.NORMAL, true, true, false);
	}

}
					