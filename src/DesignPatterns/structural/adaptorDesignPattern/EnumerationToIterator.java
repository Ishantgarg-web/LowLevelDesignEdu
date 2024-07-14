package DesignPatterns.structural.adaptorDesignPattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 
 * @author ishant
 * This class is responsible for converting the Enumeration to Iterator.
 */

public class EnumerationToIterator implements Iterator<Object>{
	
	private Enumeration<Object> enumeration;
	
	public EnumerationToIterator(Enumeration<Object> enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}

}
