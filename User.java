public class User {

	
	private String fn;
	private String ln;
	private int age;
	private String adr;
	private String phone;
	
	private User(Builder builder) {
		this.ln = builder.ln;
		this.fn = builder.fn;
	}
	
	public String toString() {
		return "ln"+this.ln+"fn"+this.fn;
	}
	
	public static class Builder{
		private String fn;
		private String ln;
		private int age;
		private String adr;
		private String phone;
		
		public Builder fn(String fn) {
			this.fn = fn;
			return this;
		}
		
		public Builder ln(String ln) {
			this.ln = ln;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new User.Builder()
		.ln("vidisha")
		.build());
	}
}
