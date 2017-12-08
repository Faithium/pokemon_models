package my_pokedex.model.move;

public enum EFFECTIVENESS {
	NORMAL(1f),
	WEAK(2f),
	IMMUNE(0f),
	RESISTANT(0.5f);
	
	private float value;
	
	EFFECTIVENESS(float value) {
		this.value = value;
	}
	
	public float getValue() {
		return this.value;
	}
}
