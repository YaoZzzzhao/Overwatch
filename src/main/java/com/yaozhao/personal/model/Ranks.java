package com.yaozhao.personal.model;

import javax.persistence.*;
import java.util.Objects;

public class Ranks {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int rank;

    @Column(name = "id")
    private long id;

    @Column(name = "sr")
    private int sr;

    @Column(name = "name")
    private String name;

    public int getRank(){
        return rank;
    }
    public long getId(){
        return id;
    }
    public int getSr(){
        return sr;
    }
    public String getName() {
        return name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSr(int sr) {
        this.sr = sr;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ranks r = (Ranks) o;
        return rank == r.rank && id == r.id;
    }
    @Override
    public int hashCode(){return Objects.hash(rank,id);}
}
