package ticTacToe.views.console;

import ticTacToe.controllers.ContinueController;
import ticTacToe.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController){
		continueController.resume(new YesNoDialog("Desea continuar")
		.read());
	}
}
