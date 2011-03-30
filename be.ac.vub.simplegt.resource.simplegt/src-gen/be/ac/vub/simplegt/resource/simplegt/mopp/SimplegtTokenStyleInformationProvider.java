/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

public class SimplegtTokenStyleInformationProvider {
	
	public be.ac.vub.simplegt.resource.simplegt.ISimplegtTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("COMMENT".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x53, 0x87, 0x6D}, null, false, false, false, false);
		}
		if ("module".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("import".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("transform".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("rule".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("extends".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("from".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("in".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("not".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("to".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("before".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		return null;
	}
	
}
