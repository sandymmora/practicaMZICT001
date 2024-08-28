public class costumerDTO {
    private long id;
    private String name;


    public long getId(){
        return this.id;
    }

    public long setId(final long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public String setName(final String name){
        this.name = name;
    }

    @Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final CostumerDTO rhs = (CostumerDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(lastName, rhs.lastName)
					.append(email, rhs.email)
					.append(phone, rhs.phone)
					.append(firstName, rhs.firstName)
					.isEquals();
	}

	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.lastName)
			.append(this.email)
			.append(this.phone)
			.append(this.firstName)
			.toHashCode();
	}

	
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
