package org.kasihappy.Tutorial.web.javabean;

import java.util.Vector;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Enumeration;

public class KeCheng {
    Vector<String> v = new Vector<String>();
    String submit = null;
    String item = null;
    private void addItem(String name)
    {
        v.addElement(name);
    }

    private void removeItem(String name)
    {
        v.removeElement(name);
    }

    public void setItem(String name)
    {
        item = name;
    }

    public void setSubmit(String s)
    {
        System.out.println("In setSubmit(), s="+s);
        submit = s;
    }

    public String[] getItems()
    {
        String[] s = new String[v.size()];
        v.copyInto(s);
        return s;
    }
    public void processRequest(HttpServletRequest request)
    {
        System.out.println("In processRequest(), submit="+submit);

        if (submit.equals("增加"))
        {
            addItem(item);
        } else if (submit.equals("删除")) {
            removeItem(item);
        }
        reset();
    }

    private void reset(){
        submit = null;
        item = null;
    }
}
