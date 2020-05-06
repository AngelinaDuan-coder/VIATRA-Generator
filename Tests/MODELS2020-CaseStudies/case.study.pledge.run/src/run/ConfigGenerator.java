package run;

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor;

public class ConfigGenerator {
	public static void main(String[] args) {
		String errorMessages = StandaloneScriptExecutor.executeScript("config/taxation.vsconfig");
		if(errorMessages!=null) {
			System.out.println(errorMessages);
		}
	}

}
