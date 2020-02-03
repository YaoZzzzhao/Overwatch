package com.yaozhao.personal.model;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @JsonView(View.User.class)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sr")
    private int sr;

    @Column(name = "rank")
    private String rank;

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSr(){
        return sr;
    }
    public String getRank(){
        if(sr<1500)
            return "Bronze";
        else if(sr<2000 && sr >= 1500)
            return "Silver";
        else if(sr<2500 && sr >= 2000)
            return "Gold";
        else if(sr<3000 && sr>=2500)
            return "Platinum";
        else if(sr<3500 && sr>=3000)
            return "Diamond";
        else if(sr<4000 && sr>=3500)
            return "Master";
        else if(sr<5000 && sr>=4000)
            return "Grandmaster";
        return null;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSr(int sr){
        this.sr = sr;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

}
