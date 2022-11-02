package com.example.demo.Repo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usersCollection")
public class Data {
    @Id
    public String _id;
    public String name;
    public String id;
    public String atype;


    public Data(String _id, String name, String id, String atype) {
        this._id = _id;
        this.name = name;
        this.id = id;
        this.atype = atype;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return this.id;
    }

    public void setIdNum(String id) {
        this.id = id;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }
}