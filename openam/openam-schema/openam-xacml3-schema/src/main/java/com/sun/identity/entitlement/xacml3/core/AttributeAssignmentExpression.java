//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:26:55 AM PDT 
//


package com.sun.identity.entitlement.xacml3.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeAssignmentExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeAssignmentExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:cd-1}Expression"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeAssignmentExpressionType", propOrder = {
    "expression"
})
public class AttributeAssignmentExpression {

    @XmlElementRef(name = "Expression", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:cd-1", type = JAXBElement.class)
    protected JAXBElement<?> expression;
    @XmlAttribute(name = "AttributeId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String attributeId;
    @XmlAttribute(name = "Category")
    @XmlSchemaType(name = "anyURI")
    protected String category;
    @XmlAttribute(name = "Issuer")
    protected String issuer;

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VariableReference }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttributeValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link Apply }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttributeSelector }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttributeDesignator }{@code >}
     *     {@link JAXBElement }{@code <}{@link Function }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expression }{@code >}
     *     
     */
    public JAXBElement<?> getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VariableReference }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttributeValue }{@code >}
     *     {@link JAXBElement }{@code <}{@link Apply }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttributeSelector }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttributeDesignator }{@code >}
     *     {@link JAXBElement }{@code <}{@link Function }{@code >}
     *     {@link JAXBElement }{@code <}{@link Expression }{@code >}
     *     
     */
    public void setExpression(JAXBElement<?> value) {
        this.expression = ((JAXBElement<?> ) value);
    }

    /**
     * Gets the value of the attributeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeId() {
        return attributeId;
    }

    /**
     * Sets the value of the attributeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeId(String value) {
        this.attributeId = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

}