package dao;

import java.util.List;

import domain.ProjectTeamBean;

public class ProjectTeamDAOImpl implements ProjectTeamDAO {
	private static ProjectTeamDAOImpl instance = new ProjectTeamDAOImpl();
	public static ProjectTeamDAOImpl getInstance() {return instance;}
	private ProjectTeamDAOImpl() {}
	
	@Override
	public void createProjectTeam(ProjectTeamBean projectTeam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProjectTeamBean> projectTeamList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectTeamBean> findProjectTeamByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int projectTeamCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProjectTeamBean findProjectTeamById(ProjectTeamBean projectTeam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProjectTeamInformation(ProjectTeamBean projectTeam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProjectTeamInformation(ProjectTeamBean projectTeam) {
		// TODO Auto-generated method stub
		
	}

}
