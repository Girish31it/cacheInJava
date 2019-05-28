package com.org.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	private final int maxEntries;
	private static final int DEFAULT_INITIAL_CAPACITY = 50;
	private static final float DEFAULT_LOAD_FACTOR = 0.75f;

	public LRUCache(int maxEntries) {
		super(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR, true);
		this.maxEntries = maxEntries;
	}

	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > this.maxEntries;
	}

}
