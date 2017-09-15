package org.launchcode.models;

/**
 * Created by LaunchCode
 */
public enum JobFieldType {

    EMPLOYER ("Employer"),
    LOCATION ("Location"),
    CORE_COMPETENCY ("Skill"),
    POSITION_TYPE ("Position Type"),
    ALL ("All");

    private final String name;

    JobFieldType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
//this enables the view and controller layers to easily ask for date related to the above fields
//the values EMPLOYER, LOCATION, etc take the place of the magic strings from the previous techjobs
//previously we used
//ArrayList<string> employers = JobData.findByColumnAndValue("employer","LaunchCode");
//now we can do ArrayList<JobField> employers = JobData.findByColumnValue(JobFiledType.EMPLOYER,"Launchcode");
//by using enums instead of strings we eliminate the possibility of runtime errors
//for example if we mispell employer, we wouldn't have found the error until running the code
//the methods in JObData now work by taking in a jobfieldType parameter rather than a string
//we also use the JobFiledType values to render search and list options in the view, and to collect these options
//in the controller layer
//Job someJob =JobData.findById(whatever id you are looking for) and all job data associated with it
//methods i might want to use
//Employer anEmployer = jobData.getEmployers().findById(7);
//ArrayList<Employer> allEmployers = jobData.getEmployers().findAll();