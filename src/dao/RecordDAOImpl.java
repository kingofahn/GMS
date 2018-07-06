package dao;

import java.util.List;

import domain.RecordBean;

public class RecordDAOImpl implements RecordDAO{

	private static RecordDAOImpl instance = new RecordDAOImpl();
	public static RecordDAOImpl getInstance() {return instance;}
	private RecordDAOImpl() {}
	
	@Override
	public void createRecord(RecordBean record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RecordBean> recordBeanList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecordBean> findRecordByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecordBean findRecordTeamById(RecordBean record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int recordCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateRecord(RecordBean record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRecord(RecordBean record) {
		// TODO Auto-generated method stub
		
	}

}
