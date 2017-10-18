
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoEmailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEmailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEmailType", namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r2/email")
@XmlEnum
public enum TipoEmailType {

    P,
    A;

    public String value() {
        return name();
    }

    public static TipoEmailType fromValue(String v) {
        return valueOf(v);
    }

}
