package es.cea.tags;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.omg.CORBA.Request;

public class DebugRequestTag extends TagSupport{


	@Override
	public int doStartTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		try {
			
			writer.print("<hr>");
			ServletRequest request = pageContext.getRequest();
			Enumeration parameterNames = request.getParameterNames();
			while(parameterNames.hasMoreElements()){
				String nextElement = (String) parameterNames.nextElement();
				writer.print("recibiendo: "+nextElement+" " +
						"con valor:"+request.getParameter(nextElement)+"<br>");
				
			}
			writer.print("<hr>");
				

		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		
		return this.SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		try {
			writer.print("");
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}

		return this.EVAL_PAGE;
	}

	

}
