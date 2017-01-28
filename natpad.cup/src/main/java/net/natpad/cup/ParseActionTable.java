package net.natpad.cup;

import net.natpad.cup.export.java.Emit;
import net.natpad.cup.model.bnf.BnfModel;
import net.natpad.cup.model.bnf.Production;
import net.natpad.cup.model.bnf.Terminal;
import net.natpad.cup.state.ParseAction;
import net.natpad.cup.state.ReduceAction;
import net.natpad.cup.state.StateMachine;

/**
 * This class represents the complete "action" table of the parser. It has one
 * row for each state in the parse machine, and a column for each terminal
 * symbol. Each entry in the table represents a shift, reduce, or an error.
 * 
 * @see net.natpad.cup.state.ParseAction
 * @see net.natpad.cup.ParseActionRow
 * @version last updated: 11/25/95
 * @author Scott Hudson
 */
public class ParseActionTable {

	public int warningCount = 0;
	
	/*-----------------------------------------------------------*/
	/*--- Constructor(s) ----------------------------------------*/
	/*-----------------------------------------------------------*/

	public final BnfModel model;
	
	/**
	 * Simple constructor. All terminals, non-terminals, and productions must
	 * already have been entered, and the viable prefix recognizer should have
	 * been constructed before this is called.
	 */
	public ParseActionTable(StateMachine stateMachine, BnfModel model) {
		this.model = model;
		/* determine how many states we are working with */
		_num_states = stateMachine.getStateMap().count();

		/* allocate the array and fill it in with empty rows */
		under_state = new ParseActionRow[_num_states];
		for (int i = 0; i < _num_states; i++)
			under_state[i] = new ParseActionRow(model);
	}

	/*-----------------------------------------------------------*/
	/*--- (Access to) Instance Variables ------------------------*/
	/*-----------------------------------------------------------*/

	/** How many rows/states are in the machine/table. */
	protected int _num_states;

	/** How many rows/states are in the machine/table. */
	public int num_states() {
		return _num_states;
	}

	/* . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . */

	/** Actual array of rows, one per state. */
	public ParseActionRow[] under_state;

	/*-----------------------------------------------------------*/
	/*--- General Methods ---------------------------------------*/
	/*-----------------------------------------------------------*/

	/**
	 * Check the table to ensure that all productions have been reduced. Issue a
	 * warning message (to System.err) for each production that is never
	 * reduced.
	 */
	public void checkReductions() {
		ParseAction act;

		/* tabulate reductions -- look at every table entry */
		for (int row = 0; row < num_states(); row++) {
			for (int col = 0; col < under_state[row].size(); col++) {
				/* look at the action entry to see if its a reduce */
				act = under_state[row].under_term[col];
				if (act != null && act.kind() == ParseAction.REDUCE) {
					/* tell production that we used it */
					((ReduceAction) act).reduce_with().note_reduction_use();
				}
			}
		}

		/* now go across every production and make sure we hit it */
	      for (Production prod : model.productions) {

			/* if we didn't hit it give a warning */
			if (prod.num_reductions() == 0) {
				/*
				 * count it * emit.not_reduced++;
				 * 
				 * /* give a warning if they haven't been turned off
				 */
				if (!Emit.getNowarn()) {
					System.err.println("*** Production \"" + prod.toSimpleString() + "\" never reduced");
					warningCount++;
				}
			}
		}
	}

	/*
	 * . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .*
	 * 
	 * /** Convert to a string.
	 */
	public String toString() {
		String result;
		int cnt;

		result = "-------- ACTION_TABLE --------\n";
		for (int row = 0; row < num_states(); row++) {
			result += "State [" + row + "]\n  Expect:\n";
			cnt = 0;
			for (int col = 0; col < under_state[row].size(); col++) {
				/* if the action is not an error print it */
				Terminal terminal = model.terminals.get(col);
				if (under_state[row].under_term[col].kind() != ParseAction.ERROR) {
					result += "    " + terminal.name() + " : " + under_state[row].under_term[col] + "]\n";

					/* end the line after the 2nd one */
					cnt++;
				}
			}
			/* finish the line if we haven't just done that */
			if (cnt != 0)
				result += "\n";
		}
		result += "------------------------------";

		return result;
	}

	/*-----------------------------------------------------------*/

}