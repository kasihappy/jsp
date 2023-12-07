package org.kasihappy.Tutorial.web.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class HelloWorldTag extends TagSupport {
    public int doStartTag() throws JspException
    {
        try
        {
            JspWriter out = pageContext.getOut();

            out.println("<B>Hello World!</B>");
        } catch (IOException ioExc)
        {
            throw new JspException(ioExc.toString());
        }
        /*跳过标记体*/
        return SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}
