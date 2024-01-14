//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 08:24:17 PM PDT 
//


package config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}ExperimentReference"/>
 *         &lt;element ref="{}Filter" minOccurs="0"/>
 *         &lt;element ref="{}Length"/>
 *         &lt;element ref="{}ModelID"/>
 *         &lt;element ref="{}MarkovModelMethod"/>
 *         &lt;element ref="{}InformationGainValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "experimentReference",
    "filter",
    "length",
    "modelID",
    "markovModelMethod",
    "informationGainValue"
})
@XmlRootElement(name = "InformationGainStats")
public class InformationGainStats {

    @XmlElement(name = "ExperimentReference", required = true)
    protected ExperimentReference experimentReference;
    @XmlElement(name = "Filter", defaultValue = "")
    protected String filter;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElement(name = "ModelID", required = true)
    protected String modelID;
    @XmlElement(name = "MarkovModelMethod", required = true)
    protected String markovModelMethod;
    @XmlElement(name = "InformationGainValue")
    protected double informationGainValue;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the experimentReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentReference }
     *     
     */
    public ExperimentReference getExperimentReference() {
        return experimentReference;
    }

    /**
     * Sets the value of the experimentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentReference }
     *     
     */
    public void setExperimentReference(ExperimentReference value) {
        this.experimentReference = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Gets the value of the modelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelID() {
        return modelID;
    }

    /**
     * Sets the value of the modelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelID(String value) {
        this.modelID = value;
    }

    /**
     * Gets the value of the markovModelMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkovModelMethod() {
        return markovModelMethod;
    }

    /**
     * Sets the value of the markovModelMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkovModelMethod(String value) {
        this.markovModelMethod = value;
    }

    /**
     * Gets the value of the informationGainValue property.
     * 
     */
    public double getInformationGainValue() {
        return informationGainValue;
    }

    /**
     * Sets the value of the informationGainValue property.
     * 
     */
    public void setInformationGainValue(double value) {
        this.informationGainValue = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
