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
		if ("INTEGER".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("FLOAT".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("abstract".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x40}, null, true, false, false, false);
		}
		if ("debug".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x80, 0x00, 0x40}, null, true, false, false, false);
		}
		if ("true".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x00, 0xD0, 0xFF}, null, false, false, false, false);
		}
		if ("false".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x00, 0xD0, 0xFF}, null, false, false, false, false);
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
		if ("QUOTED_34_34_92".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("QUOTED_39_39_92".equals(tokenName)) {
			return new be.ac.vub.simplegt.resource.simplegt.mopp.SimplegtTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		return null;
	}
	
}
