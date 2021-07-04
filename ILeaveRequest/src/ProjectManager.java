
public class ProjectManager extends LeaveRequestBaseHandler {

	

	@Override
	public void Process(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		 if(leaveRequest.getNoOfDays()<15)
         {
             System.out.println("Leave approved by Project Manager");
         }
         else
         {
             _leaveRequestBaseHandler.Process(leaveRequest);
         }
		
	}

	
	
	

}
