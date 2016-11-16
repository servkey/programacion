import conexion.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.*;

class Test{
	private int personID;
	private String lastName;
	private String firstName;
	private String address;
	private String city;

	public int getPersonID(){
		return personID;
	}

	public void setPersonID(int personID){
		this.personID = personID;
	}


	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}


	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getCity(){
		return city;
	}

	public void setCity(String city){
		this.city = city;
	}
}

public class TestConnection{
		private static Test map(ResultSet resultSet) throws SQLException {
		    Test data = new Test(); 
		    data.setPersonID(resultSet.getInt("PersonID"));
		    data.setFirstName(resultSet.getString("FirstName"));
		    data.setLastName(resultSet.getString("LastName"));
		    data.setAddress(resultSet.getString("Address"));
		    data.setCity(resultSet.getString("City"));
		    return data;
		}

		public static void main(String args[]){
			try{
				MysqlConexion c = new MysqlConexion("localhost", 3306, "root", "123456", "programacion");
				c.conectar();

				ResultSet rs = c.ejecutarQuery("select * from test");

				List<Test> list = new ArrayList<Test>();
				while (rs.next()) {
        			list.add(TestConnection.map(rs));
    			}

    			//Iterar los datos....
       			for (Test t : list){
    				System.out.println(String.format("%d\t%s\t%s\t\t%s\t\t%s", t.getPersonID(), t.getFirstName(), t.getLastName(), t.getAddress(), t.getCity()));
				}
				/*
    			Iterator iter = list.iterator();
       			while (iter.hasNext()){
    				Test t = (Test)iter.next();
    			}*/
    			rs.close();

				c.ejecutarStatement("update Test set Address = 'Av. Avila Camacho' where PersonID = 11");
				c.cerrar();
			}catch(Exception e){
				System.out.println("No se pudo crear la conexión...." + e);
			}
		}
}