package org.wso2.carbon.apimgt.api.model;

/**
 * Details about an Category.
 */
public class Category {

	/**category id */
    private int id;

    /** category Pid */
    private  int pid;

    /** category name */
    private String categoryName;
    
    private int sort;

    /** category description */
    private String description;

    /** wheather there is a api */
    private int flag;


    public Category(String name){
    	super();
    	this.categoryName = name;
    } 
    
    public int getId() {
		return id;
	}

	public int getPid() {
		return pid;
	}

	public String getCategoryName() {
		return categoryName;
	}
	
	public int getSort() {
		return sort;
	}

	public String getDescription() {
		return description;
	}

	public int getFlag() {
		return flag;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public void setSort(int sort) {
		this.sort = sort;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
    
}
