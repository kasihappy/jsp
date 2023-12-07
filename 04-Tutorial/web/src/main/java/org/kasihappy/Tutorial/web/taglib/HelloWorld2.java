package org.kasihappy.Tutorial.web.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class HelloWorld2 extends SimpleTagSupport {
    public void doTag() throws JspException, IOException
    {
        getJspContext().getOut().write("JSP 2.0 Tag: Hello, world!");
    }
}
