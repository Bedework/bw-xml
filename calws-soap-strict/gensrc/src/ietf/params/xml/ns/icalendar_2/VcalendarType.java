
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         This type is the basis for all components and provides a base class for
 *         applications.
 *       
 * 
 * <p>Java class for VcalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VcalendarType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="components" type="{urn:ietf:params:xml:ns:icalendar-2.0}ArrayOfVcalendarContainedComponents"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VcalendarType", propOrder = {
    "components"
})
public class VcalendarType
    extends BaseComponentType
{

    @XmlElement(required = true)
    protected ArrayOfVcalendarContainedComponents components;

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVcalendarContainedComponents }
     *     
     */
    public ArrayOfVcalendarContainedComponents getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVcalendarContainedComponents }
     *     
     */
    public void setComponents(ArrayOfVcalendarContainedComponents value) {
        this.components = value;
    }

}
