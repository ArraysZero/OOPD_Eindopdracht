package nl.HAN.game.Pizza;

public interface ViewWorld {
	void saveWorld(String world);

	World loadWorld(String world);

	/*
	* void saveData(String data);
	* void saveData(String[] data, String separator);
	*
	* String loadDataString();
	* String[] loadDataStringArray(String separator);
	*
	* boolean fileExists();
	*/
}
