package com.bbva.mzic.dto.proyecto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The ExampleDTO class...
 */
public class ExampleDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */

	String lastName;
	String email;
	String phone;
	String firstName;
	CostumerDto CostumerDto; 

	


	public String getLastName(){
		return this.name;
	}
	public String setLastName(final String lastName){
		this.lastName = lastName;
	}
	 * Get the name attribute
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Set the name attribute
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * Get the surname attribute
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * Set the surname attribute
	 */
	public void setPhone(final String phone) {
		this.phone = phone;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(final String firstName){
		this.firstName = firstName;
	}
	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final ExampleDTO rhs = (ExampleDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(lastName, rhs.lastName)
					.append(email, rhs.email)
					.append(phone, rhs.phone)
					.append(firstName, rhs.firstName)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.lastName)
			.append(this.email)
			.append(this.phone)
			.append(this.firstName)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("lastName", lastName)
			.append("email", email)
			.append("phone", phone)
			.append("firstName", firstName)
			.toString();
	}
}
