//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.02 at 05:10:58 PM YEKT 
//


package ru.bisoft.socialservice.jaxb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RELATIONSHIPTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RELATIONSHIPTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEY_RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DEGREE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INACTIVE_RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RELATIONSHIPTYPE", propOrder = {
    "keyrelationship",
    "degree",
    "inactiverelationship"
})
public class RELATIONSHIPTYPE {

    @XmlElement(name = "KEY_RELATIONSHIP")
    protected int keyrelationship;
    @XmlElement(name = "DEGREE", required = true)
    protected String degree;
    @XmlElement(name = "INACTIVE_RELATIONSHIP")
    protected int inactiverelationship;

    /**
     * Gets the value of the keyrelationship property.
     * 
     */
    public int getKEYRELATIONSHIP() {
        return keyrelationship;
    }

    /**
     * Sets the value of the keyrelationship property.
     * 
     */
    public void setKEYRELATIONSHIP(int value) {
        this.keyrelationship = value;
    }

    /**
     * Gets the value of the degree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEGREE() {
        return degree;
    }

    /**
     * Sets the value of the degree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEGREE(String value) {
        this.degree = value;
    }

    /**
     * Gets the value of the inactiverelationship property.
     * 
     */
    public int getINACTIVERELATIONSHIP() {
        return inactiverelationship;
    }

    /**
     * Sets the value of the inactiverelationship property.
     * 
     */
    public void setINACTIVERELATIONSHIP(int value) {
        this.inactiverelationship = value;
    }

}