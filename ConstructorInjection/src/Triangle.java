public class Triangle {
	private String type;
	private int height;
	
   
	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
		System.out.println(getType() +" Triangle drawn"+" Height "+ getHeight());
	}
}
