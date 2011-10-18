
package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *        reltypeparam       = "RELTYPE" "="
 *                            ("PARENT"    ; Parent relationship - Default
 *                           / "CHILD"     ; Child relationship
 *                           / "SIBLING"   ; Sibling relationship
 *                           / iana-token  ; Some other IANA-registered
 *                                         ; iCalendar relationship type
 *                           / x-name)     ; A non-standard, experimental
 *                                         ; relationship type
 *         Ws-Calendar adds the values
 *                            / "FINISHTOSTART"
 *                            / "FINISHTOFINISH"
 *                            / "STARTTOFINISH"
 *                            / "STARTTOSTART"             
 *                            
 *        ; Default is PARENT
 *       
 * 
 * <p>Java class for ReltypeParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReltypeParamType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}TextParameterType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReltypeParamType")
public class ReltypeParamType
    extends TextParameterType
{


}
