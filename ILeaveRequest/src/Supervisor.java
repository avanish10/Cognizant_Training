
public class Supervisor extends LeaveRequestBaseHandler{


	@Override
	public void Process(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		 if(leaveRequest.getNoOfDays()==1)
         {
             System.out.println("Leave approved by team lead");
         }
         else
         {
             _leaveRequestBaseHandler.Process(leaveRequest);
         }
		
	}

	
	

}
