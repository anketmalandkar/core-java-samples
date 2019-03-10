package com.am.sample;

import java.util.Collection;
import java.util.HashSet;

public class IncrementalSet<E> extends HashSet<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int addCount = 0;

	public IncrementalSet() {

	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getCount() {
		return addCount;
	}

}
