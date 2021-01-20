import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashronExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		   // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        ee.eval("print('Hello Nashorn');");  
	}

}
