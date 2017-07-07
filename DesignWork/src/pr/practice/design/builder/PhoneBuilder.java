package pr.practice.design.builder;

public class PhoneBuilder {

	private String os;
	private String ram;
	private String camera;
	private String battary;
	private String processor;
	
	public PhoneBuilder(Builder builder) {
		this.os= builder.os;
		this.ram= builder.ram;
		this.camera= builder.camera;
		this.battary= builder.battary;
		this.processor= builder.processor;
	}
	
	public String getOs() {
		return this.os;
	}
	public String getRam() {
		return this.ram;
	}
	public String getCamera() {
		return this.camera;
	}
	public String getBattary() {
		return this.battary;
	}
	public String getProcessor() {
		return this.processor;
	}
	
	public static class Builder{
		private String os;
		private String ram;
		private String camera;
		private String battary;
		private String processor;
		
		public Builder setOs(String os) {
			this.os = os;
			return this;
		}
		public Builder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		public Builder setCamera(String camera) {
			this.camera = camera;
			return this;
		}
		public Builder setBattary(String battary) {
			this.battary = battary;
			return this;
		}
		public Builder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}
		
		public PhoneBuilder build()
		{
			return new PhoneBuilder(this);
		}		
	}
	
	@Override
	public String toString()
	{
		return "Yor want a Phone with,\n \n"
	+ " OS 		:" +os+"\n"
				+ " RAM  		:" +ram+"\n"
	+ " Camera 	:" +camera+"\n"
				+ " Battary 	:" +battary+"\n"
	+ " Processor 	:" +processor+"\n";				
	}
}
