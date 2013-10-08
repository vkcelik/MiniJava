package compiler.IR;

import java.util.LinkedList;

import compiler.Compiler;
import compiler.PrettyPrinter;
import compiler.Exceptions.ClassAlreadyDeclared;
import compiler.Exceptions.ClassErrorField;
import compiler.Exceptions.ClassErrorMethod;
import compiler.Exceptions.ClassNotFound;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.InheritanceError;
import compiler.Exceptions.TypeCheckerException;

public class MJProgram extends IR {

	private LinkedList<MJClass> classes;

	public MJProgram(LinkedList<MJClass> cdl) {
		this.classes = cdl;
	}

	public LinkedList<MJClass> getClasses() {
		return classes;
	}

	public void prettyPrint(PrettyPrinter prettyPrinter) {
		for (MJClass c : classes) {
			c.prettyPrint(prettyPrinter);
		}
	}
	
}
