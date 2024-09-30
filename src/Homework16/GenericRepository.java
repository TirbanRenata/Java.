package Homework16;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GenericRepository<T> {
    private Map<String, T> storage = new HashMap<>();

    public void add(String id, T object) {
        storage.put(id, object);
    }

    public T get(String id) {
        return storage.get(id);
    }

    public void remove(String id) {
        storage.remove(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericRepository)) return false;
        GenericRepository<?> genericRepository = (GenericRepository<?>) o;
        return Objects.equals(storage, genericRepository.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storage);
    }

    @Override
    public String toString() {
        return "GenericRepository{" + "storage=" + storage + '}';
    }

    public static void main(String[] args) {
        GenericRepository<String> stringRepo = new GenericRepository<>();
        stringRepo.add("1", "Hello");
        stringRepo.add("2", "World");

        System.out.println("String Repository: " + stringRepo);
        System.out.println("Get item with ID 1: " + stringRepo.get("1"));

        GenericRepository<Integer> intRepo = new GenericRepository<>();
        intRepo.add("1", 100);
        System.out.println("Integer Repository: " + intRepo);
    }
}
