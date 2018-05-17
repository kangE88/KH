package file;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dto.Human;

public interface fileInter {

	public void createFile();
	ArrayList<Human> readFile();
	public void writeFile(ArrayList<Human> list);
}
