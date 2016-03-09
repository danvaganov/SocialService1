//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.02 at 05:10:58 PM YEKT 
//


package ru.bisoft.socialservice.jaxb.generated;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ru.bisoft.socialservice.jaxb.adapter.DateAdapter;


/**
 * <p>Java class for PHYSICALINABILITYTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PHYSICALINABILITYTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GROUPINABILITY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CHILDINVALID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ESTABLISHED" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REEXAMINATIONTERM" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="REASON" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BEGINNING" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PHYSICALINABILITYTYPE", propOrder = {
    "groupinability",
    "childinvalid",
    "established",
    "reexaminationterm",
    "reason",
    "beginning",
    "comment"
})
public class PHYSICALINABILITYTYPE {

    @XmlElement(name = "GROUPINABILITY", required = true, type = Integer.class, nillable = true)
    protected Integer groupinability;
    @XmlElement(name = "CHILDINVALID")
    protected int childinvalid;
    @XmlElement(name = "ESTABLISHED", required = true)
    protected String established;
    @XmlElement(name = "REEXAMINATIONTERM", required = true, type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date reexaminationterm;
    @XmlElement(name = "REASON", required = true)
    protected String reason;
    @XmlElement(name = "BEGINNING", required = true, type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date beginning;
    @XmlElement(name = "COMMENT", required = true)
    protected String comment;

    /**
     * Gets the value of the groupinability property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGROUPINABILITY() {
        return groupinability;
    }

    /**
     * Sets the value of the groupinability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGROUPINABILITY(Integer value) {
        this.groupinability = value;
    }

    /**
     * Gets the value of the childinvalid property.
     * 
     */
    public int getCHILDINVALID() {
        return childinvalid;
    }

    /**
     * Sets the value of the childinvalid property.
     * 
     */
    public void setCHILDINVALID(int value) {
        this.childinvalid = value;
    }

    /**
     * Gets the value of the established property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTABLISHED() {
        return established;
    }

    /**
     * Sets the value of the established property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTABLISHED(String value) {
        this.established = value;
    }

    /**
     * Gets the value of the reexaminationterm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getREEXAMINATIONTERM() {
        return reexaminationterm;
    }

    /**
     * Sets the value of the reexaminationterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREEXAMINATIONTERM(Date value) {
        this.reexaminationterm = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASON() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASON(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the beginning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBEGINNING() {
        return beginning;
    }

    /**
     * Sets the value of the beginning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGINNING(Date value) {
        this.beginning = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMENT() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMENT(String value) {
        this.comment = value;
    }

}