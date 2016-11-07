import java.util.*;
import java.io.*;



class Vehicle implements Comparable<Vehicle>
{
	private int wheels;
	private String model;

	public Vehicle(int w, String m)
	{
		wheels = w;
		model = m;
	}

	public boolean equals(Object v)
	{
		Vehicle vv = (Vehicle) v;
		return getModel().equals(vv.getModel());
	}

	public int hashCode()
	{
		return model.hashCode();
	}

	public int compareTo(Vehicle v)
	{
		return getModel().compareTo(v.getModel());
	}

	public int getWheels()
	{
		return wheels;
	}

	public String getModel()
	{
		return model;
	}

	public String toString()
	{
		return String.format("%s:%s", model, wheels);
	}

}





//----main class-------

public class VehicleTest
{
	ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
	HashSet<Vehicle> hashVehicle = new HashSet<Vehicle>();

	public void addVehicles()
	{
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String m = reader.readLine();
			int w = Integer.parseInt(reader.readLine());
			vList.add(new Vehicle(w, m));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public void sortVehicles()
	{
		Collections.sort(vList);
	}

	//inner class
	class VehicleWheel implements Comparator<Vehicle>
	{
		public int compare(Vehicle one, Vehicle two)
		{
			return one.getWheels()-two.getWheels();
		}
	}

	public void sortVehiclesByWheels()
	{
		VehicleWheel vw = new VehicleWheel();
		Collections.sort(vList, vw);
	}

	public static void main(String[] args)
	{
		VehicleTest vt = new VehicleTest();
		vt.addVehicles();
		vt.addVehicles();
		vt.addVehicles();
		vt.addVehicles();
		vt.sortVehicles();
		System.out.println(vt.vList);
		vt.sortVehiclesByWheels();
		System.out.println(vt.vList);

		vt.hashVehicle.addAll(vt.vList);
		System.out.println(vt.hashVehicle);
	}
}