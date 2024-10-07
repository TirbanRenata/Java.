package Homework16;

import java.util.Objects;

public class DataBaseEntities {
    public static void main(String[] args) {
        DataBaseEntities entity1 = new DataBaseEntities(1, "Entity1", 123456789L);
        DataBaseEntities entity2 = new DataBaseEntities(1, "Entity2", 123456789L);
        DataBaseEntities entity3 = new DataBaseEntities(2, "Entity1", 324563212L);

        System.out.println("Entity 1 equals Entity 2: " + entity1.equals(entity2));
        System.out.println("Entity 1 equals Entity 3: " + entity1.equals(entity3));
    }
    private int id;
    private String name;
    private long timestamp;

    public DataBaseEntities(int id, String name, long timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }
    @Override
    public boolean equals(Object o){
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof DataBaseEntities))
            return false;
        DataBaseEntities dataBaseEntities = (DataBaseEntities) o;
        return  this.id == dataBaseEntities.id ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
