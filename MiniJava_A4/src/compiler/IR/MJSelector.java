package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.*;

public class MJSelector extends MJIdentifier {

	private MJIdentifier object;
	private MJIdentifier field;

	public MJSelector(MJIdentifier t, MJIdentifier field) {
		this.object = t;
		this.field = field;
	}

	public MJIdentifier getObject() {
		return object;
	}

	public MJIdentifier getField() {
		return field;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		this.object.prettyPrint(prepri);
		prepri.print(".");
		this.field.prettyPrint(prepri);
	}

}
