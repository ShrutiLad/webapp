package com.legasis.countrydata.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Country {
    @Id
    private Integer Id;
    private String countryName;
    private String capital;
    private String updatedBy;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedOn;

    public Country() {
    }

    public Country(Integer id, String countryName, String capital, String updatedBy, Date updatedOn) {
        Id = id;
        this.countryName = countryName;
        this.capital = capital;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
