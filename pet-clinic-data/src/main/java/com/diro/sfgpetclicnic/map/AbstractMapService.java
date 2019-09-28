package com.diro.sfgpetclicnic.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.diro.sfgpetclicnic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
	protected Map<Long, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	T findByID(ID id) {
		return map.get(id);
	}

	T save(T object) {
		if (object != null) {
			if (object.getId() == null) {
				object.setId(getNextId());
			}
			map.put(object.getId(), object);
		}

		return object;
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.equals(object));
	}

	public Long getNextId() {
		Long nextId = null;
		try {
			nextId = Collections.max(map.keySet()) + 1;
		} catch (Exception ex) {
			nextId = 1l;
		}

		return nextId;
	}
}
