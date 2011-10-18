
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Timezones only contain daylight and standard
 *       
 * 
 * <p>Java class for VtimezoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VtimezoneType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="components" type="{urn:ietf:params:xml:ns:icalendar-2.0}ArrayOfTimezoneContainedComponents"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VtimezoneType", propOrder = {
    "components"
})
public class VtimezoneType
    extends BaseComponentType
{

    @XmlElement(required = true)
    protected ArrayOfTimezoneContainedComponents components;

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimezoneContainedComponents }
     *     
     */
    public ArrayOfTimezoneContainedComponents getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimezoneContainedComponents }
     *     
     */
    public void setComponents(ArrayOfTimezoneContainedComponents value) {
        this.components = value;
    }

}
