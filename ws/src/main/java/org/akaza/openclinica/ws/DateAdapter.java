/*
 * LibreClinica is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://libreclinica.org/license
 * LibreClinica, copyright (C) 2020
 */
package org.akaza.openclinica.ws;


import org.akaza.openclinica.exception.OpenClinicaSystemException;

import java.util.Date;
import java.text.SimpleDateFormat;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateAdapter extends XmlAdapter<String, Date> {

    // the desired format
    private String pattern = "MM/dd/yyyy";
    
    public String marshal(Date date) throws Exception {
        return new SimpleDateFormat(pattern).format(date);
    }
    
    public Date unmarshal(String dateString) throws Exception {
        throw new OpenClinicaSystemException("Please implement me!!");
    } 
    
}

