package org.launchcode.models;

/**
 * Created by LaunchCode
 */
public class JobField {

    private String value;
    private int id;
    private static int nextId = 1;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String aValue) {
        this();
        value = aValue;
    }

    public boolean contains(String value) {
        return this.value.toLowerCase().contains(value.toLowerCase());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String aValue) {
        value = aValue;
    }

    public String toString() {
        return value;
    }
//set up to return the value field BECAUSE using this object in a template, or in another string context
    //like System.out.println will print the value
    //System.out.println(job.getEmployer) prints the name of the Employer suprise suprise
    //we do this because we can HAVE A SINGLE JOB type, such as web developer, which we don't need to
    //declare every single job, we call the PositionType object
    //This allows data to be updated more easily, like if seattle was renamed to Tacoma we woulnd only have
    //to change the Location object once instead of changing every job in seattle
    //
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobField jobField = (JobField) o;

        return id == jobField.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }

}
