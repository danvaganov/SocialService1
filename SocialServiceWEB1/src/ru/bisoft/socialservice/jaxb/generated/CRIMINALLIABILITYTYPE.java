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
 * <p>Java class for CRIMINALLIABILITYTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRIMINALLIABILITYTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATEATTRACTION" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ARTICLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATECLEARING" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="YEARSCLEARING" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MONTHSCLEARING" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MEASUREPUNISHMENT" type="{}MEASUREPUNISHMENTTYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRIMINALLIABILITYTYPE", propOrder = {
    "dateattraction",
    "article",
    "note",
    "dateclearing",
    "yearsclearing",
    "monthsclearing",
    "measurepunishment"
})
public class CRIMINALLIABILITYTYPE {

    @XmlElement(name = "DATEATTRACTION", required = true, type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date dateattraction;
    @XmlElement(name = "ARTICLE", required = true)
    protected String article;
    @XmlElement(name = "NOTE", required = true)
    protected String note;
    @XmlElement(name = "DATECLEARING", required = true, type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date dateclearing;
    @XmlElement(name = "YEARSCLEARING")
    protected int yearsclearing;
    @XmlElement(name = "MONTHSCLEARING")
    protected int monthsclearing;
    @XmlElement(name = "MEASUREPUNISHMENT", required = true)
    protected MEASUREPUNISHMENTTYPE measurepunishment;

    /**
     * Gets the value of the dateattraction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDATEATTRACTION() {
        return dateattraction;
    }

    /**
     * Sets the value of the dateattraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEATTRACTION(Date value) {
        this.dateattraction = value;
    }

    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARTICLE() {
        return article;
    }

    /**
     * Sets the value of the article property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARTICLE(String value) {
        this.article = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTE() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTE(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the dateclearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDATECLEARING() {
        return dateclearing;
    }

    /**
     * Sets the value of the dateclearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATECLEARING(Date value) {
        this.dateclearing = value;
    }

    /**
     * Gets the value of the yearsclearing property.
     * 
     */
    public int getYEARSCLEARING() {
        return yearsclearing;
    }

    /**
     * Sets the value of the yearsclearing property.
     * 
     */
    public void setYEARSCLEARING(int value) {
        this.yearsclearing = value;
    }

    /**
     * Gets the value of the monthsclearing property.
     * 
     */
    public int getMONTHSCLEARING() {
        return monthsclearing;
    }

    /**
     * Sets the value of the monthsclearing property.
     * 
     */
    public void setMONTHSCLEARING(int value) {
        this.monthsclearing = value;
    }

    /**
     * Gets the value of the measurepunishment property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREPUNISHMENTTYPE }
     *     
     */
    public MEASUREPUNISHMENTTYPE getMEASUREPUNISHMENT() {
        return measurepunishment;
    }

    /**
     * Sets the value of the measurepunishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREPUNISHMENTTYPE }
     *     
     */
    public void setMEASUREPUNISHMENT(MEASUREPUNISHMENTTYPE value) {
        this.measurepunishment = value;
    }

}