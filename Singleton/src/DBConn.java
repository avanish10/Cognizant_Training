
public class DBConn {
	private  static DBConn dbconn = new DBConn();
	
	public DBConn getInstance()
	{
		DBConn db = new DBConn();
		db  = DBConn.dbconn;
		return db;
		
	}
	private DBConn()
	{
		
	}
	

}
