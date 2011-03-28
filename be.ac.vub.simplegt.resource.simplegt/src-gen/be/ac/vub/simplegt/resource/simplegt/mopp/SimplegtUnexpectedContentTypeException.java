/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package be.ac.vub.simplegt.resource.simplegt.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see be.ac.vub.simplegt.resource.simplegt.ISimplegtOptions.RESOURCE_CONTENT_TYPE
 */
public class SimplegtUnexpectedContentTypeException extends org.antlr.runtime3_2_0.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  SimplegtUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
