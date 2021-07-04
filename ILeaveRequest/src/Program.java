
public class Program {
	public static void main(String[] args)
	{
		LeaveRequest lr = new LeaveRequest();
		lr.setEmployeeId(123);
		lr.setNoOfDays(60);
		ILeaveRequestHandler leaveRequestSupervisorHandler = new Supervisor();
		ILeaveRequestHandler leaveRequestManagerHandler = new ProjectManager();
		ILeaveRequestHandler leaveRequestHRHandler = new HR();
		
		leaveRequestSupervisorHandler.SetNextSuccessor(leaveRequestManagerHandler);
		leaveRequestManagerHandler.SetNextSuccessor(leaveRequestHRHandler);
		
		leaveRequestSupervisorHandler.Process(lr);
		lr.setNoOfDays(14);
		leaveRequestSupervisorHandler.Process(lr);
		lr.setNoOfDays(1);
		leaveRequestSupervisorHandler.Process(lr);
		
		
		
	}

}
