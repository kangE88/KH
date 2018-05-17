package dao;

import classes.deleteClass;
import classes.insertClass;
import classes.selectClass;
import classes.updateClass;
import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.fileClass;
import file.fileInter;
import singleton.Delegate;

public class DaoClass implements DaoInter {
		
	fileInter fcls;
	
	insertClass _insert;
	deleteClass _delete;
	selectClass _select;
	updateClass _update;

	public DaoClass() {
		
		_insert = new insertClass();
		_delete = new deleteClass();
		_select = new selectClass();
		_update = new updateClass();
		
		fcls = new fileClass("member");
		fcls.createFile();
		
		loadData();		
	}
	
	@Override
	public void insert() {
		_insert.dataInsert();
	}

	@Override
	public void delete() {
		_delete.dataDelete();
	}

	@Override
	public void select() {
		_select.dataSelect();
	}

	@Override
	public void update() {
		_update.dataUpdate();
	}

	@Override
	public void allPrint() {
		
		Delegate single = Delegate.getInstance();
		
		for (int i = 0; i < single.list.size(); i++) {
			if(single.list.get(i) instanceof Pitcher) {
				Pitcher pit = (Pitcher)single.list.get(i);
				System.out.println(pit.toString());
			}
			else {
				Batter bat = (Batter)single.list.get(i);
				System.out.println(bat.toString());
			}
		}	
	}

	@Override
	public void saveData() {
		fcls.writeFile();
	}

	@Override
	public void loadData() {
		fcls.readFile();
	}

}
