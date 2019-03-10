package com.am.sample;

import java.util.Collection;
import java.util.Set;

public class IncrementedSet<E> extends ForwardSet<E> {
	
	private int addCount = 0;

	public IncrementedSet(Set<E> s) {
		super(s);
	}
	
	@Override public boolean add(E e) {
		addCount++;
		return super.add(e);
	}
	
	@Override public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}
	
	public int getCount() {
		return addCount;
	}

}
