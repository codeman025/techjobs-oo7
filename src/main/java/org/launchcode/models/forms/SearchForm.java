package org.launchcode.models.forms;

import org.launchcode.models.JobFieldType;
//represent data from the search form, each is necessary to display and process the form
//within searchcontroller there is model binding with a searchform object to process the form
//and we pass a searchform object into the view to display to form
//
/**
 * Created by LaunchCode
 */
public class SearchForm {

    // The search options
    private JobFieldType[] fields = JobFieldType.values();

    // The selected search options
    private JobFieldType searchField = JobFieldType.ALL;

    // The search string
    private String keyword;

    public JobFieldType getSearchField() {
        return searchField;
    }

    public void setSearchField(JobFieldType searchField) {
        this.searchField = searchField;
    }

    public JobFieldType[] getFields() {
        return fields;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
