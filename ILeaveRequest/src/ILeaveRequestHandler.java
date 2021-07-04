
public interface ILeaveRequestHandler {
	void SetNextSuccessor(ILeaveRequestHandler leaveRequestHandler);
    void Process(LeaveRequest leaveRequest);
}
