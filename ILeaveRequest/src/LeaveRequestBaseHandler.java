
public abstract class LeaveRequestBaseHandler implements ILeaveRequestHandler {
	protected ILeaveRequestHandler _leaveRequestBaseHandler;

    public abstract void Process(LeaveRequest leaveRequest);

    public void SetNextSuccessor(ILeaveRequestHandler leaveRequestHandler)
    {
        this._leaveRequestBaseHandler = leaveRequestHandler;
    }

}
