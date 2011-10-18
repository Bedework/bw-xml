
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalAddressParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalAddressParamType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BaseParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}cal-address"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalAddressParamType", propOrder = {
    "calAddress"
})
@XmlSeeAlso({
    SentByParamType.class
})
public class CalAddressParamType
    extends BaseParameterType
{

    @XmlElement(name = "cal-address", required = true)
    protected String calAddress;

    /**
     * Gets the value of the calAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalAddress() {
        return calAddress;
    }

    /**
     * Sets the value of the calAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalAddress(String value) {
        this.calAddress = value;
    }

}
