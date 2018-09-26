/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://oss.oracle.com/licenses/CDDL+GPL-1.1
 * or LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.faces.extensions.avatar.taglib;

import com.sun.faces.extensions.avatar.components.AjaxZone;
import java.util.List;
import java.util.Map;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.webapp.UIComponentELTag;
import javax.servlet.jsp.JspException;

public class AjaxZoneTag extends UIComponentELTag {
    /** 
     * <p>Return the requested component type.</p> 
     */ 
    public String getComponentType() { 
        return "com.sun.faces.AjaxZone"; 
    } 
 
    /** 
     * <p>Return the requested renderer type.</p> 
     */ 
    public String getRendererType() { 
        return "com.sun.faces.AjaxZone"; 
    }
    
    private ValueExpression style = null;
    private ValueExpression styleClass = null;
    
    public void setStyle(ValueExpression ve) {
        style = ve;
    }
    
    public void setStyleClass(ValueExpression ve) {
        styleClass = ve;
    }
    
    protected void setProperties(UIComponent comp) {
        super.setProperties(comp);
        
        AjaxZone component = (AjaxZone) comp;
        
        if (null != style) {
            if (style.isLiteralText()) {
                component.getAttributes().put("style", style.getValue(getFacesContext().getELContext()));
            }
            else {
                component.setValueExpression("style", style);
            }
        }
        if (null != styleClass) {
            if (styleClass.isLiteralText()) {
                component.getAttributes().put("styleClass", styleClass.getValue(getFacesContext().getELContext()));
            }
            else {
                component.setValueExpression("styleClass", styleClass);
            }
        }
        if (null != collectPostData) {
            if (collectPostData.isLiteralText()) {
                component.getAttributes().put("collectPostData", collectPostData.getValue(getFacesContext().getELContext()));
            }
            else {
                component.setValueExpression("collectPostData", collectPostData);
            }
        }
        if (null != eventType) {
            if (eventType.isLiteralText()) {
                component.getAttributes().put("eventType", eventType.getValue(getFacesContext().getELContext()));
            }
            else {
                component.setValueExpression("eventType", eventType);
            }
        }
        if (null != inspectElement) {
            if (inspectElement.isLiteralText()) {
                component.getAttributes().put("inspectElement", inspectElement.getValue(getFacesContext().getELContext()));
            }
            else {
                component.setValueExpression("inspectElement", inspectElement);
            }
        }
        if (null != replaceElement) {
            if (replaceElement.isLiteralText()) {
                component.getAttributes().put("replaceElement", replaceElement.getValue(getFacesContext().getELContext()));
            }
            else {
                component.setValueExpression("replaceElement", replaceElement);
            }
        }
        if (null != postReplace) {
            if (postReplace.isLiteralText()) {
                component.getAttributes().put("postReplace", postReplace.getValue(getFacesContext().getELContext()));
            }
            else {
                component.setValueExpression("postReplace", postReplace);
            }
        }
        if (null != getCallbackData) {
            if (getCallbackData.isLiteralText()) {
                component.getAttributes().put("getCallbackData", getCallbackData.getValue(getFacesContext().getELContext()));
            }
            else {
                component.setValueExpression("getCallbackData", getCallbackData);
            }
        }
        if (null != execute) {
            if (execute.isLiteralText()) {
                component.getAttributes().put("execute", execute.getValue(getFacesContext().getELContext()));
            }
            else {
                component.setValueExpression("execute", execute);
            }
        }
        if (null != render) {
            if (render.isLiteralText()) {
                component.getAttributes().put("render", render.getValue(getFacesContext().getELContext()));
            }
            else {
                component.setValueExpression("render", render);
            }
        }
        if (action != null) {
            component.setActionExpression(action);
        }
        if (immediate != null) {
            if (!immediate.isLiteralText()) {
                component.setValueExpression("immediate", immediate);
            } else {
                component.setImmediate(java.lang.Boolean.valueOf(immediate.getExpressionString()).booleanValue());
            }
        }
        
        
        
    }

    /**
     * Holds value of property eventType.
     */
    private ValueExpression eventType;

    /**
     * Setter for property eventType.
     * @param eventType New value of property eventType.
     */
    public void setEventType(ValueExpression eventType) {
        this.eventType = eventType;
    }

    /**
     * Holds value of property collectPostData.
     */
    private ValueExpression collectPostData;

    /**
     * Setter for property collectPostData.
     * @param collectPostData New value of property collectPostData.
     */
    public void setCollectPostData(ValueExpression collectPostData) {
        this.collectPostData = collectPostData;
    }

    /**
     * Holds value of property inspectElement.
     */
    private ValueExpression inspectElement;

    /**
     * Setter for property inspectElement.
     * @param inspectElement New value of property inspectElement.
     */
    public void setInspectElement(ValueExpression inspectElement) {
        this.inspectElement = inspectElement;
    }

    /**
     * Holds value of property action.
     */
    private MethodExpression action;

    /**
     * Setter for property action.
     * @param action New value of property action.
     */
    public void setAction(MethodExpression action) {
        this.action = action;
    }

    /**
     * Holds value of property immediate.
     */
    private ValueExpression immediate;

    /**
     * Setter for property immediate.
     * @param immediate New value of property immediate.
     */
    public void setImmediate(ValueExpression immediate) {
        this.immediate = immediate;
    }

    /**
     * Holds value of property postReplace.
     */
    private ValueExpression postReplace;

    /**
     * Setter for property postReplace.
     * @param postReplace New value of property postReplace.
     */
    public void setPostReplace(ValueExpression postReplace) {
        this.postReplace = postReplace;
    }

    /**
     * Holds value of property replaceElement.
     */
    private ValueExpression replaceElement;

    /**
     * Setter for property replaceElement.
     * @param replaceElement New value of property replaceElement.
     */
    public void setReplaceElementHook(ValueExpression replaceElement) {
        this.replaceElement = replaceElement;
    }

    /**
     * Holds value of property getCallbackData.
     */
    private ValueExpression getCallbackData;

    /**
     * Setter for property getCallbackData.
     * @param getCallbackData New value of property getCallbackData.
     */
    public void setGetCallbackData(ValueExpression getCallbackData) {
        this.getCallbackData = getCallbackData;
    }

    /**
     * Holds value of property execute.
     */
    private ValueExpression execute;

    /**
     * Getter for property execute.
     * @return Value of property execute.
     */
    public ValueExpression getExecute() {
        return this.execute;
    }

    /**
     * Setter for property execute.
     * @param execute New value of property execute.
     */
    public void setExecute(ValueExpression execute) {
        this.execute = execute;
    }

    /**
     * Holds value of property render.
     */
    private ValueExpression render;

    /**
     * Getter for property render.
     * @return Value of property render.
     */
    public ValueExpression getRender() {
        return this.render;
    }

    /**
     * Setter for property render.
     * @param render New value of property render.
     */
    public void setRender(ValueExpression render) {
        this.render = render;
    }
    
    
}
