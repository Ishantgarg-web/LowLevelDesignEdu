package DesignPatterns.structural.adaptorDesignPattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 
 * @author ishant
 * This class is behave like adaptor that takes Iterator and convert to Enumeration.
 */

public class IteratorToEnumeration implements Enumeration<Object>{
	
	private Iterator<Integer> iterator;
	
	public IteratorToEnumeration(Iterator<Integer> iterator) {
		this.iterator = iterator;
	}
	
	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		return iterator.next();
	}
	
}
