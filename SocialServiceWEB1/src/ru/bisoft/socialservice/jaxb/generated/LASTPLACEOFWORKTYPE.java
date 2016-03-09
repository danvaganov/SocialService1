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
 * <p>Java class for LASTPLACEOFWORKTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LASTPLACEOFWORKTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORGANIZATION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WORKPLACE" type="{}WORKPLACETYPE"/>
 *         &lt;element name="INDEX_LASTPLACEOFWORK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CITY_LASTPLACEOFWORK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UL_LASTPLACEOFWORK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HOUSE_LASTPLACEOFWORK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PHONE_LASTPLACEOFWORK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LASTPLACEOFWORKTYPE", propOrder = {
    "organization",
    "post",
    "workplace",
    "indexlastplaceofwork",
    "citylastplaceofwork",
    "ullastplaceofwork",
    "houselastplaceofwork",
    "phonelastplaceofwork"
})
public class LASTPLACEOFWORKTYPE {

    @XmlElement(name = "ORGANIZATION", required = true)
    protected String organization;
    @XmlElement(name = "POST", required = true)
    protected String post;
    @XmlElement(name = "WORKPLACE", required = true)
    protected WORKPLACETYPE workplace;
    @XmlElement(name = "INDEX_LASTPLACEOFWORK", required = true)
    protected String indexlastplaceofwork;
    @XmlElement(name = "CITY_LASTPLACEOFWORK", required = true)
    protected String citylastplaceofwork;
    @XmlElement(name = "UL_LASTPLACEOFWORK", required = true)
    protected String ullastplaceofwork;
    @XmlElement(name = "HOUSE_LASTPLACEOFWORK", required = true)
    protected String houselastplaceofwork;
    @XmlElement(name = "PHONE_LASTPLACEOFWORK", required = true)
    protected String phonelastplaceofwork;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGANIZATION() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGANIZATION(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOST() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOST(String value) {
        this.post = value;
    }

    /**
     * Gets the value of the workplace property.
     * 
     * @return
     *     possible object is
     *     {@link WORKPLACETYPE }
     *     
     */
    public WORKPLACETYPE getWORKPLACE() {
        return workplace;
    }

    /**
     * Sets the value of the workplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link WORKPLACETYPE }
     *     
     */
    public void setWORKPLACE(WORKPLACETYPE value) {
        this.workplace = value;
    }

    /**
     * Gets the value of the indexlastplaceofwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDEXLASTPLACEOFWORK() {
        return indexlastplaceofwork;
    }

    /**
     * Sets the value of the indexlastplaceofwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDEXLASTPLACEOFWORK(String value) {
        this.indexlastplaceofwork = value;
    }

    /**
     * Gets the value of the citylastplaceofwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITYLASTPLACEOFWORK() {
        return citylastplaceofwork;
    }

    /**
     * Sets the value of the citylastplaceofwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITYLASTPLACEOFWORK(String value) {
        this.citylastplaceofwork = value;
    }

    /**
     * Gets the value of the ullastplaceofwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULLASTPLACEOFWORK() {
        return ullastplaceofwork;
    }

    /**
     * Sets the value of the ullastplaceofwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULLASTPLACEOFWORK(String value) {
        this.ullastplaceofwork = value;
    }

    /**
     * Gets the value of the houselastplaceofwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOUSELASTPLACEOFWORK() {
        return houselastplaceofwork;
    }

    /**
     * Sets the value of the houselastplaceofwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOUSELASTPLACEOFWORK(String value) {
        this.houselastplaceofwork = value;
    }

    /**
     * Gets the value of the phonelastplaceofwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONELASTPLACEOFWORK() {
        return phonelastplaceofwork;
    }

    /**
     * Sets the value of the phonelastplaceofwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONELASTPLACEOFWORK(String value) {
        this.phonelastplaceofwork = value;
    }

}