package ui;


import asciiPanel.AsciiPanel;
import java.util.List;

public class PlayScreenProduct {
	private int screenHeight;
	private Screen subscreen;

	public int getScreenHeight() {
		return screenHeight;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	public Screen getSubscreen() {
		return subscreen;
	}

	public void setSubscreen(Screen subscreen) {
		this.subscreen = subscreen;
	}

	public void displayMessages(AsciiPanel terminal, List<String> messages) {
		int top = screenHeight - messages.size();
		for (int i = 0; i < messages.size(); i++) {
			terminal.writeCenter(messages.get(i), top + i);
		}
		if (subscreen == null)
			messages.clear();
	}
}