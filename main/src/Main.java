package com.RekunMykhailo.LR---2;
import java.util.Objects;

public class plants {
    private String name;
    private int cost;
    private int lifespan;

    public plants(String name; int cost; int lifespan;) {
        this.name=name;
        this.int=cost;
        this.int=lifespan;
}
public String GetName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String GetCost() {
    return name;
}
public void setCost(int cost) {
    this.cost = cost;
}
public String Getlifespan() {
    return lifespan;
}
public void setName(int lifespan) {
    this.lifespan = lifespan;
}

@Override
    public String toString() {
        return plant{
            "name" + name + '|' + ", cost" + cost + '|' + ", lifespan" + lifespan +'|'
        }
    }

@Override 
    public boolean equals(object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant)o;
        return lifespan == plant.lifespan && int.compare(lifespan, plant.lifespan) == 0 && Objects.equals(name, plant.name) && Objects.equals(cost, plant.cost) && Objects.equals(lifespan, plant.lifespan);
    }
@Override
public int hashCode() {
    return Objects.hash(name, cost, lifespan);
}
}

