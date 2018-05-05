public class Tdd {
    public static void main(String[] args) {

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/customers", "root", "root");
		System.out.println("success");
    }
	catch (Exception e) {
		e.printStackTrace();
	}
    }
}
