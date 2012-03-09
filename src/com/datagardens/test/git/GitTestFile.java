package com.datagardens.test.git;

public class GitTestFile {

	private String id;
	private String name;
	
	public GitTestFile(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * This is some comment
	 * @return
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * This is dev-1 branch
	 * @param id
	 */

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
