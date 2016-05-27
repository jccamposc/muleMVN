/**
 * 
 */
package com.isban.us.util;

import java.util.LinkedList;
import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

/**
 * @author Z782868
 *
 */
public class DummyObject implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		MuleMessage message = eventContext.getMessage();
		
		Map<String, LinkedList<String>>  parametros = 
								message.getInboundProperty("http.query.params");
		
		
		
		Persona persona = new Persona(String.valueOf(parametros.get("nombre")),
				String.valueOf(parametros.get("apellido")), 
				String.valueOf(parametros.get("edad")));
		message.setPayload(persona);
		

		return message;
	}
	

}
