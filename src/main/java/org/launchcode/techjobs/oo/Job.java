package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //Constructor to initialize unique ID
    public Job() {
        id = nextId;
        nextId++;
    }

    //Constructor to initialize other five fields -?
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //custom equals and hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public String toString() {
        String dataNotAvailable = "Data not available";
//        String id = getId() = false ? dataNotAvailable : getId();
        String name = getName() == "" ? dataNotAvailable : getName();
        String employer = getEmployer().getValue() == "" ? dataNotAvailable : getEmployer().getValue();
        String location = getLocation().getValue() == "" ? dataNotAvailable : getLocation().getValue();
        String position = getPositionType().getValue() == "" ? dataNotAvailable : getPositionType().getValue();
        String coreCompetency = getCoreCompetency().getValue() == "" ? dataNotAvailable : getCoreCompetency().getValue();
        String result = String.format("\n" + "ID: %d" + "\n" + "Name: %s" + "\n" + "Employer: %s" + "\n" + "Location: %s" + "\n" + "Position Type: %s" + "\n" + "Core Competency: %s" + "\n", getId(), name, employer, location, position, coreCompetency);
        return result;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
