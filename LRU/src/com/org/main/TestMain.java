package com.org.main;

import java.util.Map;

import com.org.lru.LRUCache;

public class TestMain {

	public static void main(String[] args) {
		Map<Integer, String> lruCache = new LRUCache<>(10);

		for (int i = 0; i < 10; i++) {
			lruCache.put(i, "Person::" + i);
		}

		System.out.println("cache = " + lruCache);

		System.out.println(lruCache.get(8));
		System.out.println(lruCache.get(3));
		System.out.println(lruCache.get(2));
		System.out.println(lruCache.get(0));
		// entry 7 has moved to the end
		System.out.println("cache = " + lruCache);
		lruCache.put(50, "Person::" + 50);
		lruCache.put(51, "Person::" + 50);
		lruCache.put(52, "Person::" + 50);
		lruCache.put(53, "Person::" + 50);
		lruCache.put(54, "Person::" + 50);
		System.out.println("cache = " + lruCache);
		
	}

}
