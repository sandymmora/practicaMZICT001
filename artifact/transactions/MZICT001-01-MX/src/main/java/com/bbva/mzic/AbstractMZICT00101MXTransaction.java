package com.bbva.mzic;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.mzic.dto.costumer.CostumerDTO;
import com.bbva.mzic.dto.letter.LetterDTO;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractMZICT00101MXTransaction extends AbstractTransaction {

	public AbstractMZICT00101MXTransaction(){
	}


	/**
	 * Return value for input parameter name
	 */
	protected String getName(){
		return (String)this.getParameter("name");
	}

	/**
	 * Return value for input parameter CostumerDTO
	 */
	protected CostumerDTO getCostumerdto(){
		return (CostumerDTO)this.getParameter("CostumerDTO");
	}

	/**
	 * Return value for input parameter phone
	 */
	protected Long getPhone(){
		return (Long)this.getParameter("phone");
	}

	/**
	 * Return value for input parameter lastName
	 */
	protected String getLastname(){
		return (String)this.getParameter("lastName");
	}

	/**
	 * Return value for input parameter email
	 */
	protected String getEmail(){
		return (String)this.getParameter("email");
	}

	/**
	 * Set value for LetterDTO output parameter LetterDTO
	 */
	protected void setLetterdto(final LetterDTO field){
		this.addParameter("LetterDTO", field);
	}

	/**
	 * Set value for String output parameter name
	 */
	protected void setName(final String field){
		this.addParameter("name", field);
	}

	/**
	 * Set value for String output parameter lastName
	 */
	protected void setLastname(final String field){
		this.addParameter("lastName", field);
	}

	/**
	 * Set value for Long output parameter secuence
	 */
	protected void setSecuence(final Long field){
		this.addParameter("secuence", field);
	}

	/**
	 * Set value for Long output parameter phone
	 */
	protected void setPhone(final Long field){
		this.addParameter("phone", field);
	}
}
