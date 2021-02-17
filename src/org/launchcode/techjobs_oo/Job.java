package org.launchcode.techjobs_oo;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString()
    {
        System.out.println();
        String temp="ID: "+getId();

        if(getName()==null && getEmployer() == null &getLocation()==null &getPositionType()==null &getCoreCompetency()==null)
        {

            return "OOPS! This job does not seem to exist.\n";
        }

        if(getName()==null) { temp+="\nName: Data not available"; }
        else { temp+="\nName: "+getName();}

        if(getEmployer().getValue()==null) { temp+="\nEmployer: Data not available"; }
        else { temp+="\nEmployer: "+getEmployer().getValue();}

        if(getLocation().getValue()==null) { temp+="\nLocation: Data not available"; }
        else { temp+="\nLocation: "+getLocation().getValue();}

        if(getPositionType().getValue()==null) { temp+="\nPosition Type: Data not available"; }
        else { temp+="\nPosition Type: "+getPositionType().getValue();}

        if(getCoreCompetency().getValue()==null) { temp+="\nCore Competency: Data not available"; }
        else { temp+="\nCore Competency: "+getCoreCompetency().getValue();}

        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return this.id == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public int getId() {
        return id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
