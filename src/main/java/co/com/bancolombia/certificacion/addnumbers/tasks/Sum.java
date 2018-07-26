package co.com.bancolombia.certificacion.addnumbers.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.SumComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Sum implements Task {
	

	

	@Override
	public <T extends Actor> void performAs(T actor) {

		
		actor.attemptsTo(Enter.theValue("5").into(SumComponent.FIRST_NUMBER ) , 
				Enter.theValue("7").into(SumComponent.SECOND_NUMBER )); 
	}
	
	public static Sum theNumbers() {
		return instrumented(Sum.class);
	}

}
