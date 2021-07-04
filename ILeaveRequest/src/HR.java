 
public class HR extends LeaveRequestBaseHandler{

	
	@Override
	public void Process(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		 if(leaveRequest.getNoOfDays()>30)
         {
             System.out.println("Leave approved by HR");
         }
         else
         {
             _leaveRequestBaseHandler.Process(leaveRequest);
         }
		
	}

	

	
		
	

	
}
