
package ietf.params.xml.ns.icalendar_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGluonContainedComponents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGluonContainedComponents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vavailability"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGluonContainedComponents", propOrder = {
    "vavailability"
})
public class ArrayOfGluonContainedComponents {

    protected List<VavailabilityType> vavailability;

    /**
     * Gets the value of the vavailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vavailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVavailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VavailabilityType }
     * 
     * 
     */
    public List<VavailabilityType> getVavailability() {
        if (vavailability == null) {
            vavailability = new ArrayList<VavailabilityType>();
        }
        return this.vavailability;
    }

}
