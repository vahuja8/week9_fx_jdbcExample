package application;

import com.va.week9.sql.SampleJdbcCode;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OKHandlerClass implements EventHandler<ActionEvent> {

	SampleJdbcCode obj1 = new SampleJdbcCode();
	// created object of the datbase class that has the code!!
	
	@Override
	public void handle(ActionEvent arg0) {
		
	// call the jdbc method here..  using object.method
	obj1.runJdbcCode();
	System.out.println("Running Jdbc with Fx!!!"); 
	//System.out.println("Running Jdbc with Fx!!!"); 
		
	}

}
