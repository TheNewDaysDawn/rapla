package org.rapla.client.gwt.components.util;

import com.google.gwt.core.client.js.JsType;
import com.google.gwt.dom.client.Element;

@JsType(prototype = "jQuery")
public interface JQueryElement {
    
    JQueryElement append(JQueryElement... element);

    String html();
    
    String prop(String prop);

    JQueryElement data(String key, String value);

    JQueryElement text(String text);
    
    JQueryElement[] children(String selector);
    
    void remove();
    
    JQueryElement addClass(String clazz);
    
    JQueryElement removeClass(String clazz);

    Object val();
    
    void on(String event, Function fn);
    
    void click(Function fn);

    JQueryElement attr(String attr, Object value);
    
    JQueryElement before(JQueryElement element);
    
    JQueryElement prepend(JQueryElement element);
    
    public void trigger(String select, Object... params);
    
    

    public static class Static {

        public static native JQueryElement $(String selector) /*-{
         return $wnd.$(selector);
         }-*/;

        public static native JQueryElement $(JQueryElement element) /*-{
         return $wnd.$(element);
         }-*/;

        public static native JQueryElement $(Element element) /*-{
         return $wnd.$(element);
         }-*/;
    }
}
