public class room {
	public int num;
	private String description;

	public exit[] Exits = {new exit(), new exit()};
	public item localItem = new item();

	public String getDescription() {
		return description;
	}
	public void setDiscription(String des) {
		description = des;
	}

}