//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.22 at 12:56:38 PM GMT 
//


package org.miase.jlibsedml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.miase.org/}listOfVariables"/>
 *         &lt;element ref="{http://www.miase.org/}listOfParameters"/>
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *       &lt;/sequence>
 *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfVariables",
    "listOfParameters",
    "math"
})
@XmlRootElement(name = "changeMath")
public class ChangeMath {

    @XmlElement(required = true)
    protected ListOfVariables listOfVariables;
    @XmlElement(required = true)
    protected ListOfParameters listOfParameters;
    @XmlElement(namespace = "http://www.w3.org/1998/Math/MathML", required = true)
    protected Math math;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String target;

    /**
     * Gets the value of the listOfVariables property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfVariables }
     *     
     */
    public ListOfVariables getListOfVariables() {
        return listOfVariables;
    }

    /**
     * Sets the value of the listOfVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfVariables }
     *     
     */
    public void setListOfVariables(ListOfVariables value) {
        this.listOfVariables = value;
    }

    /**
     * Gets the value of the listOfParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfParameters }
     *     
     */
    public ListOfParameters getListOfParameters() {
        return listOfParameters;
    }

    /**
     * Sets the value of the listOfParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfParameters }
     *     
     */
    public void setListOfParameters(ListOfParameters value) {
        this.listOfParameters = value;
    }

    /**
     * Gets the value of the math property.
     * 
     * @return
     *     possible object is
     *     {@link Math }
     *     
     */
    public Math getMath() {
        return math;
    }

    /**
     * Sets the value of the math property.
     * 
     * @param value
     *     allowed object is
     *     {@link Math }
     *     
     */
    public void setMath(Math value) {
        this.math = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

}